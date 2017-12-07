// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Element from 'element-ui';
// import 'element-ui/lib/theme-default/index.css';
import 'element-ui/lib/theme-chalk/index.css';
import 'whatwg-fetch';
import Vue from 'vue';
import $ from 'jquery';
import iView from 'iview';
import 'iview/dist/styles/iview.css';
import App from './App';
import router from './router';
import store from './store';


Vue.config.productionTip = false;
// 全局jquery配置 => this.$
Vue.prototype.$ = $;
// window.$ = $;
Vue.use(Element);
Vue.use(iView);
/* eslint-disable no-new */
router.beforeEach((to, from, next) => {
  const loginFlag = window.localStorage.getItem('loginFlag');
  if (to.name !== 'login' && (loginFlag === null || loginFlag === false || loginFlag === 'false')) {
    next('/login');
  } else {
    if (loginFlag === true || loginFlag === 'true') {
      const pageMenu = window.localStorage.getItem('pageMenu');
      store.dispatch('common_pageMenuControl', pageMenu.split(','));
    }
    // if (to.name !== 'login' && store.state.loginInfo.loginInfo.loginFlag === false) {
    if (to.name !== 'login' && (loginFlag === 'false' || loginFlag === false)) {
      next('/login');
    } else {
      next();
    }
    // next();
  }
});

new Vue({
  el: '#app',
  router,
  store,
  render: h => h(App),
});
