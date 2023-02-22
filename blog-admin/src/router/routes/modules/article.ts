import { DEFAULT_LAYOUT } from '../base';
import { AppRouteRecordRaw } from '../types';

const ARTICLE: AppRouteRecordRaw = {
  path: '/article',
  name: 'article',
  component: DEFAULT_LAYOUT,
  meta: {
    locale: 'menu.article',
    requiresAuth: true,
    icon: 'icon-book',
    order: 1,
  },
  children: [
    {
      path: 'write',
      name: 'write',
      component: () => import('@/views/article/writeArticle/index.vue'),
      meta: {
        locale: 'menu.article.write',
        icon: 'icon-pen-fill',
        order: 0,
        requiresAuth: true,
        roles: ['*'],
      },
    },
  ],
};

export default ARTICLE;
