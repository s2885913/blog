<!--
 * @Author: lzr 1598042226@qq.com
 * @Date: 2023-02-06 17:29:29
 * @LastEditors: lzr 1598042226@qq.com
 * @LastEditTime: 2023-02-16 13:05:06
 * @FilePath: \blog\src\components\layout\ArticleListInfo.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
    <div class="article">
        <div class="article-title">
            <a-typography-title :heading="5" ellipsis style="margin-top: -1px"> MySQL实现了SQL标准中的四个隔离 </a-typography-title>
        </div>

        <div class="article-label">
            <a-row justify="space-between" align="center">
                <span><svg-icon icon-class="hot" style="width: 16px; height: 16px; margin-bottom: 3px"></svg-icon>&nbsp;81阅读 </span>
                <span><svg-icon icon-class="pl" style="width: 16px; height: 16px; margin-bottom: 3px"></svg-icon>&nbsp;4条评论</span>
                <span><svg-icon icon-class="time" style="width: 13px; height: 13px; margin-bottom: 2px"></svg-icon>&nbsp;发表于2023-02-08</span>
            </a-row>
        </div>
        <div class="article-msg">
            <a-typography-paragraph
                :bold="false"
                :ellipsis="{
                    rows: 5,
                }"
                style="font-size: 14px; color: #4e5358; line-height: 1.7">
                我们都知道MySQL实现了SQL标准中的四个隔离级别我们都知道MySQL实现了SQL标准中的四个隔离级别我们都知道MySQL实现了SQL标准中的四个隔离级别我们都知道MySQL实现了SQL标准中的四个隔离级别我们都知道MySQL实现了SQL标准中的四个隔离级别我们都知道MySQL实现了SQL标准中的四个隔离级别我们都知道MySQL实现了SQL标准中的四个隔离级别我们都知道MySQL实现了SQL标准中的四个隔离级别我们都知道MySQL实现了SQL标准中的四个隔离级别
            </a-typography-paragraph>
        </div>

        <div class="article-classify">
            <a-row justify="space-between" :wrap="false">
                <span><svg-icon icon-class="fenlei" style="width: 21px; height: 21px; margin-bottom: 3px"></svg-icon>文章分类</span>
                <span><svg-icon icon-class="biaoqian" style="width: 20px; height: 20px; margin-bottom: 3px"></svg-icon>文章标签</span>
                <span><svg-icon icon-class="biaoqian" style="width: 20px; height: 20px; margin-bottom: 3px"></svg-icon>文章标签</span>
            </a-row>
        </div>
    </div>
</template>

<script lang="ts" setup></script>
<style scoped>
.article {
    display: flex;
    position: relative;
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

.article-classify {
    position: absolute;
    bottom: 10px;
}

.article-classify span {
    padding: 3px 10px;
    background-color: #eee;
    border-radius: 3px;
    font-size: 14px;
    color: #797979;
    transition: all 0.3s;
    cursor: pointer;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
    margin-right: 12px;
}

.article-label {
    padding: 5px 0;
}
</style>
