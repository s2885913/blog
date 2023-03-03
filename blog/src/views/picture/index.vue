<script setup lang="ts">
import Comment from '@/components/layout/Comment.vue'
import { ref, reactive } from 'vue'
import Footer from '@/components/layout/Footer.vue'

let img1 = ref('/src/assets/img/picture/img1.jpeg')
let img2 = ref('/src/assets/img/picture/img2.jpeg')
let img3 = ref('/src/assets/img/picture/img3.png')
let img4 = ref('/src/assets/img/picture/cover.png')

const cardContent = reactive([
    {
        id: 0,
        title: '点点滴滴',
        content: '☀️今朝有酒今朝醉',
        img: img1,
    },
    {
        id: 1,
        title: '时光相册',
        content: '📸记录美好瞬间',
        img: img2,
    },
    {
        id: 2,
        title: '祝福板',
        content: '📋写下对我们的祝福',
        img: img3,
    },
])

let count = ref(0)
// 切换count
function toggleCount(index: any) {
    count.value = index
}
</script>

<template>
    <div class="theContainer">
        <div class="content">
            <div v-for="(item, index) in cardContent" :key="item.id" class="card" @click="toggleCount(index)">
                <div class="left">
                    <img :src="item.img" alt="" />
                </div>
                <div class="right">
                    <h1>点点滴滴</h1>
                    <p>☀️今朝有酒今朝醉</p>
                </div>
            </div>
        </div>
        <div class="cardContent">
            <div v-show="count === 0" class="card1Content">
                <div class="articleFirst">
                    <svg-icon icon-class="greenery" style="width: 20px; height: 20px; margin-bottom: 4px"></svg-icon>
                    发现
                </div>
                <div class="article">
                    <ArticleListInfo></ArticleListInfo>
                    <article-list-img></article-list-img>
                </div>
                <div class="article">
                    <ArticleListInfo></ArticleListInfo>
                    <article-list-img></article-list-img>
                </div>
                <div class="article">
                    <ArticleListInfo></ArticleListInfo>
                    <article-list-img></article-list-img>
                </div>
            </div>
            <div v-show="count === 1" class="card2Content">
                <div class="isActive">🔖 多喜乐 1</div>
                <h1>多喜乐</h1>
                <a-card :style="{ width: '353px', height: '300px', borderRadius: '10px' }" :size="'small'">
                    <template #cover>
                        <div
                            :style="{
                                height: '204px',
                                overflow: 'hidden',
                                borderRadius: '10px',
                            }">
                            <img :style="{ width: '100%', transform: 'translateY(-20px)' }" alt="dessert" src="https://source.fomal.cc/siteshot/www.fomal.cn.jpg" />
                        </div>
                    </template>
                    <a-card-meta title=" Fomalhaut🥝 " description=" Future is now 🍭🍭🍭 ">
                        <template #avatar>
                            <div :style="{ display: 'flex', alignItems: 'center', color: '#1D2129' }">
                                <a-avatar :size="24" :style="{ marginRight: '8px' }">
                                    <svg data-v-0ac1e776="" viewBox="0 0 1024 1024" width="14" height="14" style="vertical-align: -2px">
                                        <path data-v-0ac1e776="" d="M512 512m-512 0a512 512 0 1 0 1024 0 512 512 0 1 0-1024 0Z" fill="#409EFF"></path>
                                        <path
                                            data-v-0ac1e776=""
                                            d="M654.222222 256c-17.066667 0-28.444444 11.377778-28.444444 28.444444v56.888889c0 17.066667 11.377778 28.444444 28.444444 28.444445s28.444444-11.377778 28.444445-28.444445v-56.888889c0-17.066667-11.377778-28.444444-28.444445-28.444444zM369.777778 256c-17.066667 0-28.444444 11.377778-28.444445 28.444444v56.888889c0 17.066667 11.377778 28.444444 28.444445 28.444445s28.444444-11.377778 28.444444-28.444445v-56.888889c0-17.066667-11.377778-28.444444-28.444444-28.444444z"
                                            fill="#FFFFFF"></path>
                                        <path
                                            data-v-0ac1e776=""
                                            d="M725.333333 312.888889H711.111111v28.444444c0 31.288889-25.6 56.888889-56.888889 56.888889s-56.888889-25.6-56.888889-56.888889v-28.444444h-170.666666v28.444444c0 31.288889-25.6 56.888889-56.888889 56.888889s-56.888889-25.6-56.888889-56.888889v-28.444444h-14.222222c-22.755556 0-42.666667 19.911111-42.666667 42.666667v341.333333c0 22.755556 19.911111 42.666667 42.666667 42.666667h426.666666c22.755556 0 42.666667-19.911111 42.666667-42.666667v-341.333333c0-22.755556-19.911111-42.666667-42.666667-42.666667zM426.666667 654.222222h-56.888889c-17.066667 0-28.444444-11.377778-28.444445-28.444444s11.377778-28.444444 28.444445-28.444445h56.888889c17.066667 0 28.444444 11.377778 28.444444 28.444445s-11.377778 28.444444-28.444444 28.444444z m227.555555 0h-56.888889c-17.066667 0-28.444444-11.377778-28.444444-28.444444s11.377778-28.444444 28.444444-28.444445h56.888889c17.066667 0 28.444444 11.377778 28.444445 28.444445s-11.377778 28.444444-28.444445 28.444444z m0-113.777778h-56.888889c-17.066667 0-28.444444-11.377778-28.444444-28.444444s11.377778-28.444444 28.444444-28.444444h56.888889c17.066667 0 28.444444 11.377778 28.444445 28.444444s-11.377778 28.444444-28.444445 28.444444z"
                                            fill="#FFFFFF"></path></svg
                                ></a-avatar>
                                <span>timer </span>
                            </div>
                        </template>
                    </a-card-meta>
                </a-card>
                <h4 class="footerTitle">~~到底啦~~</h4>
            </div>
            <div v-show="count === 2" class="comment-content">
                <div class="commentHead">
                    <icon-pen-fill />
                    留言
                </div>
                <div class="writeComment">
                    <textarea data-v-f4b95078="" placeholder="写下点什么..." maxlength="1000" class="comment-textarea"></textarea>
                    <div class="myBetween">
                        <div class="left">
                            <icon-face-smile-fill />
                            <icon-image />
                        </div>
                        <div class="right">
                            <div class="myButton">提交</div>
                        </div>
                    </div>
                </div>
                <div class="commentInfo">
                    <div class="commentInfo-title">
                        <span style="font-size: 1.15rem">Comments | </span>
                        <span>6 条留言</span>
                    </div>
                    <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                    <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                    <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                    <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                    <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                    <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                    <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                    <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                    <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                    <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                </div>
            </div>
        </div>
        <Footer></Footer>
    </div>
</template>

<style scoped>
.theContainer {
    width: 100%;
    /* height: 93vh; */
    background-image: linear-gradient(90deg, rgba(37, 82, 110, 0.1) 1px, var(--background) 0), linear-gradient(180deg, rgba(37, 82, 110, 0.1) 1px, var(--background) 0);
    background-size: 3rem 3rem;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
}

.content {
    width: 100%;
    margin-top: 50px;
    padding: 0 20px;
    display: flex;
    flex-direction: row;
    justify-content: space-around;
    align-items: center;
}

.content .card {
    width: 336px;
    height: 155px;
    display: flex;
    flex-direction: row;
    justify-content: space-around;
    align-items: center;
    padding: 25px;
    margin: 25px auto;
    border-radius: 20px;
    cursor: pointer;
    background: var(--background);
    box-shadow: 1px 1px 3px var(--mask);
    transition: transform 0.5s ease;
}

.content .card:hover {
    transform: translateY(-10px);
}

.content .card .left {
    width: 100px;
    height: 105px;
    border-radius: 50%;
}

.content .card .left img {
    width: 100%;
    height: 100%;
    border-radius: 50%;
}

.content .card .right p {
    font-size: 1.1rem;
    letter-spacing: 0.2rem;
    color: #777;
}

.cardContent {
    max-width: 1500px;
    width: 1500px;
    margin: 20px auto 40px;
}

.card1Content {
    max-width: 780px;
    width: 780px;
    margin: 0 auto;
}

.card1Content .articleFirst {
    color: var(--greyFont);
    border-bottom: 1px dashed var(--lightGray);
    padding-bottom: 5px;
    margin-bottom: 50px;
}

.article {
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

.card2Content {
    max-width: 1150px;
    width: 1150px;
    margin: 0 auto;
}

.isActive {
    width: 110px;
    height: 40px;
    background: black;
    border-radius: 5px;
    color: white;
    text-align: center;
    line-height: 40px;
    animation: scale 2.5s ease infinite;
    margin-bottom: 40px;
}

.card2Content h1 {
    text-align: center;
    margin-bottom: 40px;
}

.footerTitle {
    text-align: center;
    margin-top: 50px;
}

.comment-content {
    max-width: 1000px;
    width: 1000px;
    margin: 0 auto;
}

.commentHead {
    display: flex;
    align-items: center;
    font-size: 20px;
    font-weight: 700;
    margin: 40px 0 20px 0;
    color: var(--themeBackground);
}

.writeComment {
    margin-bottom: 40px;
}

.writeComment .comment-textarea {
    border: 1px solid var(--lightGray);
    width: 100%;
    font-size: 14px;
    padding: 15px;
    min-height: 180px;
    resize: none;
    outline: none;
    border-radius: 4px;
    background-image: var(--commentURL);
    background-size: contain;
    background-repeat: no-repeat;
    background-position: 100%;
    margin-bottom: 10px;
}

.myBetween {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;
}

.myBetween .left {
    width: 50px;
    display: flex;
    justify-content: space-between;
    align-items: center;
    font-size: 20px;
}

.myButton {
    background: rgb(131, 123, 199);
    width: 66px;
    height: 33px;
    line-height: 33px;
    border-radius: 4px;
    text-align: center;
    color: white;
}

.commentInfo-title {
    margin-bottom: 20px;
    color: var(--greyFont);
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
