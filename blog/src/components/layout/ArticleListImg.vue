<!--
 * @Author: lzr 1598042226@qq.com
 * @Date: 2023-02-06 10:54:51
 * @LastEditors: lzr 1598042226@qq.com
 * @LastEditTime: 2023-02-16 12:37:07
 * @FilePath: \blog\src\components\layout\ArticleListImg.vue
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
<template>
    <div class="content-img">
        <a-image :src="require('@/assets/img/1000211671523059883878.jpg')" fit="cover" :show-loader="true" :preview="false" width="100%" height="100%"></a-image>
    </div>
</template>

<script lang="ts" setup></script>
<style scoped>
.content-img {
    width: 50%;
    height: 100%;
    overflow: hidden;
}

.arco-image {
    transition: all 1s;
}

.arco-image:hover {
    transform: scale(1.2);
}
</style>
