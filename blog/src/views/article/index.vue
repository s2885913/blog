<script setup lang="ts">
import { ref } from 'vue'

const klmy1 = ref('/src/assets/img/klmy.png')
const klmy2 = ref('/src/assets/img/klmy2.png')
const klmy3 = ref('/src/assets/img/klmy3.png')
const klmy4 = ref('/src/assets/img/klmy4.png')
const klmy5 = ref('/src/assets/img/klmy5.png')
</script>

<template>
    <div class="theContainer">
        <a-layout-header>
            <div class="header">
                <div class="article-title-info">
                    <span>克里米亚是怎样一步步走上亲俄道路的</span>
                    <br />
                    <div class="article-info">
                        <svg-icon icon-class="username" style="width: 20px; height: 20px; margin-bottom: 4px; margin-right: 1px"></svg-icon>
                        <span data-v-607a30c4="">&nbsp;Sara</span><span data-v-607a30c4="">·</span>
                        <svg-icon icon-class="articleTime" style="width: 20px; height: 20px; margin-bottom: 4px; margin-right: 1px"></svg-icon>
                        <span data-v-607a30c4="">&nbsp;2022-11-20 10:26:18</span><span data-v-607a30c4="">·</span>
                        <svg-icon icon-class="articleHot" style="width: 20px; height: 20px; margin-bottom: 4px; margin-right: 1px"></svg-icon>
                        <span data-v-607a30c4="">&nbsp;516</span><span data-v-607a30c4="">·</span>
                        <svg-icon icon-class="articleRead" style="width: 20px; height: 20px; margin-bottom: 4px; margin-right: 1px"></svg-icon>
                        <span data-v-607a30c4="">&nbsp;5</span><span data-v-607a30c4="">·</span>
                        <svg-icon icon-class="articleLike" style="width: 20px; height: 20px; margin-bottom: 4px; margin-right: 1px"></svg-icon>
                        <span data-v-607a30c4="">&nbsp;0</span>
                    </div>
                </div>
            </div>
        </a-layout-header>
        <a-layout-content>
            <div class="main">
                <div class="articleContainer">
                    <div class="entry-content">
                        <div data-v-md-line="1">
                            <div class="v-md-pre-wrapper v-md-pre-wrapper- extra-class">
                                <pre class="v-md-prism-">
                                    <code>123123123213123123123123</code>
                                </pre>
                            </div>
                        </div>
                        <table data-v-md-line="1">
                            <thead>
                                <tr>
                                    <th>123</th>
                                    <th>column2</th>
                                    <th>column3</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>123123</td>
                                    <td>content2</td>
                                    <td>content3</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div id="article-like" class="myCenter"><icon-thumb-up-fill :style="{ fontSize: '40px', color: '#ddd' }" /></div>
                    <div></div>
                </div>
            </div>
        </a-layout-content>
    </div>
</template>

<style scoped>
@import '@/assets/css/typora-theme-wbm.css';
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
    width: 100vw;
    height: 40vh;
    background-image: url('@/assets/img/headerBackground.png');
    background-size: cover;
    background-repeat: no-repeat;
    background-position: 0 50%;
    display: flex;
    flex-direction: column;
    justify-content: flex-end;
    align-items: center;
    position: relative;
}

.header::before {
    position: absolute;
    width: 100%;
    height: 100%;
    background-color: var(--miniMask);
    content: '';
}

.article-title-info {
    position: relative;
    display: flex;
    flex-direction: column;
    margin-right: 40%;
    margin-bottom: 30px;
    z-index: 1;
}

.article-title-info > span {
    font-size: 30px;
    color: white;
}

.article-info span {
    color: white;
}

.main {
    background: var(--background);
}

.articleContainer {
    max-width: 800px;
    margin: 0 auto;
    padding: 40px 20px;
}

/*.myCenter {*/
/*    display: flex;*/
/*    justify-content: center;*/
/*    align-items: center;*/
/*}*/

.myCenter {
    display: flex;
    justify-content: center;
    align-items: center;
}

.article-like-icon {
    font-size: 60px;
    cursor: pointer;
    color: var(--greyFont);
    transition: all 0.5s;
    border-radius: 50%;
    margin-bottom: 20px;
}

.el-icon-thumb:before {
    content: '\e739';
}
</style>
