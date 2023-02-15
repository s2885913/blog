<template>
    <!-- <div class="topBar">
        <a-menu mode="horizontal" :default-selected-keys="['1']" style="background-color: transparent" breakpoint="md">
            <a-menu-item key="0" :style="{ padding: 0, marginRight: '38px', height: '60px' }" disabled>
                <h2>Quinlan</h2>
            </a-menu-item>
            <a-menu-item key="1"><svg-icon icon-class="home" style="width: 20px; height: 20px; margin-bottom: 2px"></svg-icon>首页</a-menu-item>
            <a-menu-item key="2"><svg-icon icon-class="find" style="width: 24px; height: 24px; margin-bottom: 2px"></svg-icon>发现</a-menu-item>
            <a-menu-item key="3"><svg-icon icon-class="play" style="width: 15px; height: 15px; margin-bottom: 2px; margin-right: 3px"></svg-icon>娱乐</a-menu-item>
            <a-menu-item key="4"><svg-icon icon-class="link" style="width: 22px; height: 22px; margin-bottom: 2px"></svg-icon>友联</a-menu-item>
            <a-menu-item key="5"><svg-icon icon-class="about" style="width: 20px; height: 20px; margin-top: 0px"></svg-icon>关于</a-menu-item>
            <a-menu-item key="6"><svg-icon icon-class="liuyan" style="width: 22px; height: 22px; margin-bottom: 2px"></svg-icon>留言</a-menu-item>
            <a-menu-item key="7"><svg-icon icon-class="search" style="width: 18px; height: 18px; margin-top: 0px; margin-right: 3px"></svg-icon>搜索</a-menu-item>
            <a-menu-item key=""><svg-icon icon-class="login" style="width: 20px; height: 20px; margin-bottom: 2px"></svg-icon>登录</a-menu-item>
        </a-menu>
    </div> -->
    <div class="menu">
        <!-- <a-drawer :width="250" :visible="_this.drawerVisible" unmount-on-close placement="left" :mask="true" :closable="false" :esc-to-close="true" :header="false" :footer="false">
            <div class="left-bar">
                <div class="head-img">
                    <a-image :src="require('@/assets/img/head.jpg')" fit="scale-down" width="100%" height="100%"></a-image>
                </div>
                <div class="label">
                    <div class="label-box">
                        <a-typography-title :heading="5">文章</a-typography-title>
                        <a-typography-title :heading="5">11</a-typography-title>
                    </div>
                    <div class="label-box">
                        <a-typography-title :heading="5">分类</a-typography-title>
                        <a-typography-title :heading="5">12</a-typography-title>
                    </div>
                    <div class="label-box">
                        <a-typography-title :heading="5">标签</a-typography-title>
                        <a-typography-title :heading="5">14</a-typography-title>
                    </div>
                </div>
            </div>
        </a-drawer> -->
        <a :class="logoClass" href=""><h2>Quinlan</h2></a>
        <div class="left-icon" href=""><svg-icon icon-class="list" style="width: 24px; height: 24px; color: #fff"></svg-icon></div>
        <a-menu
            class="menuClass"
            :style="{ width: 'auto', height: '60px', marginLeft: barClass }"
            :default-open-keys="['0']"
            :default-selected-keys="['0_2']"
            show-collapse-button
            breakpoint="md"
            mode="horizontal"
            @collapse="onCollapse">
            <a-menu-item key="0"><svg-icon icon-class="home" style="width: 20px; height: 20px; margin-bottom: 2px"></svg-icon>首页</a-menu-item>
            <a-sub-menu key="1">
                <template #title><svg-icon icon-class="find" style="width: 24px; height: 24px; margin-bottom: 3px"></svg-icon>发现</template>
                <a-menu-item key="0_0">Menu 1</a-menu-item>
                <a-menu-item key="0_1">Menu 2</a-menu-item>
                <a-menu-item key="0_2">Menu 3</a-menu-item>
                <a-menu-item key="0_3">Menu 4</a-menu-item>
            </a-sub-menu>
            <a-sub-menu key="2">
                <template #title><svg-icon icon-class="play" style="width: 15px; height: 15px; margin-bottom: 2px; margin-right: 3px"></svg-icon>娱乐</template>
                <a-menu-item key="1_0">Menu 1</a-menu-item>
                <a-menu-item key="1_1">Menu 2</a-menu-item>
                <a-menu-item key="1_2">Menu 3</a-menu-item>
            </a-sub-menu>
            <a-sub-menu key="3">
                <template #title><svg-icon icon-class="about" style="width: 20px; height: 20px; margin-top: 0px"></svg-icon>关于</template>
                <a-menu-item key="2_0">Menu 1</a-menu-item>
                <a-menu-item key="2_1">Menu 2</a-menu-item>
            </a-sub-menu>
            <a-menu-item key="4"><svg-icon icon-class="liuyan" style="width: 22px; height: 22px; margin-bottom: 2px"></svg-icon>留言</a-menu-item>
            <a-menu-item key="5"><svg-icon icon-class="link" style="width: 22px; height: 22px; margin-bottom: 2px"></svg-icon>友联</a-menu-item>
            <a-menu-item key="6"><svg-icon icon-class="search" style="width: 18px; height: 18px; margin-top: 0px; margin-right: 3px"></svg-icon>搜索</a-menu-item>
            <a-menu-item key="7"><svg-icon icon-class="login" style="width: 20px; height: 20px; margin-bottom: 2px"></svg-icon>登录</a-menu-item>
        </a-menu>
    </div>
</template>

<script lang="ts" setup>
import { TopbarInterface } from './type'

const _this = reactive<TopbarInterface>({
    drawerVisible: false,
})
const logoClass = ref<string>('left-logo')
const barClass = ref<string>('100px')
//导航栏收缩事件
const onCollapse = (a: boolean) => {
    a === true ? (logoClass.value = 'center-logo') : (logoClass.value = 'left-logo')
    a === true ? (barClass.value = '0px') : (barClass.value = '100px')
}
</script>
<style scoped>
.menu {
    width: 100%;
    position: absolute;
    --un-shadow: var(--un-shadow-inset) 0 1px 3px 0 var(--un-shadow-color, rgba(0, 0, 0, 0.1)), var(--un-shadow-inset) 0 1px 2px -1px var(--un-shadow-color, rgba(0, 0, 0, 0.1));
    box-shadow: 0 0.5rem 1rem rgb(18 38 63 / 80%);
    border: 1px solid rgba(17, 24, 39, 0.1);
    z-index: 1;
}

.left-logo {
    position: absolute;
    color: #fff;
    left: 20px;
}

.left-icon {
    position: absolute;
    color: #fff;
    top: 15px;
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

.menuClass {
    display: none;
}
</style>
