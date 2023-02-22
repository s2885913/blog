<script setup lang="ts">
import { ref, reactive } from 'vue'
import info1 from '@/assets/img/friend/info1.png'
import info2 from '@/assets/img/friend/info2.png'
import info3 from '@/assets/img/friend/info3.png'
import { IconThumbUp, IconShareInternal, IconMore } from '@arco-design/web-vue/es/icon'

const infoOne = ref(info1)
const infoTwo = ref(info2)
const infoThree = ref(info3)

// 发布的时间
let timer = ref(' 发布于 2022-10-30 20:17 ')

const cardMessage = reactive([{ id: 0 }, { id: 1 }, { id: 2 }, { id: 3 }, { id: 4 }, { id: 5 }, { id: 6 }, { id: 7 }, { id: 8 }, { id: 9 }, { id: 10 }])
</script>

<template>
    <div class="theContainer">
        <!-- <a-layout style="height: 100vh"> -->
        <div class="backGround"></div>
        <a-layout-header>
            <div class="header">
                <a-typography-title> 友联 </a-typography-title>
            </div>
        </a-layout-header>
        <a-layout-content>
            <div class="main">
                <div class="friend-main">
                    <!-- 信封 start-->
                    <div class="form-wrap">
                        <a-image :src="infoOne" />
                        <a-image :src="infoTwo" class="infoTwo" />
                        <a-image :src="infoThree" class="infoThree" />
                    </div>
                    <!-- 信封 end-->
                    <!--  虚线 start-->
                    <hr />
                    <!--  虚线 end-->
                    <h2>🥇友情链接</h2>
                    <!--                  卡片容器start-->
                    <div class="card-container">
                        <div v-for="item in cardMessage" :key="item.id" class="card-item">
                            <a-card :style="{ width: '353px', height: '300px', borderRadius: '10px' }" :size="'small'">
                                <template #cover>
                                    <div
                                        :style="{
                                            height: '204px',
                                            overflow: 'hidden',
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
                                            <span>{{ timer }}</span>
                                        </div>
                                    </template>
                                </a-card-meta>
                            </a-card>
                        </div>
                    </div>
                    <!--                  卡片容器end-->
                </div>
            </div>
        </a-layout-content>
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

.backGround {
    width: 100vw;
    height: 100vh;
    background-image: url('@/assets/img/friend/friendBackground.png');
    position: fixed;
    z-index: 0;
}

.header {
    width: 100%;
    height: 300px;
    background-color: rgba(0, 0, 0, 0.3);
    display: flex;
    justify-content: center;
    align-items: center;
    position: relative;
    z-index: 1;
}

.arco-typography {
    color: white;
}

.main {
    padding: 0 20px;
    color: var(--black);
}

.friend-main {
    max-width: 1200px;
    margin: 40px auto;
    border-radius: 10px;
    padding: 40px;
    background: hsla(0, 0%, 100%, 0.85);
    position: relative;
    z-index: 1;
}

.form-wrap {
    width: 530px;
    height: 447px;
    margin: 0 auto;
    overflow: hidden;
    position: relative;
}

.infoTwo {
    position: absolute;
    left: 0;
    top: 190px;
    z-index: 100;
}

.infoThree {
    width: 490px;
    height: 300px;
    position: absolute;
    left: -197px;
    top: 187px;
}

hr {
    margin: 40px auto;
    border: 2px dashed var(--lightGreen);
    overflow: visible;
    position: relative;
}

hr::before {
    position: absolute;
    top: -14px;
    left: 5%;
    color: var(--lightGreen);
    content: '❄';
    font-size: 30px;
    line-height: 1;
    /*transition: all 1s ease-in-out;*/
}

.card-container {
    display: flex;
    flex-wrap: wrap;
}

.card-item {
    border-radius: 10px;
    background: hsla(0, 0%, 100%, 0.88);
    overflow: hidden;
    margin: 10px;
}
</style>
