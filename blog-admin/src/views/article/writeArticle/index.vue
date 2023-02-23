<template>
  <div class="container">
    <Breadcrumb :items="['menu.article', 'menu.article.write']" />
    <div class="content">
      <a-form :model="form" label-align="right" :auto-label-width="true">
        <a-row :gutter="0" justify="space-around">
          <a-col :span="7">
            <a-form-item field="title" label="文章标题" label-col-flex="100px">
              <a-input
                v-model="form.title"
                size="large"
                placeholder="请输入文章标题"
              />
            </a-form-item>
          </a-col>
          <a-col :span="5">
            <a-form-item
              field="classify"
              label="文章分类"
              :rules="[{ match: /section one/, message: 'must select one' }]"
            >
              <a-select
                v-model="form.classify"
                placeholder="请选择"
                size="large"
              >
                <a-option value="section one">Section One</a-option>
                <a-option value="section two">Section Two</a-option>
                <a-option value="section three">Section Three</a-option>
              </a-select>
            </a-form-item>
          </a-col>
          <a-col :span="7">
            <a-form-item field="tag" label="文章标签">
              <a-select v-model="form.tag" placeholder="请选择" multiple>
                <a-option value="section one">Section One</a-option>
                <a-option value="section two">Section Two</a-option>
                <a-option value="section three">Section Three</a-option>
              </a-select>
            </a-form-item>
          </a-col>
        </a-row>
        <a-row :gutter="0" justify="space-around">
          <a-col :span="7">
            <a-form-item field="title" label="缩略图" label-col-flex="100px">
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
          <a-col :span="5">
            <a-form-item field="isComment" label="是否开启评论">
              <a-radio-group v-model="form.isComment" size="large">
                <a-radio value="1">是</a-radio>
                <a-radio value="0">否</a-radio>
              </a-radio-group>
            </a-form-item>
            <a-form-item>
              <a-button type="primary" @click="preserve">
                <template #icon><icon-save /></template> 保存到草稿箱</a-button
              >
            </a-form-item>
          </a-col>
          <a-col :span="7">
            <a-form-item field="isTop" label="是否文章置顶">
              <a-radio-group v-model="form.isTop" size="large">
                <a-radio value="1">是</a-radio>
                <a-radio value="0">否</a-radio>
              </a-radio-group>
            </a-form-item>
            <a-form-item>
              <a-button type="primary" @click="publish">
                <template #icon><icon-send /></template>发布</a-button
              >
            </a-form-item>
          </a-col>
        </a-row>
      </a-form>
      <div class="ed">
        <md-editor v-model="previewData" />
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
  import { reactive, ref } from 'vue';
  import mdEditor from '@/components/md-edtior/index.vue';

  const previewData = ref('');

  const form = reactive({
    title: '',
    classify: '',
    tag: [],
    isComment: true,
    isTop: true,
    content: '',
  });

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

  .upload {
    position: relative;
    background-color: #fff;
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
</style>
