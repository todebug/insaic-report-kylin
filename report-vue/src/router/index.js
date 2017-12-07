import Vue from 'vue';
import Router from 'vue-router';
// import Hello from '@/components/Hello';
// import dimReport from '@/components/dimReport/view/dimReport';

Vue.use(Router);

// const Hello = resolve => require('@/components/Hello', resolve);
// const dimReport = resolve => require(['@/components/dimReport/dimReport'], resolve);
// const Hello = () => import('@/components/Hello');
const kylinReport = () => import('@/components/kylinReport/kylinReport');
const login = () => import('@/components/login/login');
const kylinConfig = () => import('@/components/kylinConfig/kylinConfig');

const routes = [
  // {
  //   path: '/',
  //   name: 'Hello',
  //   component: Hello,
  // },
  {
    path: '/kylin',
    name: 'kylinReport',
    component: kylinReport,
  },
  {
    path: '/login',
    name: 'login',
    component: login,
  },
  {
    path: '/kylinConfig',
    name: 'kylinConfig',
    component: kylinConfig,
  },
];

const router = new Router({
  routes,
});

export default router;
