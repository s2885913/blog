import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import AutoImport from 'unplugin-auto-import/vite'
import Components from 'unplugin-vue-components/vite'
import { ArcoResolver } from 'unplugin-vue-components/resolvers'
import eslintPlugin from 'vite-plugin-eslint'
import Unocss from 'unocss/vite'
import { presetUno, presetAttributify } from 'unocss'
import UnocssIcons from '@unocss/preset-icons'

// https://vitejs.dev/config/
export default defineConfig({
    plugins: [
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
            resolvers: [ArcoResolver()],
            imports: ['vue', 'vue-router', 'pinia'],
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
            '@': '/src',
        },
    },
})
