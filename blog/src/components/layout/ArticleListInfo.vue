<!--
 * @Author: lzr 1598042226@qq.com
 * @Date: 2023-02-06 17:29:29
 * @LastEditors: lzr 1598042226@qq.com
 * @LastEditTime: 2023-02-15 10:23:25
 * @FilePath: \blog\src\components\layout\ArticleListInfo.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
    <div class="article">
        <a-typography-title :heading="4" ellipsis style="margin-top: 10px">
            A design is a plan or specification for the construction of an object or system or for the implementation of an activity or process.
        </a-typography-title>
        <div class="article-lable">
            <span><svg-icon icon-class="hot" style="width: 16px; height: 16px; margin-bottom: 3px"></svg-icon>81阅读</span>
            <span><svg-icon icon-class="pl" style="width: 16px; height: 16px; margin-bottom: 3px"></svg-icon>4条评论</span>
            <span><svg-icon icon-class="time" style="width: 15px; height: 15px; margin-bottom: 2px"></svg-icon>发布于2023-02-08</span>
        </div>
        <div class="mian-text">
            <a-typography-paragraph
                :bold="true"
                :ellipsis="{
                    rows: 6,
                    showTooltip: true,
                }"
                style="font-size: 16px">
                A design is a plan or specification for the construction of an object or system or for the implementation of an activity or process, or the result of that plan or specification in the
                form of a prototype, product or process. The verb to design expresses the process of developing a design. The verb to design expresses the process of developing a design.A design is a
                plan or specification for the construction of an object or system or for the implementation of an activity or process, or the result of that plan or specification in the form of a
                prototype, product or process. The verb to design expresses the process of developing a design. The verb to design expresses the process of developing a design.
            </a-typography-paragraph>
        </div>
    </div>
</template>

<script lang="ts" setup></script>
<style scoped>
.article {
    display: flex;
    width: 50%;
    flex-direction: column;
    /* align-items: center; */
    padding: 20px 35px;
}

.article > h2 {
    display: -webkit-box;
    -webkit-line-clamp: 1;
    overflow: hidden;
    text-overflow: ellipsis;
    /*! autoprefixer: ignore next */
    -webkit-box-orient: vertical;
    /* autoprefixer: on */
    word-break: break-all; /*兼容英文*/
    margin-top: 0;
}

.article-lable {
    display: flex;
    justify-content: space-around;
    font-size: 12px;
    color: #797979;
}
</style>
