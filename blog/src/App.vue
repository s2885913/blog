<script setup lang="ts">
import TopBar from '@/components/layout/TopBar.vue'
</script>
<template>
    <div class="thContainer">
        <TopBar></TopBar>
        <router-view></router-view>
    </div>
</template>
<style>
@import url('@/assets/css/var.css');
body {
    overflow-x: hidden !important;
}
.thContainer {
    background-image: linear-gradient(to top, #a8edea 0%, #fed6e3 100%);
}
</style>
