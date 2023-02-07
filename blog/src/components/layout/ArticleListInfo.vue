<template>
    <div class="info">
        <h2>1231123123123112312312312312312323123233</h2>
    </div>
</template>

<script lang="ts" setup></script>
<style scoped>
.info {
    display: flex;
    width: 50%;
    flex-direction: column;
    align-items: center;
    padding: 20px 35px;
}

.info > h2 {
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
</style>
