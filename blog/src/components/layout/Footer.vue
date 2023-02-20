<!--
 * @Author: 碎觉
 * @Date: 2023-02-20 23:45:10
 * @LastEditTime: 2023-02-20 23:51:38
 * @Description: 
-->
<template>
    <!-- <a-layout-footer> -->
    <div class="myFooter">
        <div class="title">云想衣裳花想容， 春风拂槛露华浓。</div>
    </div>
    <!-- </a-layout-footer> -->
</template>

<script lang="ts" setup></script>
<style scoped>
.myFooter {
    width: 100%;
    height: 65.5px;
    border-radius: 1.5rem 1.5rem 0 0;
    background: var(--gradientBG);
    text-align: center;
    line-height: 65.5px;
    color: var(--white);
    background-size: 300% 300%;
    -webkit-animation: gradientBG 10s ease infinite;
    animation: gradientBG 10s ease infinite;
}

@keyframes gradientBG {
    0% {
        background-position: 0 50%;
    }
    50% {
        background-position: 100% 50%;
    }
    100% {
        background-position: 0 50%;
    }
}
</style>
