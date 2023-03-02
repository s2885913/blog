<template>
  <div
    class="container animate__animated animate__slideInRight animate__faster"
  >
    <Breadcrumb :items="['menu.article', 'menu.article.write']" />
    <div class="content">
      <div class="body">
        <a-form
          :model="form"
          label-align="left"
          :auto-label-width="true"
          :wrapper-col-props="{ span: 18 }"
        >
          <a-row :gutter="16">
            <a-col :span="7">
              <a-form-item field="title" label="文章标题">
                <a-input
                  v-model="form.title"
                  size="medium"
                  placeholder="请输入文章标题"
                />
              </a-form-item>
            </a-col>
            <a-col :span="7">
              <a-form-item field="classify" label="文章分类">
                <a-select
                  v-model="form.classify"
                  placeholder="请选择"
                  :allow-clear="true"
                  size="medium"
                >
                  <a-option value="section one">Section One</a-option>
                  <a-option value="section two">Section Two</a-option>
                  <a-option value="section three">Section Three</a-option>
                </a-select>
              </a-form-item>
            </a-col>
            <a-col :span="10">
              <a-form-item field="tag" label="文章标签">
                <a-select
                  v-model="form.tag"
                  :allow-clear="true"
                  placeholder="请选择"
                  multiple
                >
                  <a-option value="section one">Section One</a-option>
                  <a-option value="section two">Section Two</a-option>
                  <a-option value="section three">Section Three</a-option>
                  <a-option value="section four">Section Three</a-option>
                </a-select>
              </a-form-item>
            </a-col>
          </a-row>
          <a-row :gutter="16">
            <a-col :span="7">
              <a-form-item field="title" label="缩略图">
                <a-upload action="/">
                  <template #upload-button>
                    <div class="upload">
                      <div style="height: 38%; margin-top: -20px"
                        ><icon-upload :size="35"
                      /></div>
                      <div style="height: 10%; margin-top: -8px"
                        >将文件拖到此处或
                        <span style="color: #3370ff">点击上传</span></div
                      >
                    </div>
                  </template>
                </a-upload>
              </a-form-item>
            </a-col>
            <a-col :span="7">
              <a-form-item field="isComment" label="开启评论">
                <a-switch
                  v-model="form.isComment"
                  checked-color="#00B42A"
                  :checked-value="1"
                  :unchecked-value="0"
                />
              </a-form-item>
              <a-form-item :no-style="true">
                <a-button type="primary" @click="preserve">
                  <template #icon><icon-save /></template>
                  保存</a-button
                >
              </a-form-item>
            </a-col>
            <a-col :span="7">
              <a-form-item field="isTop" label="文章置顶">
                <a-switch
                  v-model="form.isTop"
                  checked-color="#00B42A"
                  :checked-value="1"
                  :unchecked-value="0"
                />
              </a-form-item>
              <a-form-item :no-style="true">
                <a-button type="primary" @click="publish">
                  <template #icon><icon-send /></template>发布</a-button
                >
              </a-form-item>
            </a-col>
          </a-row>
        </a-form>
        <div class="ed">
          <md-editor
            v-model="state.text"
            :no-prettier="true"
            preview-theme="vuepress"
            :auto-detect-code="true"
            @on-get-catalog="onGetCatalog"
          >
          </md-editor>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
  import { reactive } from 'vue';
  import MdEditor from 'md-editor-v3';
  import 'md-editor-v3/lib/style.css';

  // markdown编辑器设置
  const state = reactive({
    text: '',
    catalogList: [],
  });

  const form = reactive({
    title: '',
    classify: '',
    tag: [],
    isComment: 0,
    isTop: 1,
    content: '',
  });

  const onGetCatalog = (list: any) => {
    state.catalogList = list;
    console.log(state.catalogList);
  };

  // 文章保存到草稿箱
  const preserve = () => {};

  // 文章发布
  const publish = () => {};
</script>

<style scoped lang="less">
  .ed {
    margin-top: 30px;
    padding: 0 10px;
  }

  :deep(.arco-upload) {
    width: 100%;
  }

  .arco-btn-group .arco-btn:last-child {
    border-radius: 5px !important;
  }

  .upload {
    position: relative;
    background-color: var(--color-bg-1);
    color: var(--color-text-1);
    border: 1px dashed var(--color-fill-4);
    height: 158px;
    border-radius: 5px;
    line-height: 158px;
    text-align: center;
  }

  .upload-content {
    width: 100%;
    height: 100%;
    position: absolute;
    left: 50%;
    top: 50%;
    transform: translate(-50%, -50%);
  }

  .arco-switch {
    border-radius: 12px !important;
  }
</style>
