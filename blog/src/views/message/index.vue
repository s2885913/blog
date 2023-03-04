<script setup>
import { ref } from 'vue'
import Comment from '@/components/layout/Comment.vue'
import Message from '@/components/layout/Message.vue'

let idNum = ref(0)
let inputContent = ref('')
let img1 = ref('/src/assets/img/picture/img1.jpeg')
let img4 = ref('/src/assets/img/picture/cover.png')

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

        <div class="comment-content">
            <div class="commentHead">
                <icon-pen-fill />
                留言
            </div>
            <div class="writeComment">
                <textarea data-v-f4b95078="" placeholder="写下点什么..." maxlength="1000" class="comment-textarea"></textarea>
                <div class="myBetween">
                    <div class="left">
                        <icon-face-smile-fill />
                        <icon-image />
                    </div>
                    <div class="right">
                        <div class="myButton">提交</div>
                    </div>
                </div>
            </div>
            <div class="commentInfo">
                <div class="commentInfo-title">
                    <span style="font-size: 1.15rem">Comments | </span>
                    <span>6 条留言</span>
                </div>
                <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
                <Comment :img="img4" nickname="Sara" time="2023-01-08 17:53" content="提前谢谢大家的祝福!"></Comment>
            </div>
        </div>
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

.comment-content {
    max-width: 1000px;
    width: 1000px;
    margin: 0 auto;
}

.commentHead {
    display: flex;
    align-items: center;
    font-size: 20px;
    font-weight: 700;
    margin: 40px 0 20px 0;
    color: var(--themeBackground);
}

.writeComment {
    margin-bottom: 40px;
}

.writeComment .comment-textarea {
    border: 1px solid var(--lightGray);
    width: 100%;
    font-size: 14px;
    padding: 15px;
    min-height: 180px;
    resize: none;
    outline: none;
    border-radius: 4px;
    background-image: var(--commentURL);
    background-size: contain;
    background-repeat: no-repeat;
    background-position: 100%;
    margin-bottom: 10px;
}

.myBetween {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;
}

.myBetween .left {
    width: 50px;
    display: flex;
    justify-content: space-between;
    align-items: center;
    font-size: 20px;
}

.myButton {
    background: rgb(131, 123, 199);
    width: 66px;
    height: 33px;
    line-height: 33px;
    border-radius: 4px;
    text-align: center;
    color: white;
}

.commentInfo-title {
    margin-bottom: 20px;
    color: var(--greyFont);
}
</style>
