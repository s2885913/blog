<template>
    <div class="main">
        <div class="banner">
            <a-image :src="require('@/assets/img/banner.jpg')" fit="cover" :show-loader="true" :preview="false" width="100%" height="100%"></a-image>
            <div class="banner-title">
                <h1>123123</h1>
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
                            show-arrow="hover"
                            arrow-class="arrow"
                            indicator-type="line"
                            :default-current="1"
                            @change="handleChange">
                            <a-carousel-item v-for="image in images" :key="image">
                                <a-image :src="image" width="100%" height="100%" fit="cover" :show-loader="true" :preview="false"></a-image>
                            </a-carousel-item>
                        </a-carousel>
                    </div>
                    <div class="article">
                        <article-list-img></article-list-img>
                        <ArticleListInfo></ArticleListInfo>
                    </div>
                    <div class="article">
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
const handleChange = (value: any) => {
    console.log(value)
}

const images = [
    'https://blog.zwying.com/usr/uploads/sina/63adb5d48cc08.jpg',
    'https://p1-arco.byteimg.com/tos-cn-i-uwbnlip3yd/6480dbc69be1b5de95010289787d64f1.png~tplv-uwbnlip3yd-webp.webp',
    'https://p1-arco.byteimg.com/tos-cn-i-uwbnlip3yd/0265a04fddbd77a19602a15d9d55d797.png~tplv-uwbnlip3yd-webp.webp',
]
</script>
<style scoped>
::deep(.arco-carousel-arrow > div) {
    background-color: red;
}
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
    margin-top: 20px;
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

.content .article-top {
    position: relative;
}

.main .content .content-left {
    display: flex;
    flex-direction: column;
}

.main .content .content-left .introduce,
.main .content .content-right {
    width: 290px;
    margin-top: 60px;
    border-radius: 10px;
    box-shadow: 0 1px 20px -6px rgba(0, 0, 0, 0.5);
}

.main .content .content-left .introduce {
    display: flex;
    height: auto;
    flex-direction: column;
    align-items: center;
    /* background: linear-gradient(-45deg, #e8d8b9, #eccec5, #a3e9eb, #bdbdf0, #eec1ea); */
}

.main .content .content-left .introduce > span {
    width: 120px;
    height: 120px;
    border-radius: 50%;
    margin-top: 20px;
    overflow: hidden;
}

.main .content .content-left .introduce > span > img {
    width: 100%;
    height: 100%;
    vertical-align: middle;
}

.main .content .content-left .introduce .left-info {
    display: flex;
    width: 75%;
    justify-content: space-around;
    align-items: center;
}

.main .content .content-left .introduce .left-info .info-box {
    display: flex;
    flex-direction: column;
    align-items: center;
}

.main .content .content-left .introduce .official-icon {
    display: flex;
    justify-content: space-around;
    width: 70%;
    margin-bottom: 10px;
}

.main .content .content-center {
    display: flex;
    flex-direction: column;
    width: 780px;
    height: auto;
}

.main .content .notice {
    position: absolute;
    display: flex;
    align-items: center;
    width: 780px;
    height: 40px;
    border-radius: 10px;
    padding: 0px 10px;
    box-shadow: 0 1px 20px -6px rgba(0, 0, 0, 0.5);
}
.main .content .content-center .content-msg {
    width: 100%;
    height: 300px;
    display: flex;
    justify-content: space-around;
    margin-top: 40px;
    overflow: hidden;
    border-radius: 10px;
    box-shadow: 0 1px 20px -6px rgba(0, 0, 0, 0.5);
    background-color: #fff;
}

.main .content .content-center .content-msg:first-child {
    margin-top: 60px;
}
</style>
