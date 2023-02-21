<script setup>
import { reactive } from 'vue'
const form = reactive({
    value1: '',
    value2: '',
    value3: '',
    value4: '',
    value5: '',
})
</script>

<template>
    <div class="theContainer">
        <a-layout-content>
            <div class="loginInput">
                <div class="left">
                    <a-typography-title :heading="3">登录</a-typography-title>
                    <a-form :model="form">
                        <a-row :gutter="20">
                            <a-col :span="20">
                                <a-form-item field="username">
                                    <a-input v-model="form.value4" placeholder="用户名/邮箱/手机号" />
                                </a-form-item>
                            </a-col>
                        </a-row>
                        <a-row :gutter="20">
                            <a-col :span="20">
                                <a-form-item field="password">
                                    <a-input v-model="form.value4" placeholder="密码" />
                                </a-form-item>
                            </a-col>
                        </a-row>
                    </a-form>
                </div>
                <div class="right"></div>
            </div>
        </a-layout-content>
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
}

.loginInput .left {
    background: rgba(236, 238, 239, 0.63);
    opacity: 1;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
}

.arco-form {
}

.loginInput .right {
    background: #ed3f63;
    border-radius: 10px;
    opacity: 1;
}
</style>
