<script setup lang="ts">
const props = defineProps({
    img: Object,
    nickname: String,
    // username: String,
    time: String,
    content: String,
})
</script>

<template>
    <div class="commentItem">
        <img :src="img" alt="" />
        <div class="info">
            <div class="nameAndTime">
                <div>
                    <span class="commentInfo-username">{{ nickname }}</span>
                    <!--                    <span class="commentInfo-master">{{ username }}</span>-->
                    <span class="commentInfo-other">{{ time }}</span>
                </div>
                <div class="commentInfo-reply"><!----><span>回复</span></div>
            </div>
            <div>
                <div class="commentInfo-content">
                    <span>{{ content }}</span>
                </div>
            </div>
        </div>
    </div>
</template>

<style scoped>
.commentItem {
    display: flex;
}

.commentItem img {
    height: 35px;
    width: 35px;
    line-height: 35px;
}

.commentItem .info {
    /*flex: 1 1 0%;*/
    flex: 1 1 auto;
    padding-left: 12px;
}

.nameAndTime {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;
}

.commentInfo-username {
    color: var(--orangeRed);
    font-size: 16px;
    font-weight: 600;
    margin-right: 5px;
}

.commentInfo-master {
    color: var(--green);
    border: 1px solid var(--green);
    border-radius: 0.2rem;
    font-size: 12px;
    padding: 2px 4px;
    margin-right: 5px;
}

.commentInfo-other {
    font-size: 12px;
    color: var(--greyFont);
}

.commentInfo-reply {
    cursor: pointer;
    color: var(--white);
    background: var(--themeBackground);
    border-radius: 0.2rem;
    padding: 3px 6px;
}

.commentInfo-content {
    margin: 15px 0 25px;
    padding: 18px 20px;
    background: var(--commentContent);
    border-radius: 12px;
    color: var(--black);
    word-break: break-word;
}
</style>
