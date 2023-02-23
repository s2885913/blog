<template>
  <div>
    <div class="container">
      <Breadcrumb :items="['menu.system', 'menu.system.user']" />
      <div class="content">
        <div class="body">
          <div class="search">
            <a-row :gutter="16">
              <a-col :span="7">
                <a-form-item field="username" label="用户名">
                  <a-input
                    v-model="form.username"
                    size="large"
                    placeholder="请输入用户名"
                  />
                </a-form-item>
              </a-col>
              <a-col :span="7">
                <a-form-item field="value2" label="邮箱" label-col-flex="50px">
                  <a-input
                    v-model="form.email"
                    size="large"
                    placeholder="请输入邮箱"
                  />
                </a-form-item>
              </a-col>
              <a-col :span="7">
                <a-form-item field="status" label="状态" label-col-flex="50px">
                  <a-select
                    v-model="form.status"
                    size="large"
                    placeholder="请选择状态"
                  >
                    <a-option value="0">已启用</a-option>
                    <a-option value="1">未启用</a-option>
                  </a-select>
                </a-form-item>
              </a-col>
              <a-col :span="2">
                <a-form-item>
                  <a-button type="outline" @click="search"
                    ><template #icon><icon-search /></template>搜索</a-button
                  >
                </a-form-item>
              </a-col>
            </a-row>
          </div>
          <div class="user-content">
            <a-divider style="margin-top: 0" />
            <div class="bt">
              <a-row justify="start">
                <a-col :span="2">
                  <a-form-item :no-style="true">
                    <a-button type="outline" status="success" @click="addUser">
                      <template #icon><icon-user-add /></template>
                      新增</a-button
                    >
                  </a-form-item>
                </a-col>
                <a-col :span="2">
                  <a-form-item :no-style="true">
                    <a-popconfirm content="你确定要删除吗?">
                      <a-button
                        type="outline"
                        status="danger"
                        @click="deleteUser"
                        ><template #icon><icon-delete /></template
                        >删除</a-button
                      >
                    </a-popconfirm>
                  </a-form-item>
                </a-col>
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
            :row-selection="{ type: 'checkbox', showCheckedAll: true }"
          >
            <template #status="{ record }"
              ><a-switch
                v-model="record.status"
                checked-color="#00B42A"
                checked-value="1"
                unchecked-value="0"
            /></template>
            <template #operate
              ><a-button-group type="outline">
                <a-space>
                  <a-button>
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
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
  import { reactive } from 'vue';

  //   const expandedKeys = ref([]);

  const form = reactive({
    username: '',
    email: '',
    status: '',
  });

  //   const selectedKeys = ref(['Jane Doe', 'Alisa Ross']);

  const columns = [
    { title: '用户编号', dataIndex: 'id', align: 'center' },
    { title: '用户名', dataIndex: 'username', align: 'center' },
    { title: '邮箱', dataIndex: 'email', align: 'center' },
    { title: '创建时间', dataIndex: 'createTime', align: 'center' },
    { title: '状态', slotName: 'status', align: 'center' },
    { title: '操作', slotName: 'operate', align: 'center' },
  ];

  const data = [
    {
      id: '1',
      username: 'Quinlan',
      email: '1598042226@qq.com',
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

  .bt {
    margin-bottom: 10px;
  }

  .arco-table-td-content .arco-switch {
    border-radius: 12px !important;
  }
</style>
