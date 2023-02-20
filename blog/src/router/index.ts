import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'

const routes: Array<RouteRecordRaw> = [
    {
        path: '/',
        name: 'Home',
        component: () => import('../views/home/index.vue'),
    },
    {
        path: '/user',
        name: '登录注册页',
        component: () => import('../views/user/index.vue'),
    },
]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

export default router
