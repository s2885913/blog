import axios from 'axios';

// 创建axios实例
const $http = axios.create({
  // 请求的域名，基本地址，proxy 代理时会将“/api”以及前置字符串会被替换为真正域名
  baseURL: '/api',
  // 跨域请求时发送Cookie
  // withCredentials: true, // 视情况而定
  // 超时时间
  timeout: 5000,
  headers: {
    'content-type': 'application/json; charset=utf-8',
  },
});

// 请求拦截
$http.interceptors.request.use(
  (config) => {},
  (err) => Promise.reject() 
);

// 响应拦截
$http.interceptors.response.use(
  (res) => {},
  (err) => Promise.reject()
);

export default $http;
