<template>
    <!-- <TopBar></TopBar> -->
    <div class="main">
        <div class="banner">
            <a-image :src="require('@/assets/img/banner.jpg')" fit="cover" :preview="false" width="100%" height="100%"></a-image>
            <div class="banner-title">
                <a-typography-title class="animate__animated animate__fadeInDown" :heading="1"> 山外青山楼外楼,西湖歌舞几时休？</a-typography-title>
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

        <div class="content">
            <a-row style="display: flex; justify-content: space-evenly">
                <a-col flex="290px" style="padding-left: 40px">
                    <div class="content-left">
                        <span>
                            <a-image :src="require('@/assets/img/head.jpg')" fit="cover" :preview="false" width="100%" height="100%"></a-image>
                        </span>
                        <div class="rnname">Quinlan</div>
                        <div class="left-info">
                            <a href="">
                                <div class="info-box">
                                    <span>文章</span>
                                    <span style="margin-top: 10px">11</span>
                                </div>
                            </a>
                            <a href="">
                                <div class="info-box">
                                    <span>分类</span>
                                    <span style="margin-top: 10px">12</span>
                                </div>
                            </a>
                            <a href="">
                                <div class="info-box">
                                    <span>标签</span>
                                    <span style="margin-top: 10px">13</span>
                                </div>
                            </a>
                        </div>
                        <a-button><svg-icon icon-class="wjx" style="width: 18px; height: 18px"></svg-icon>加入书签</a-button>
                    </div>
                    <div class="content-left">
                        <span>
                            <a-image :src="require('@/assets/img/head.jpg')" fit="cover" :preview="false" width="100%" height="100%"></a-image>
                        </span>
                        <div class="rnname">Quinlan</div>
                        <div class="left-info">
                            <a href="">
                                <div class="info-box">
                                    <span>文章</span>
                                    <span style="margin-top: 10px">11</span>
                                </div>
                            </a>
                            <a href="">
                                <div class="info-box">
                                    <span>分类</span>
                                    <span style="margin-top: 10px">12</span>
                                </div>
                            </a>
                            <a href="">
                                <div class="info-box">
                                    <span>标签</span>
                                    <span style="margin-top: 10px">13</span>
                                </div>
                            </a>
                        </div>
                        <a-button style="width: 70%; margin-top: 10px; margin-bottom: 10px; background-color: #49b1f5; color: #fff; border-radius: 1rem; height: 35px; margin-bottom: 20px"
                            ><svg-icon icon-class="wjx" style="width: 18px; height: 18px"></svg-icon>加入书签</a-button
                        >
                    </div>
                </a-col>
                <a-col flex="780px">
                    <div class="notice">
                        <a-row
                            ><div class="notice-box">
                                <span><svg-icon icon-class="tongzhi" style="width: 20px; height: 20px; margin-right: 5px"></svg-icon></span>
                                <span>公告公告公告公告公告公告公告公告公告公告公告公告公告公告公告公告公告公告</span>
                            </div></a-row
                        >
                    </div>
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
            </a-row>
        </div>
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
    width: 90%;
    margin: 0 auto;
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
    transition: all 0.3s ease;
    box-shadow: 0 1px 20px -6px rgba(0, 0, 0, 0.5);
}

.content .article-top:hover {
    box-shadow: 0 5px 10px 5px rgba(110, 110, 110, 0.4);
}

.content .article {
    transition: all 0.3s ease;
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

.content-left {
    display: flex;
    box-shadow: 0 1px 20px -6px rgba(0, 0, 0, 0.5);
    border-radius: 10px;
    flex-direction: column;
    align-items: center;
    margin-bottom: 40px;
    transition: all 0.3s ease;
    /* background: linear-gradient(-45deg, #eccec5, #a3e9eb, #bdbdf0); */
}

.content-left:hover {
    box-shadow: 0 5px 10px 5px rgba(110, 110, 110, 0.4);
}

.content-left > span {
    width: 120px;
    height: 120px;
    overflow: hidden;
    border-radius: 50%;
    margin-top: 20px;
}

.content-left .rnname {
    font-size: 30px;
    font-weight: 700;
    margin: 20px 0;
}

.content-left .left-info {
    display: flex;
    width: 70%;
    font-size: 16px;
    flex-direction: row;
    justify-content: space-between;
    margin-bottom: 5px;
}

.content-left .left-info .info-box {
    display: flex;
    flex-direction: column;
    align-items: center;
}

.arco-btn-size-medium {
    width: 70%;
    margin-top: 10px;
    margin-bottom: 10px;
    background-color: #39c5bb !important;
    color: #fff !important;
    border-radius: 1rem;
    height: 35px;
    margin-bottom: 20px;
    z-index: 1;
}

.arco-btn-size-medium::before {
    background: rgb(20, 138, 235);
    position: absolute;
    top: -1px;
    right: -1px;
    bottom: -1px;
    left: -1px;
    content: '';
    transform: scaleX(0);
    transform-origin: 0;
    transition: transform 0.5s ease-out;
    transition-timing-function: cubic-bezier(0.45, 1.64, 0.47, 0.66);
    border-radius: 1rem;
    z-index: -1;
}

.arco-btn-size-medium:hover::before {
    transform: scaleX(1);
}

.content .notice-box {
    display: flex;
    align-items: center;
    width: 100%;
    height: 40px;
    border-radius: 10px;
    margin-bottom: 10px;
    box-shadow: 0 1px 20px -6px rgba(0, 0, 0, 0.5);
}
.content .notice-box span:first-child {
    padding-left: 5px;
}

.content .notice-box span {
    font-size: 16px;
}
</style>
