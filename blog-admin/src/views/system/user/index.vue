<template>
  <div>
    <div
      class="container animate__animated animate__slideInRight animate__faster"
    >
      <Breadcrumb :items="['menu.system', 'menu.system.user']" />
      <div class="content">
        <div id="mount" class="body">
          <div class="search">
            <a-form
              :model="userForm"
              :auto-label-width="true"
              :wrapper-col-props="{ span: 18 }"
              label-align="left"
            >
              <a-row :gutter="16">
                <a-col :span="6">
                  <a-form-item field="username" label="用户名">
                    <a-input
                      v-model="userForm.username"
                      size="medium"
                      placeholder="请输入用户名"
                    />
                  </a-form-item>
                </a-col>
                <a-col :span="6">
                  <a-form-item field="value2" label="邮箱">
                    <a-input
                      v-model="userForm.email"
                      size="medium"
                      placeholder="请输入邮箱"
                    />
                  </a-form-item>
                </a-col>
                <a-col :span="6">
                  <a-form-item field="status" label="状态">
                    <a-select
                      v-model="userForm.status"
                      :allow-clear="true"
                      size="medium"
                      placeholder="请选择状态"
                    >
                      <a-option :value="0">已启用</a-option>
                      <a-option :value="1">未启用</a-option>
                    </a-select>
                  </a-form-item>
                </a-col>
                <a-col :span="2">
                  <a-form-item :no-style="true">
                    <a-button type="primary" @click="search"
                      ><template #icon><icon-search /></template>搜索</a-button
                    >
                  </a-form-item>
                </a-col>
              </a-row>
            </a-form>
          </div>
          <div class="user-content">
            <a-divider style="margin-top: 0" />
            <div class="bt">
              <a-form-item :no-style="true">
                <a-button type="primary" status="success" @click="addUser">
                  <template #icon><icon-user-add /></template>
                  新增</a-button
                >
              </a-form-item>

              <a-form-item style="margin-bottom: 0">
                <a-popconfirm content="你确定要删除吗?">
                  <a-button type="primary" status="warning" @click="deleteUser"
                    ><template #icon><icon-delete /></template>删除</a-button
                  >
                </a-popconfirm>
              </a-form-item>
            </div>
          </div>
          <a-table
            row-key="id"
            :columns="(columns as TableData[])"
            :data="data"
            :pagination="pagination"
            page-position="br"
            :bordered="false"
            :hoverable="true"
            :stripe="false"
            :loading="false"
            :show-header="true"
            :row-selection="{ type: 'checkbox', showCheckedAll: true }"
          >
            <template #empty>
              <a-empty />
            </template>
            <template #status="{ record }"
              ><a-switch
                v-model="record.status"
                checked-color="#00B42A"
                :checked-value="1"
                :unchecked-value="0"
            /></template>
            <template #avatar>
              <a-image
                :preview-props="{
                  popupContainer: '#mount',
                  closable: true,
                  defaultVisible: false,
                  maskClosable: true,
                  actionsLayout: [
                    'fullScreen',
                    'rotateRight',
                    'rotateLeft',
                    'zoomIn',
                    'zoomOut',
                    'originalSize',
                  ],
                }"
                :show-loader="true"
                src="https://p1-arco.byteimg.com/tos-cn-i-uwbnlip3yd/3ee5f13fb09879ecb5185e440cef6eb9.png~tplv-uwbnlip3yd-webp.webp"
              />
            </template>
            <template #operate
              ><a-button-group type="outline">
                <a-space>
                  <a-button @click="edit">
                    <template #icon><icon-edit /></template>
                  </a-button>
                  <a-popconfirm content="你确定要删除吗?">
                    <a-button status="danger">
                      <template #icon><icon-delete /></template>
                    </a-button>
                  </a-popconfirm>
                </a-space> </a-button-group
            ></template>
          </a-table>
        </div>
        <a-modal
          v-model:visible="userModel.modelVisible"
          :title="'修改用户：' + 'lzr'"
          width="auto"
          :closable="false"
          @cancel="handleClick"
          @before-ok="handleBeforeOk"
        >
          <a-form
            :style="{ width: '380px' }"
            :model="userForm"
            :auto-label-width="true"
          >
            <div class="avatar-box">
              <a-avatar shape="square" class="avatar">
                <img
                  alt="avatar"
                  src="https://p1-arco.byteimg.com/tos-cn-i-uwbnlip3yd/3ee5f13fb09879ecb5185e440cef6eb9.png~tplv-uwbnlip3yd-webp.webp"
                />
              </a-avatar>

              <a-upload>
                <template #upload-button>
                  <a-button style="width: 120px; margin-top: 10px"
                    >修改头像
                  </a-button>
                </template>
              </a-upload>
            </div>
            <a-row :gutter="16">
              <a-form-item field="username" label="用户名">
                <a-input
                  v-model="userForm.username"
                  placeholder="请输入用户名"
                />
              </a-form-item>
              <a-form-item field="nickname" label="昵称">
                <a-input
                  v-model="userForm.nickname"
                  placeholder="请输入用户昵称"
                />
              </a-form-item>
              <a-form-item field="email" label="邮箱">
                <a-input v-model="userForm.email" placeholder="请输入邮箱" />
              </a-form-item>
              <a-form-item field="multiSelect" label="性别">
                <a-select v-model="userForm.sex" placeholder="请选择">
                  <a-option :value="1">男</a-option>
                  <a-option :value="2">女</a-option>
                  <a-option :value="0">保密</a-option>
                </a-select>
              </a-form-item>
              <a-form-item field="nickname" label="简介">
                <a-textarea
                  v-model="userForm.introduction"
                  placeholder="请输入简介"
                  default-value=""
                  auto-size
                />
              </a-form-item>
              <a-form-item field="123" label="禁用">
                <a-switch
                  v-model="userForm.status"
                  :default-checked="true"
                  checked-color="#00B42A"
                  :checked-value="1"
                  :unchecked-value="0"
                />
              </a-form-item>
            </a-row>
          </a-form>
        </a-modal>
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
  import { TableData } from '@arco-design/web-vue';
  import { reactive } from 'vue';

  //   const expandedKeys = ref([]);

  const userModel = reactive({
    modelVisible: false,
  });

  //   表单数据
  const userForm = reactive({
    username: '',
    nickname: '',
    email: '',
    status: 0,
    sex: 1,
    avatar: '',
    introduction: '',
  });
  // 分页数据
  const pagination = reactive({
    total: 50,
    current: 1,
    pageSize: 10,
    showTotal: true,
    showPageSize: true,
  });

  //   const selectedKeys = ref(['Jane Doe', 'Alisa Ross']);

  // 表头
  const columns = [
    { title: '用户编号', dataIndex: 'id', align: 'center' },
    { title: '用户名', dataIndex: 'username', align: 'center' },
    { title: '用户昵称', dataIndex: 'nickname', align: 'center' },
    { title: '邮箱', dataIndex: 'email', align: 'center' },
    { title: '创建时间', dataIndex: 'createTime', align: 'center' },
    { title: '状态', slotName: 'status', align: 'center' },
    { title: '头像', slotName: 'avatar', align: 'center' },
    { title: '操作', slotName: 'operate', align: 'center' },
  ];

  // 内容
  const data = [
    {
      id: '1',
      username: 'Quinlan',
      nickname: '王小皮',
      email: '1598042226@qq.com',
      createTime: '2022-10-20 24:23:22',
    },
    {
      id: '2',
      username: 'Jane Doe',
      nickname: '王小皮',
      email: 'jane.doe@example.com',
      createTime: '2022-10-20 24:23:22',
    },
  ];

  // user对话框取消
  const handleClick = () => {
    userModel.modelVisible = false;
  };

  // user对话框确定
  const handleBeforeOk = async () => {
    // eslint-disable-next-line no-promise-executor-return
    await new Promise((resolve) => setTimeout(resolve, 3000));
    return true;
    // prevent close
    // return false;
  };

  const edit = () => {
    userModel.modelVisible = true;
  };

  // 搜索用户
  const search = () => {};

  // 新增用户
  const addUser = () => {};

  // 删除用户
  const deleteUser = () => {};
</script>

<style scoped>
  thead {
    background-color: #fff !important;
  }

  .bt {
    display: flex;
    margin-bottom: 10px;
  }

  :deep(.arco-table-td-content .arco-image-img) {
    width: 40px;
    height: 40px;
    border-radius: 50%;
    cursor: pointer;
  }

  .avatar-box {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    text-align: center;
    margin-bottom: 10px;
  }

  .avatar {
    width: 120px;
    height: 120px;
  }
</style>
