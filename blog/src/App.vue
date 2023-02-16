<script setup lang="ts">
import { useDark, useToggle } from '@vueuse/core'

const tt = () => {
    document.body.setAttribute('arco-theme', 'dark')
}
</script>

<template>
    <div>
        <!-- 顶部导航栏 -->
        <TopBar></TopBar>
        <!-- content -->
        <Home></Home>
        <a-button @click="tt">123</a-button>
    </div>
</template>
<style scoped></style>
