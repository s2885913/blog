<template>
  <div>
    <div class="container">
      <Breadcrumb :items="['menu.system', 'menu.system.user']" />
      <div class="content">
        <div class="search">
          <a-row :gutter="16">
            <a-col :span="5">
              <a-form-item
                field="username"
                label="用户名"
                label-col-flex="70px"
              >
                <a-input v-model="form.username" placeholder="请输入用户名" />
              </a-form-item>
            </a-col>
            <a-col :span="5">
              <a-form-item field="value2" label="邮箱" label-col-flex="50px">
                <a-input v-model="form.email" placeholder="请输入邮箱" />
              </a-form-item>
            </a-col>
            <a-col :span="5">
              <a-form-item field="status" label="状态" label-col-flex="50px">
                <a-select v-model="form.status" placeholder="请选择状态">
                  <a-option value="0">已禁用</a-option>
                  <a-option value="1">未禁用</a-option>
                </a-select>
              </a-form-item>
            </a-col>
            <a-col :span="6">
              <a-form-item>
                <a-button type="primary" @click="search"
                  ><template #icon><icon-search /></template>搜索</a-button
                >
              </a-form-item>
            </a-col>
          </a-row>
        </div>

        <div class="user-content">
          <div class="bt">
            <a-row :gutter="16">
              <a-space :size="-5">
                <a-col :span="1">
                  <a-form-item label-col-flex="10px">
                    <a-button type="primary" status="success" @click="addUser">
                      <template #icon><icon-user-add /></template>
                      新增</a-button
                    >
                  </a-form-item>
                </a-col>
                <a-col :span="1">
                  <a-form-item label-col-flex="0px">
                    <a-button type="primary" status="danger" @click="deleteUser"
                      ><template #icon><icon-delete /></template>删除</a-button
                    >
                  </a-form-item>
                </a-col>
              </a-space>
            </a-row>
          </div>
        </div>
        <a-table
          row-key="id"
          :columns="columns"
          :data="data"
          :table-layout-fixed="true"
          :pagination="true"
          page-position="br"
          :bordered="false"
          :hoverable="true"
          :stripe="false"
          :loading="false"
          :show-header="true"
          :row-selection="rowSelection"
        >
          <template #status="{ record }"
            ><a-switch
              v-model="record.status"
              checked-color="#00B42A"
              checked-value="1"
              unchecked-value="0"
          /></template>
        </a-table>
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
  import { reactive, ref } from 'vue';

  //   const expandedKeys = ref([]);

  const form = reactive({
    username: '',
    email: '',
    status: '',
  });

  const selectedKeys = ref(['Jane Doe', 'Alisa Ross']);

  const rowSelection = reactive({
    type: 'checkbox',
    showCheckedAll: true,
  });
  const columns = [
    { title: '用户编号', dataIndex: 'id' },
    { title: '用户名', dataIndex: 'username' },
    { title: '邮箱', dataIndex: 'email' },
    { title: '创建时间', dataIndex: 'createTime' },
    { title: '状态', slotName: 'status' },
    { title: '操作', dataIndex: 'operate' },
  ];

  const data = [
    {
      id: '1',
      username: 'Jane Doe',
      email: 'jane.doe@example.com',
      createTime: '2022-10-20 24:23:22',
    },
    {
      id: '2',
      username: 'Jane Doe',
      email: 'jane.doe@example.com',
      createTime: '2022-10-20 24:23:22',
    },
  ];

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
  .user-content {
    margin-top: 20px;
  }
</style>
