import { createApp } from 'vue'
import ArcoVue from '@arco-design/web-vue'
// // 额外引入图标库
import ArcoVueIcon from '@arco-design/web-vue/es/icon'
import App from './App.vue'
import router from './router/index'
import '@arco-design/web-vue/dist/arco.css'
import './style.css'
import 'uno.css'
import 'animate.css'
import './assets/font/font.css'
//在main.ts中
import 'virtual:svg-icons-register'
import svgIcon from './components/icons/SvgIcon.vue'

const app = createApp(App)
// <<<<<<< HEAD
// app.use(plugins)
// =======
//
// >>>>>>> 57a5638b5ea21e9e6ca715d8bda15ce30d553ac6
app.use(router)
app.use(ArcoVue)
app.use(ArcoVueIcon)
app.component('SvgIcon', svgIcon)
app.mount('#app')
