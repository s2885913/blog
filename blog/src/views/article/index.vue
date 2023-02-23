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
                        <md-editor v-model="text" mode="preview" />
                    </div>
                    <div id="article-like" class="myCenter"><icon-thumb-up-fill :style="{ fontSize: '40px', color: '#ddd' }" /></div>
                    <div></div>
                </div>
            </div>
        </a-layout-content>
    </div>
</template>
<script setup lang="ts">
import { ref } from 'vue'
import mdEditor from '@/components/md-edtior/index.vue'

const text = ref(`
<h1 data-v-md-heading="王培申" data-v-md-line="1">王培申</h1>
<hr data-v-md-line="2">
<table data-v-md-line="3">
<thead>
<tr>
<th>123</th>
<th>123</th>
<th>123</th>
</tr>
</thead>
<tbody>
<tr>
<td>123</td>
<td>123</td>
<td>123</td>
</tr>
</tbody>
</table>
<hr data-v-md-line="6">
<div data-v-md-line="7"><div class="v-md-pre-wrapper v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>1231231231232
</code></pre>
</div></div>
<div class="v-md-plugin-tip tip"><p class="v-md-plugin-tip-title">提示</p>
<p data-v-md-line="2">你可以点击 toolbar 中的 tip 来快速插入1</p>
</div>

`)
</script>

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
