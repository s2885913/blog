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
                    <div style="height: 20%; margin-top: 20px"
                      >123123 <span>123123</span></div
                    >
                    <div style="height: 20%">123123 <span>123123</span></div>
                  </div>
                </template>
              </a-upload>
            </a-form-item>
          </a-col>
          <a-col :span="5">
            <a-form-item field="isComment" label="是否开启评论">
              <a-radio-group v-model="form.isComment">
                <a-radio value="1">是</a-radio>
                <a-radio value="0">否</a-radio>
              </a-radio-group>
            </a-form-item>
          </a-col>
          <a-col :span="7">
            <a-form-item field="isTop" label="是否文章置顶">
              <a-radio-group v-model="form.isTop">
                <a-radio value="1">是</a-radio>
                <a-radio value="0">否</a-radio>
              </a-radio-group>
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
  import VMdEditor from '@kangc/v-md-editor';

  const text = ref('');

  const previewData = ref('~~12312312312~~');
  const form = reactive({
    title: '',
    classify: '',
    tag: [],
    isComment: true,
    isTop: true,
    content: '',
  });
</script>

<style scoped lang="less">
  .container {
    background-color: var(--color-fill-2);
    padding: 0 20px 20px 20px;
  }

  .content {
    padding-top: 20px;
    background-color: #fff;
    margin-top: 10px;
    border-radius: 5px;
  }

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
