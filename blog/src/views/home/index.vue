<template>
    <div class="main">
        <div class="banner">
            <a-image :src="require('@/assets/img/banner.jpg')" fit="cover" :preview="false" width="100%" height="100%"></a-image>
            <div class="banner-title">
                <a-typography-title class="animate__animated animate__fadeInDown" :heading="1"> 山外青山楼外楼敖德萨大苏打速度</a-typography-title>
                <a-row justify="center">
                    <h2>
                        <!-- 使用span显示文字, data-text为Json格式的数组 -->
                        <span id="text" data-text='["山外青山，楼外楼。"]'></span>
                        <!-- 闪烁的光标 -->
                        <span class="mark"></span>
                    </h2>
                </a-row>
            </div>

            <div class="arrow animate__animated animate__fadeInDown animate__infinite animate__slow" @click="scroolTop">
                <span><svg-icon icon-class="down" style="width: 40px; height: 40px; transform: rotateX(180deg); cursor: pointer"></svg-icon></span>
            </div>
        </div>
        <!-- <a-row justify="space-around">
            <a-row :span="8" style="background-color: red">1123123123</a-row>
            <a-row :span="8" style="background-color: pink">123123123</a-row>
            <a-row :span="8" style="background-color: green">12312312312</a-row>
        </a-row> -->

        <div class="content">
            <a-row justify="space-around">
                <a-col flex="290px" style="background-color: red">123</a-col>
                <a-col flex="780px">
                    <div class="article-top">
                        <a-carousel
                            :style="{
                                width: '100%',
                                height: '100%',
                            }"
                            :auto-play="true"
                            :move-speed="1000"
                            animation-name="fade"
                            arrow-class="arrow"
                            indicator-type="line"
                            :default-current="1">
                            <a-carousel-item v-for="image in images" :key="image">
                                <a-image :src="image" width="100%" height="100%" fit="cover" :show-loader="true" :preview="false" style="filter: brightness(0.7)"></a-image>
                                <div class="top-msg">
                                    <div class="title">
                                        <a-row> <a-typography-title :heading="4" ellipsis style="margin-top: -5px; color: #fff"> MySQL实现了SQL标准中的四个隔离 </a-typography-title></a-row>
                                    </div>
                                    <div class="title-icon">
                                        <a-row justify="space-between" align="center">
                                            <span style="color: #f7ce68"
                                                ><svg-icon icon-class="zhiding" style="width: 16px; height: 16px; margin-bottom: 3px; color: gray"></svg-icon>&nbsp;置顶推荐</span
                                            >
                                            <span><svg-icon icon-class="hot" style="width: 16px; height: 16px; margin-bottom: 3px"></svg-icon>&nbsp;81阅读</span>
                                            <span><svg-icon icon-class="pl" style="width: 16px; height: 16px; margin-bottom: 3px"></svg-icon>&nbsp;4条评论</span>
                                            <span><svg-icon icon-class="time" style="width: 13px; height: 13px; margin-bottom: 2px"></svg-icon>&nbsp;发布于2023-02-08</span>
                                        </a-row>
                                    </div>
                                </div>
                            </a-carousel-item>
                        </a-carousel>
                    </div>
                    <div class="article">
                        <article-list-img></article-list-img>
                        <ArticleListInfo></ArticleListInfo>
                    </div>
                    <div class="article">
                        <ArticleListInfo></ArticleListInfo>
                        <article-list-img></article-list-img>
                    </div>
                </a-col>
                <a-col flex="290px" style="background-color: green">123</a-col>
            </a-row>
        </div>

        <!-- <div class="content">
            <div class="content-left">
                <div class="introduce bg-white">
                    <span>
                        <a-image :src="require('@/assets/img/head.jpg')" fit="scale-down" :show-loader="true" :preview="false" width="100%" height="100%"></a-image>
                    </span>
                    <h1 style="margin-top: 10px">Quinlan</h1>
                    <div class="left-info">
                        <div class="info-box">
                            <span>文章</span>
                            <span style="margin-top: 10px">11</span>
                        </div>
                        <div class="info-box">
                            <span>分类</span>
                            <span style="margin-top: 10px">12</span>
                        </div>
                        <div class="info-box">
                            <span>标签</span>
                            <span style="margin-top: 10px">13</span>
                        </div>
                    </div>
                    <a-button style="width: 70%; margin-top: 10px; margin-bottom: 10px; background-color: #49b1f5; color: #fff"
                        ><svg-icon icon-class="wjx" style="width: 18px; height: 18px"></svg-icon>加入书签</a-button
                    >
                    <div class="official-icon">
                        <a href=""><svg-icon icon-class="qq" style="width: 25px; height: 25px"></svg-icon></a>
                        <a href=""><svg-icon icon-class="github" style="width: 25px; height: 25px"></svg-icon></a>
                        <a href=""><svg-icon icon-class="gitee" style="width: 25px; height: 25px"></svg-icon></a>
                        <a href=""><svg-icon icon-class="weibo" style="width: 25px; height: 25px"></svg-icon></a>
                    </div>
                </div>
            </div>
            <a-row>
                <a-col :span="24">
                    <div class="notice bg-white">
                        <svg-icon icon-class="gg" style="width: 20px; height: 20px; margin-right: 5px"></svg-icon>
                        <span>公告</span>
                    </div>
                </a-col>
            </a-row>
            <div class="content-center">
                <div class="content-msg">
                    <article-list-img></article-list-img>
                    <ArticleListInfo></ArticleListInfo>
                </div>
                <div class="content-msg">
                    <ArticleListInfo></ArticleListInfo>
                    <article-list-img></article-list-img>
                </div>
            </div>
            <div class="content-right bg-white"></div>
        </div> -->
    </div>
</template>

<script lang="ts" setup>
import { type } from '@/utils/typing'

const images = [
    'https://blog.zwying.com/usr/uploads/sina/63adb5d48cc08.jpg',
    'https://blog.zwying.com/usr/uploads/sina/63adb5d26977a.jpg',
    'https://blog.zwying.com/usr/uploads/sina/63adb5d11dbcc.jpg',
]

//箭头向下滚动页面
const scroolTop = () => {
    const pageId: any = document.querySelector('.content')

    window.scrollTo({
        top: pageId.offsetTop,
        behavior: 'smooth',
    })
}

onMounted(() => {
    type()
})
</script>
<style scoped less>
.main .banner {
    /* position: fixed; */
    position: relative;
    width: 100vw;
    height: 100vh;
    max-width: 100%;
    overflow: hidden;
}
.main .banner img {
    /* position: fixed; */
    width: 100%;
    height: 100%;
}

.main .banner-title {
    position: absolute;
    user-select: none;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
}

.main .banner-title h1 {
    font-size: 40px;
    color: #fff;
}

.main .content {
    /* display: flex;
    width: 90%;
    margin: 20px auto;
    flex-direction: row;
    justify-content: space-around;
    height: auto;
    border-radius: 5px; */
    padding-top: 40px;
}

.content .article,
.content .article-top {
    display: flex;
    height: 280px;
    border-radius: 10px;
    background-color: #fff;
    overflow: hidden;
    margin-bottom: 40px;
    box-shadow: 0 1px 20px -6px rgba(0, 0, 0, 0.5);
}

.content .article {
    transition: all 0.3s ease;
    animation: hideToShow 1s ease-in-out;
}

.content .article:hover {
    box-shadow: 0 5px 10px 5px rgba(110, 110, 110, 0.4);
}

.content .article-top {
    position: relative;
}

.content .article-top .top-msg {
    position: absolute;
    width: 50%;
    left: 50%;
    top: 40%;
    margin-top: 20px;
    overflow: hidden;
    transform: translate(-50%, -50%);
}

.content .article-top .top-msg .title-icon {
    color: #fff;
    margin-top: 20px;
}
h2 {
    color: #f1f2f6;
    font-size: 22px;
    font-weight: 200;
    background: rgba(0, 0, 0, 0.5);
    padding: 10px;
    border-radius: 10px;
}

span.mark {
    border-right: 2px solid white;
    animation: blink 0.6s step-end infinite;
}

@keyframes blink {
    from,
    to {
        border-color: transparent;
    }
    50% {
        border-color: white;
    }
}

.banner .arrow {
    position: absolute;
    left: 50%;
    transform: translateX(-50%);
    bottom: 50px;
}
</style>
