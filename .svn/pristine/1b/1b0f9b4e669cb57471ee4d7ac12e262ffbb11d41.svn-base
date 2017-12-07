<template>
  <div>
  	<query-bar-main></query-bar-main>
  	<show-bar-main></show-bar-main>
  </div>
</template>

<script>
import utils from '@/utils';
import queryBarMain from './view/queryBar/queryBarMain';
import showBarMain from './view/showBar/showBarMain';

export default {
  name: 'kylinReport',
  computed: {
    // 登录信息
    loginInfo() {
      return this.$store.state.loginInfo.loginInfo;
    },
  },
  beforeCreate() {
    // 页面初始化时加载页面查询展示信息
    const userCode = window.localStorage.getItem('userCode');
    const url = `/kylin/loadInitInfo/false/${userCode}`;
    utils.ajax('GET')(url).then(
      json => {
        // console.log(json);
        // window.localStorage.setItem('aaa', JSON.stringify(json));
        this.$store.dispatch('queryForm_initLoadInfo', json);
      });
    // const json = JSON.parse(window.localStorage.getItem('aaa'));
    // console.log(utils.serialize(json));
    // this.$store.dispatch('queryForm_initLoadInfo', json);
  },
  components: {
    'query-bar-main': queryBarMain,
    'show-bar-main': showBarMain,
  },
};
</script>

<style scoped>

</style>
