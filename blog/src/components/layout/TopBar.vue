<template>
    <div class="topBar">
        <a-menu mode="horizontal" :default-selected-keys="['1']" style="background-color: transparent">
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
    </div>
</template>

<script lang="ts" setup></script>
<style scoped>
.topBar {
    width: 100%;
    --un-shadow: var(--un-shadow-inset) 0 1px 3px 0 var(--un-shadow-color, rgba(0, 0, 0, 0.1)), var(--un-shadow-inset) 0 1px 2px -1px var(--un-shadow-color, rgba(0, 0, 0, 0.1));
    box-shadow: 0 0.5rem 1rem rgb(18 38 63 / 80%);
    border: 1px solid rgba(17, 24, 39, 0.1);
    z-index: 1;
    /* background-color: red !important; */
}

.topBar i {
    vertical-align: -10%;
    margin-right: 5px;
    /* color: #fff; */
}
</style>
