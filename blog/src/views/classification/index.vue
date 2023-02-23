<!--
 * @Author: 碎觉
 * @Date: 2023-02-20 11:04:27
 * @LastEditTime: 2023-02-20 14:47:32
 * @Description: 
-->
<script setup lang="ts">
import { reactive } from 'vue'
import ArticleListImg from '@/components/layout/ArticleListImg.vue'
import ArticleListInfo from '@/components/layout/ArticleListInfo.vue'

// 文章请求数据--这个是模拟数据
const articleContent = reactive([{ id: 0 }, { id: 1 }, { id: 2 }])
</script>
<template>
    <div class="theContainer">
        <!-- <a-layout style="height: 100vh"> -->
        <a-layout-header>
            <div class="header">
                <h1>梦违科学世纪</h1>
                <h3>是幻想吗，是空中楼阁吗；在黎明前，这场梦，蝴蝶之梦。</h3>
            </div>
        </a-layout-header>
        <a-layout-content>
            <div class="main">
                <!-- 放大动画 start -->
                <div class="shadow-box">
                    <div class="myTag">
                        <span>🔖 被偷走的那几年 3</span>
                    </div>
                </div>
                <!-- 放大动画 end -->

                <!-- 文章 start -->
                <div class="theArticle">
                    <div class="theArticle-first">
                        <svg data-v-74854f6d="" viewBox="0 0 1024 1024" width="20" height="20" style="vertical-align: -2px">
                            <path
                                data-v-74854f6d=""
                                d="M224.2 472.3c-13-5.7-3.7-23.5 8.2-19 91 34 146.8 108.7 182.4 138.5 5.6 4.7 14 2.9 17.3-3.5 16.8-32 45.8-113.7-57.1-168.6-87.3-46.5-188-53.6-247.3-82.2-14.5-7-31.1 4.6-29.9 20.7 5 69.7 28.9 124.7 62.3 181.5 67.3 114.3 140.6 132.9 216.6 104 2.2-0.9 4.5-1.8 7-3 7-3.4 8.3-12.9 2.5-18.1 0.1 0-45.7-69.3-162-150.3z"
                                fill="#FFD401"></path>
                            <path
                                data-v-74854f6d=""
                                d="M282.7 849.9c79.5-137 172.4-263.1 385.4-401.3 9.8-6.4 2.1-21.5-8.9-17.4C497.7 492.8 429.7 585 373.3 640.8c-8.7 8.7-23.4 6.3-29.1-4.6-27.2-51.8-69.5-174.1 97.3-263.1 147.7-78.8 319.9-91.4 429.7-93.3 18.9-0.3 31.5 19.4 23.3 36.4C863.7 380 842.6 478 789.9 567.6 680.8 753.1 545.5 766.7 422.2 719.8c-8.8-3.4-18.8-0.2-24 7.7-16.6 25.2-50.3 80.1-58.7 122.4-11.4 56.8-82.2 43.9-56.8 0z"
                                fill="#8BC03C"></path>
                            <path
                                data-v-74854f6d=""
                                d="M375 419.6c-30.1 28.2-45.8 57.7-52.4 86.1 40.6 32.4 70.2 67.7 92.1 85.9 1.2 1 2.5 1.6 3.9 2.1 6.5-6.7 13.3-13.7 20.4-20.7 15.2-37.9 25.3-105.7-64-153.4zM318.8 548.2c1.6 36.1 14.7 67.6 25.5 88.1 5.7 10.9 20.3 13.3 29.1 4.6 4.9-4.9 10-10 15.1-15.4-0.6-1-1.3-2-2.2-2.8 0-0.1-20.1-30.5-67.5-74.5z"
                                fill="#8BA000"></path>
                        </svg>
                        发现
                    </div>
                    <div v-for="(item, index) in articleContent" :key="item.id" class="theArticleItem">
                        <template v-if="index === 0 || index % 2 == 0">
                            <ArticleListInfo></ArticleListInfo>
                            <ArticleListImg></ArticleListImg>
                        </template>
                        <template v-else>
                            <ArticleListInfo></ArticleListInfo>
                            <ArticleListImg></ArticleListImg>
                        </template>
                    </div>

                    <!--到底啦文字 start-->
                    <div class="theArticleEnd">
                        <span> ~~到底啦~~ </span>
                    </div>
                    <!--到底啦文字 end-->
                </div>
                <!-- 文章 end -->
            </div>
        </a-layout-content>
        <!-- </a-layout> -->
    </div>
</template>

<style scoped>
.layout-demo :deep(.arco-layout-header),
.layout-demo :deep(.arco-layout-footer),
.layout-demo :deep(.arco-layout-content) {
    display: flex;
    flex-direction: column;
    justify-content: center;
    font-size: 16px;
    font-stretch: condensed;
    text-align: center;
}

.layout-demo :deep(.arco-layout-header),
.layout-demo :deep(.arco-layout-footer) {
    height: 64px;
    background-color: var(--color-primary-light-4);
}

.layout-demo :deep(.arco-layout-content) {
    background-color: rgb(var(--arcoblue-6));
}

.header {
    width: 100%;
    height: 279px;
    display: flex;
    justify-content: center;
    align-items: center;
    color: white;
    flex-direction: column;
    background-image: url('../../assets/img/classification/headerBackground.png');
    background-repeat: no-repeat;
    background-size: cover;
    background-position: 0 38%;
}

.main {
    padding-top: 40px;
}

.shadow-box {
    width: 70%;
    max-width: 780px;
    height: 101px;
    margin: 0 auto;
    padding: 20px;
    border-radius: 10px;
    display: flex;
    flex-wrap: wrap;
    box-shadow: 0 1px 20px -6px rgba(0, 0, 0, 0.5);
    transition: all 0.3s ease;
}

.myTag {
    background: rgb(131, 123, 199);
    margin: 12px;
    cursor: pointer;
    color: white;
    border-radius: 5px;
    padding: 8px;
    animation: scale 1.5s ease-in-out infinite;
}

.myTag:hover {
    background: linear-gradient(90deg, #ff4b2b, #ff416c);
}

.theArticle {
    width: 70%;
    max-width: 780px;
    margin: 40px auto;
    min-height: 600px;
}

.theArticle-first {
    width: 100%;
    color: var(--greyFont);
    border-bottom: 1px dashed var(--translucent);
    padding-bottom: 5px;
    margin-bottom: 50px;
}

.theArticleItem {
    height: 300px;
    background-color: white;
    display: flex;
    box-shadow: 0 1px 20px -6px var(--borderColor);
    transition: all 0.3s ease;
    user-select: none;
    cursor: pointer;
    overflow: hidden;
    border-radius: 10px;
    margin-bottom: 40px;
}

.theArticleEnd {
    text-align: center;
}

@keyframes scale {
    0% {
        transform: scale(1);
    }
    50% {
        transform: scale(1.2);
    }
    100% {
        transform: scale(1);
    }
}
</style>
