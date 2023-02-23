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
                        <svg-icon icon-class="greenery" style="width: 20px; height: 20px; margin-bottom: 4px"></svg-icon>
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
