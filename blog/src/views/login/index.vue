<script setup>
import { reactive } from 'vue'
import { Notification } from '@arco-design/web-vue'
import Footer from '@/components/layout/Footer.vue'

const loginForm = reactive({
    username: '',
    password: '',
})

let loginFormIsDone = reactive([false, false])

const registerForm = reactive({
    username: '',
    password: '',
    email: '',
})

let registerFormIsDone = reactive([false, false, false])

let rightGoToLeft = ref(false)
function theRightGoToLeft() {
    rightGoToLeft.value = !rightGoToLeft.value
}

function submit(formData) {
    let result = Object.keys(formData)
    result.forEach((item, index) => {
        if (result[2] === 'email') {
            formData[item] === '' || formData[item] === null ? (registerFormIsDone[index] = false) : (registerFormIsDone[index] = true)
        } else {
            formData[item] === '' || formData[item] === null ? (loginFormIsDone[index] = false) : (loginFormIsDone[index] = true)
        }
    })
    // 循环完毕进行判断
    // eslint-disable-next-line no-prototype-builtins
    if (formData.hasOwnProperty('email')) {
        // 判断是否全部为true, 不是全部为true的话, 就代表他有内容没有填写完毕, 就提示他
        let isDone = registerFormIsDone.every(item => item === true)
        if (!isDone) {
            Notification.error({
                // title: '',
                content: '请输入完整的信息哦!',
            })
        }
    } else {
        let isDone = loginFormIsDone.every(item => item === true)
        if (!isDone) {
            Notification.error({
                // title: '',
                content: '请输入完整的信息哦!',
            })
        }
    }
}
</script>

<template>
    <div class="theContainer">
        <a-layout-content>
            <div class="loginInput">
                <div class="left" :class="{ leftGoToLeft: rightGoToLeft }">
                    <template v-if="!rightGoToLeft">
                        <a-typography-title :heading="3">登录</a-typography-title>
                        <a-form :model="loginForm">
                            <a-row :gutter="20">
                                <a-col :span="20">
                                    <a-form-item field="username" :rules="[{ required: true, message: '用户名是必填的' }]" :validate-trigger="['blur']">
                                        <a-input v-model="loginForm.username" placeholder="用户名/邮箱/手机号" />
                                    </a-form-item>
                                </a-col>
                            </a-row>
                            <a-row :gutter="20">
                                <a-col :span="20">
                                    <a-form-item field="password" :rules="[{ required: true, message: '密码是必填的' }]" :validate-trigger="['blur']">
                                        <a-input v-model="loginForm.password" placeholder="密码" />
                                    </a-form-item>
                                </a-col>
                            </a-row>
                            <a-row :gutter="20">
                                <a-col :span="20" :offset="5">
                                    <a-form-item> <a-button type="primary" shape="round" size="large" @click="submit(loginForm)">登录</a-button> </a-form-item>
                                </a-col>
                            </a-row>
                        </a-form>
                    </template>

                    <template v-else>
                        <a-typography-title :heading="3">注册</a-typography-title>
                        <a-form :model="registerForm">
                            <a-row :gutter="20">
                                <a-col :span="20">
                                    <a-form-item field="username" :rules="[{ required: true, message: '用户名是必填的' }]" :validate-trigger="['blur']">
                                        <a-input v-model="registerForm.username" placeholder="用户名" />
                                    </a-form-item>
                                </a-col>
                            </a-row>
                            <a-row :gutter="20">
                                <a-col :span="20">
                                    <a-form-item field="password" :rules="[{ required: true, message: '密码是必填的' }]" :validate-trigger="['blur']">
                                        <a-input v-model="registerForm.password" placeholder="密码" />
                                    </a-form-item>
                                </a-col>
                            </a-row>
                            <a-row :gutter="20">
                                <a-col :span="20">
                                    <a-form-item field="email" :rules="[{ required: true, message: '邮箱是必填的' }]" :validate-trigger="['blur']">
                                        <a-input v-model="registerForm.email" placeholder="邮箱" />
                                    </a-form-item>
                                </a-col>
                            </a-row>
                            <a-row :gutter="20">
                                <a-col :span="20" :offset="5">
                                    <a-form-item> <a-button type="primary" shape="round" size="large" @click="submit(registerForm)">注册</a-button> </a-form-item>
                                </a-col>
                            </a-row>
                        </a-form>
                    </template>
                </div>
                <div class="right" :class="{ rightGoToLeft: rightGoToLeft }">
                    <template v-if="!rightGoToLeft">
                        <h1>没有账号?</h1>
                        <br />
                        <br />
                        <a-typography-text> 立即注册吧😃</a-typography-text>
                        <br />
                        <br />
                        <a-button type="outline" shape="round" size="large" class="btn" @click="theRightGoToLeft"><span>注册</span></a-button>
                    </template>

                    <template v-else>
                        <h1>已有账号?</h1>
                        <br />
                        <br />
                        <a-typography-text> 请登录🚀</a-typography-text>
                        <br />
                        <br />
                        <a-button type="outline" shape="round" size="large" class="btn" @click="theRightGoToLeft"><span>登录</span></a-button>
                    </template>
                </div>
            </div>
        </a-layout-content>
        <Footer></Footer>
    </div>
</template>

<style scoped>
.layout-demo :deep(.arco-layout-content) {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    font-size: 16px;
    font-stretch: condensed;
    text-align: center;
}
.arco-layout-content {
    width: 100%;
    height: 100vh;
    background-image: url('../../assets/img/login/loginBackground.png');
    background-position: 0 100%;
    background-repeat: no-repeat;
    background-size: cover;
    position: relative;
}

.loginInput {
    border-radius: 10px;
    box-shadow: 0 15px 30px var(--miniMask), 0 10px 10px var(--miniMask);
    width: 750px;
    max-width: 100%;
    min-height: 450px;
    position: absolute;
    left: 50%;
    top: 50%;
    transform: translate(-50%, -50%);
    opacity: 0.9;
    display: flex;
    flex-direction: row;
}

.loginInput .left,
.right {
    width: 50%;
    min-height: 450px;
    border-radius: 10px;
    transition: transform 0.5s ease-in;
}

.loginInput .left {
    background: rgba(236, 238, 239, 0.63);
    opacity: 1;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
}

.loginInput .right {
    background: rgba(236, 238, 239, 0.63);
    opacity: 1;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    color: white;
}

.arco-form {
}

.loginInput .right {
    background: #ed3f63;
    border-radius: 10px;
    opacity: 1;
}

.arco-typography {
    color: white;
}

.btn {
    border: 1px solid white;
}

.btn:hover {
    border: 1px solid white;
    transform: scale(1.2);
}

.leftGoToLeft {
    transform: translate(100%, 0px);
}

.rightGoToLeft {
    transform: translate(-100%, 0px);
}

.arco-btn span {
    color: white;
}
</style>
