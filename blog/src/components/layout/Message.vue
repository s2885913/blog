<script setup>
import { ref, onMounted, computed, reactive } from 'vue'
const props = defineProps({
    img: String,
    content: String,
    delay: Number,
})

let num = ref(0)

onMounted(() => {
    let currentNum = Math.random() * 100
    if (currentNum < 10) currentNum = 10
    if (currentNum > 100) currentNum = 90
    // console.log(currentNum)
    num.value = currentNum + 'vh'
})

const topNum = computed(() => num.value)
const style = reactive({
    top: topNum,
    animationDelay: props.delay + 's',
})
</script>

<template>
    <div>
        <p class="messageItem" :style="style">
            <img :src="props.img" alt="" />
            <span>{{ props.content }}</span>
        </p>
    </div>
</template>

<style scoped>
.messageItem {
    /*width: auto;*/
    height: 50px;
    background: rgba(0, 0, 0, 0.5);
    border-radius: 20px;
    position: absolute;
    /*transform: translate(100rem);*/
    right: -500px;
    display: flex;
    justify-content: space-between;
    align-items: center;
    /*transition: all 10s ease-in;*/
    animation: messageItem 10s linear forwards;
    /*text-align: center;*/
    /*line-height: -150px;*/
}

.messageItem img {
    width: 50px;
    height: 50px;
    border-radius: 50%;
    /*margin-left: 10px;*/
    padding: 5px;
}

.messageItem span {
    color: white;
    font-size: 15px;
}

@keyframes messageItem {
    from {
        position: absolute;
        right: -500px;
    }
    to {
        transform: translateX(-2500px);
    }
}
</style>
