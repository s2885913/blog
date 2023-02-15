<!--
 * @Author: lzr 1598042226@qq.com
 * @Date: 2023-02-06 17:29:29
 * @LastEditors: lzr 1598042226@qq.com
 * @LastEditTime: 2023-02-15 16:11:23
 * @FilePath: \blog\src\components\layout\ArticleListInfo.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
    <div class="article">
        <div class="article-title">
            <a-typography-title :heading="4" ellipsis style="margin-top: -5px"> MySQL实现了SQL标准中的四个隔离 </a-typography-title>
        </div>

        <div class="article-label">
            <a-row justify="space-between" align="center">
                <span><svg-icon icon-class="hot" style="width: 16px; height: 16px; margin-bottom: 3px"></svg-icon>81阅读</span>
                <span><svg-icon icon-class="pl" style="width: 16px; height: 16px; margin-bottom: 3px"></svg-icon>4条评论</span>
                <span><svg-icon icon-class="time" style="width: 13px; height: 13px; margin-bottom: 2px"></svg-icon>发布于2023-02-08</span>
            </a-row>
        </div>
        <div class="article-msg">
            <a-typography-paragraph
                :bold="false"
                :ellipsis="{
                    rows: 6,
                }"
                style="font-size: 15px">
                我们都知道MySQL实现了SQL标准中的四个隔离级别，但是具体是如何实现的可能还一知半解，本篇博客将会从代码层面讲解隔离级别的实现方式，下面进入正题。
                我们都知道MySQL实现了SQL标准中的四个隔离级别，但是具体是如何实现的可能还一知半解，本篇博客将会从代码层面讲解隔离级别的实现方式，下面进入正题。
                我们都知道MySQL实现了SQL标准中的四个隔离级别，但是具体是如何实现的可能还一知半解，本篇博客将会从代码层面讲解隔离级别的实现方式，下面进入正题。
                我们都知道MySQL实现了SQL标准中的四个隔离级别，但是具体是如何实现的可能还一知半解，本篇博客将会从代码层面讲解隔离级别的实现方式，下面进入正题。
            </a-typography-paragraph>
        </div>
    </div>
</template>

<script lang="ts" setup></script>
<style scoped>
.article {
    display: flex;
    flex-direction: column;
    width: 50%;
    /* align-items: center; */
    padding: 20px 35px;
}

.arco-row-justify-space-between {
    margin-top: -4px;
    margin-bottom: 5px;
    font-size: 12px !important;
    color: #797979;
}
</style>
