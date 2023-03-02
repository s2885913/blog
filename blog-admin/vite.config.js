import { defineConfig } from 'vite';

export default defineConfig({
  optimizeDeps: {
    include: ['@kangc/v-md-editor/lib/theme/vuepress.js'],
  },
});
