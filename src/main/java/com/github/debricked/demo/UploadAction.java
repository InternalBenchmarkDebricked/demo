    package com.example;

    import java.io.File;
    import com.opensymphony.xwork2.ActionSupport;

    public UploadAction extends ActionSupport {
       private File file;
       private String contentType;
       private String filename;

       @StrutsParameter
       public void setUpload(File file) {
          this.file = file;
       }

       @StrutsParameter
       public void setUploadContentType(String contentType) {
          this.contentType = contentType;
       }

       @StrutsParameter
       public void setUploadFileName(String filename) {
          this.filename = filename;
       }

       public String execute() {
          //...
          return SUCCESS;
       }
  }
