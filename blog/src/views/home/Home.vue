<template>
    <div class="main">
        <div class="banner">
            <img src="@/assets/img/banner.jpg" alt="" />
            <div class="banner-title">
                <h1>123123</h1>
            </div>
        </div>
        <div class="content">
            <div class="content-left">
                <div class="introduce bg-white">
                    <span>
                        <img src="@/assets/img/head.jpg" alt="" />
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
                    <a-button style="width: 70%; margin-top: 10px; margin-bottom: 10px; background-color: #49b1f5; color: #fff">按钮</a-button>
                    <div class="official-icon"></div>
                </div>
            </div>
            <div class="notice bg-white">
                <i class="i-icon-park-outline-volume-notice text-5 color-gray mr-2"></i>
                <span>公告</span>
            </div>
            <div class="content-center">
                <div class="content-msg">
                    <article-list-img></article-list-img>
                    <ArticleListInfo></ArticleListInfo>
                </div>
                <div class="content-msg">
                    <article-list-img></article-list-img>
                    <ArticleListInfo></ArticleListInfo>
                </div>
            </div>
            <div class="content-right bg-white"></div>
        </div>
    </div>
</template>

<script lang="ts" setup></script>
<style scoped>
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
    display: flex;
    width: 90%;
    margin: 20px auto;
    flex-wrap: nowrap;
    justify-content: space-around;
    height: 300px;
    /* border: 1px solid pink; */
    border-radius: 5px;
}

.main .content .content-left {
    display: flex;
    flex-direction: column;
}

.main .content .content-left .introduce,
.main .content .content-right {
    width: 290px;
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
}

.main .content .content-center {
    display: flex;
    flex-direction: column;
    width: 780px;
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
    display: flex;
    justify-content: space-around;
    margin-top: 55px;
    border-radius: 10px;
    box-shadow: 0 1px 20px -6px rgba(0, 0, 0, 0.5);
    background-color: #fff;
}
</style>
