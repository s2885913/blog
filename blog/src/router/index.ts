/*
 * @Author: 碎觉
 * @Date: 2023-02-20 10:55:37
 * @LastEditTime: 2023-02-20 11:06:16
 * @Description:
 */
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
        name: 'login',
        path: '/login',
        component: () => import('@/views/login/index.vue'),
    },
]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

export default router
