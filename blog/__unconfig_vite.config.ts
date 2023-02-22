
let __unconfig_data;
let __unconfig_stub = function (data = {}) { __unconfig_data = data };
__unconfig_stub.default = (data = {}) => { __unconfig_data = data };
import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import AutoImport from 'unplugin-auto-import/vite'
import Components from 'unplugin-vue-components/vite'
import { ArcoResolver } from 'unplugin-vue-components/resolvers'
import eslintPlugin from 'vite-plugin-eslint'
const Unocss = __unconfig_stub;
import { presetUno, presetAttributify } from 'unocss'
import UnocssIcons from '@unocss/preset-icons'
import { createSvgIconsPlugin } from 'vite-plugin-svg-icons'
import { resolve } from 'path'
// https://vitejs.dev/config/
const __unconfig_default =  defineConfig({
    server: {
        host: '0.0.0.0',
        port: 5174,
    },
    plugins: [
        createSvgIconsPlugin({
            // 配置你存放 svg 图标的目录
            iconDirs: [resolve(process.cwd(), './src/assets/icons/svg')], //例如：src/images/svg
            // 定义 symbolId 格式
            symbolId: 'icon-[dir]-[name]',
        }),
        vue(),
        Unocss({
            // 使用Unocss
            presets: [
                presetUno(),
                presetAttributify(),
                UnocssIcons({
                    // 其他选项
                    prefix: 'i-',
                    extraProperties: {
                        display: 'inline-block',
                    },
                }),
            ],
            rules: [],
            //自定义组合样式
            shortcuts: {
                topBar: ['fixed', 'b-red', 'w-auto', 'border', 'b-red'],
            },
        }),
        eslintPlugin({
            include: ['src/**/*.ts', 'src/**/*.vue', 'src/*.ts', 'src/*.vue'],
        }),
        AutoImport({
            dirs: ['./src/utils'],
            resolvers: [ArcoResolver()],
            imports: ['vue', 'vue-router', 'pinia', 'vue-i18n', '@vueuse/head', '@vueuse/core'],
            eslintrc: {
                enabled: false, // 默认false, true启用。生成一次就可以，避免每次工程启动都生成
            },
            dts: './auto-import.d.ts',
        }),
        Components({
            resolvers: [
                ArcoResolver({
                    sideEffect: true,
                }),
            ],
            dirs: ['src/components', 'src/views'],
        }),
    ],
    resolve: {
        // 配置路径别名
        alias: {
            '@': resolve(__dirname, 'src'),
        },
    },
})

if (typeof __unconfig_default === "function") __unconfig_default(...[{"command":"serve","mode":"development"}]);export default __unconfig_data;