<script lang="ts" setup>
import { useRouter } from 'vue-router'
const router = useRouter()
// 跳转到登录页面
function login() {
    router.push({ path: '/login' })
}
</script>

<template>
    <div class="menu animate__animated animate__fadeInDown">
        <a class="left-logo" href=""><h2>Quinlan</h2></a>

        <div class="menu-right">
            <a-menu :style="{ height: '60px' }" :default-open-keys="['0']" :default-selected-keys="['0_2']" mode="horizontal">
                <a-menu-item key="0">
                    <svg-icon icon-class="home" style="width: 20px; height: 20px; margin-bottom: 4px"></svg-icon>
                    <router-link to="/">首页</router-link>
                </a-menu-item>
                <a-menu-item key="1">
                    <svg-icon icon-class="fenlei" style="width: 22px; height: 22px; margin-bottom: 3px"></svg-icon>
                    <router-link to="classification"> 分类</router-link>
                </a-menu-item>
                <a-menu-item key="2">
                    <svg-icon icon-class="xiangce" style="width: 20px; height: 20px; margin-bottom: 4px; margin-right: 1px"></svg-icon>
                    相册
                </a-menu-item>
                <a-menu-item key="3">
                    <svg-icon icon-class="liuyan" style="width: 24px; height: 24px; margin-bottom: 2px"></svg-icon>
                    留言
                </a-menu-item>
                <a-menu-item key="4">
                    <svg-icon icon-class="link" style="width: 22px; height: 22px; margin-bottom: 3px"></svg-icon>
                    <router-link to="/friend"> 友联</router-link>
                </a-menu-item>
                <a-menu-item key="5">
                    <svg-icon icon-class="about" style="width: 22px; height: 22px; margin-bottom: 2px"></svg-icon>
                    关于
                </a-menu-item>
                <a-menu-item key="6">
                    <svg-icon icon-class="search" style="width: 18px; height: 18px; margin-top: -1px; margin-right: 3px"></svg-icon>
                    搜索
                </a-menu-item>
                <a-sub-menu key="7">
                    <template #icon>
                        <a-avatar style="margin-left: 12px" :size="32"><img alt="avatar" :src="require('@/assets/img/head.jpg')" /> </a-avatar>
                    </template>

                    <a-menu-item key="1_0" @click="login">
                        <svg-icon icon-class="login" style="width: 18px; height: 18px; margin-top: 0px; margin-right: 3px"></svg-icon>
                        登录
                    </a-menu-item>
                </a-sub-menu>
            </a-menu>
        </div>
    </div>
</template>

<style scoped>
.menu {
    /* display: flex;
  justify-content: space-around; */
    width: 100%;
    position: absolute;
    --un-shadow: var(--un-shadow-inset) 0 1px 3px 0 var(--un-shadow-color, rgba(0, 0, 0, 0.1)), var(--un-shadow-inset) 0 1px 2px -1px var(--un-shadow-color, rgba(0, 0, 0, 0.1));
    box-shadow: 0 0.5rem 1rem rgb(18 38 63 / 80%);
    border: 1px solid rgba(17, 24, 39, 0.1);
    z-index: 2;
}

.left-logo {
    position: absolute;
    color: #fff;
    left: 20px;
}

.center-logo {
    position: absolute;
    color: #fff;
    left: 50%;
    border-radius: 50%;
    transform: translateX(-50%);
}

.m0 {
    margin-left: 0;
}

.left-bar {
    display: flex;
    flex-direction: column;
    align-items: center;
}

.left-bar .head-img {
    width: 110px;
    height: 110px;
    margin-top: 20px;
    border-radius: 50%;
    overflow: hidden;
    text-align: center;
}

.left-bar .label {
    display: flex;
    margin-top: 20px;
    width: 90%;
    justify-content: space-around;
    align-items: center;
}

.left-bar .label .label-box {
    display: flex;
    flex-direction: column;
    align-items: center;
}
</style>
