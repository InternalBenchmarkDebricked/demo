import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import htmlPurge from './src/vite-plugin-purgecss.ts'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [
    vue(),
    htmlPurge({ ...options })
  ]
})
