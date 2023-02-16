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
