<script setup>
import { ref } from 'vue'
import Message from '@/components/layout/Message.vue'

let idNum = ref(0)
let inputContent = ref('')
let img1 = ref('/src/assets/img/picture/img1.jpeg')
const list = reactive([
    {
        id: 0,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
    {
        id: ++idNum.value,
        img: img1,
        content: '大佬大佬大佬啊领导到哦',
        delay: Math.floor(Math.random() * 10),
    },
])

function addList() {
    list.push({
        id: ++idNum.value,
        img: img1,
        content: inputContent.value,
        delay: Math.floor(Math.random() * 10),
    })
    console.log(++idNum.value)
}
</script>

<template>
    <div class="theContainer">
        <main>
            <div class="addList">
                <h1>树洞</h1>
                <input v-model="inputContent" placeholder="留下来点什么吧" />
                <button @click="addList">发射</button>
            </div>
            <template v-for="item in list" :key="item.id">
                <Message :img="item.img" :content="item.content" :delay="item.delay"></Message>
            </template>
        </main>
    </div>
</template>

<style scoped>
main {
    width: 100vw;
    height: 100vh;
    background: #319d97;
    position: relative;
    padding: 50px 0 0;
    overflow: hidden;
}

h1 {
    text-align: center;
    color: white;
}

.addList {
    position: absolute;
    left: 50%;
    top: 50%;
    transform: translate(-50%, -50%);
}

input {
    width: 200px;
    /*height: 30px;*/
    outline: none;
    border-radius: 1.2rem;
    border: var(--white) 1px solid;
    color: var(--white);
    background: var(--transparent);
    padding: 10px 10px;
}

input::-webkit-input-placeholder {
    color: white;
}

button {
    border-radius: 1.2rem;
    border: var(--white) 1px solid;
    color: var(--white);
    background: var(--transparent);
    padding: 10px 10px;
    margin-left: 10px;
    cursor: pointer;
}
</style>
