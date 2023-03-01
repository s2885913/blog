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
                        <md-editor v-model="state.text" preview-only :no-prettier="true" preview-theme="vuepress" :auto-detect-code="true" />
                    </div>
                    <div id="article-like" class="myCenter"><icon-thumb-up-fill :style="{ fontSize: '40px', color: '#ddd' }" /></div>
                    <div></div>
                </div>
            </div>
        </a-layout-content>
    </div>
</template>
<script setup lang="ts">
import { reactive } from 'vue'
import MdEditor from 'md-editor-v3'
import 'md-editor-v3/lib/style.css'

const state = reactive({
    text: `<blockquote>
<p>在线尝试示例：<a href="https://codesandbox.io/s/epic-bird-2znqo" title="" target="_blank">传送门</a></p>
</blockquote>
<h2 id="🤯 Props 说明"><a href="#🤯 Props 说明">🤯 Props 说明</a></h2><p>这是组件最重要的一部分内容，<code>md-editor-v3</code>的属性参数如下：</p>
<h3 id="📃 modelValue"><a href="#📃 modelValue">📃 modelValue</a></h3><ul>
<li><p><strong>类型</strong>：<code>string</code></p>
</li><li><p><strong>默认值</strong>：<code>''</code></p>
<p>编辑的内容。</p>
<pre><code class="language-html"><span class="code-block"><span class="hljs-tag">&lt;<span class="hljs-name">md-editor-v3</span> <span class="hljs-attr">v-model</span>=<span class="hljs-string">"xxx"</span> /&gt;</span></span><span rn-wrapper="" aria-hidden="true"><span></span></span>
</code><span class="copy-button">复制代码</span></pre>
</li></ul>`,
})
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
