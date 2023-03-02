import { createRouter, createWebHashHistory, RouteRecordRaw } from 'vue-router'

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
    {
        name: 'classification',
        path: '/classification',
        component: () => import('@/views/classification/index.vue'),
    },
    {
        name: 'friend',
        path: '/friend',
        component: () => import('@/views/friend/index.vue'),
    },
    {
        name: 'article',
        path: '/article',
        component: () => import('@/views/article/index.vue'),
    },
    {
        name: 'picture',
        path: '/picture',
        component: () => import('@/views/picture/index.vue'),
    },
    {
        name: 'login',
        path: '/login',
        component: () => import('@/views/login/index.vue'),
    },
]

const router = createRouter({
    history: createWebHashHistory(),
    routes,
})

export default router
