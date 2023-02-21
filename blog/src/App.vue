<!--
 * @Author: 碎觉
 * @Date: 2023-02-20 10:55:37
 * @LastEditTime: 2023-02-20 14:44:24
 * @Description: 
-->
<script setup lang="ts">
import TopBar from '@/components/layout/TopBar.vue'
import Footer from '@/components/layout/Footer.vue'
</script>
<template>
    <div class="thContainer">
        <TopBar></TopBar>
        <router-view></router-view>
        <Footer></Footer>
    </div>
</template>
<style>
@import '@/assets/css/var.css';

.thContainer {
    background-image: linear-gradient(to top, #a8edea 0%, #fed6e3 100%);
}
</style>
