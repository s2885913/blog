<template>
    <div class="topBar">
        <a-menu mode="horizontal" :default-selected-keys="['1']" style="background-color: transparent">
            <a-menu-item key="0" :style="{ padding: 0, marginRight: '38px', height: '60px' }" disabled>
                <h2>Quinlan</h2>
            </a-menu-item>
            <a-menu-item key="1"><icon-home style="color: #fff; font-size: 18px; margin-right: 3px; vertical-align: text-top" />首页</a-menu-item>
            <a-menu-item key="2"><icon-compass style="color: #fff; font-size: 20px; margin-right: 3px; vertical-align: text-top" />发现</a-menu-item>
            <a-menu-item key="3"><i class="i-icon-park-solid-game-two text-4"></i>娱乐</a-menu-item>
            <a-menu-item key="4"><i class="i-akar-icons-link-chain text-4"></i>友联</a-menu-item>
            <a-menu-item key="5"><i class="i-wpf-paper-plane text-4"></i>关于</a-menu-item>
            <a-menu-item key="6"><i class="i-wpf-message-outline text-4"></i>留言</a-menu-item>
            <a-menu-item key="7"><i class="i-fluent-search-12-regular text-4"></i>搜索</a-menu-item>
            <a-menu-item key="7"><i class="i-octicon-people-24 text-4"></i>登录</a-menu-item>
        </a-menu>
    </div>
</template>

<script lang="ts" setup></script>
<style scoped>
.topBar {
    width: 100%;
    --un-shadow: var(--un-shadow-inset) 0 1px 3px 0 var(--un-shadow-color, rgba(0, 0, 0, 0.1)), var(--un-shadow-inset) 0 1px 2px -1px var(--un-shadow-color, rgba(0, 0, 0, 0.1));
    box-shadow: var(--un-ring-offset-shadow), var(--un-ring-shadow), var(--un-shadow);
    z-index: 1;
    /* background-color: red !important; */
}

.topBar i {
    vertical-align: -10%;
    margin-right: 5px;
    /* color: #fff; */
}
</style>
