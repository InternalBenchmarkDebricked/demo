package com.github.debricked.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

@RestController
public class DemoController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	public void printDebrickedTitles() {
		Document doc = Jsoup.connect("https://debricked.com/").get();
	        log(doc.title());
	
	        Elements newsHeadlines = doc.select("#mp-itn b a");
	        for (Element headline : newsHeadlines) {
	            log("%s\n\t%s", headline.attr("title"), headline.absUrl("href"));
	        }
	}

	private static void log(String msg, String... vals) {
		System.out.println(String.format(msg, (Object[]) vals));
    	}
}
