<template>
  <div class="loginMain">
    <div class="loginLogo">

    </div>
    <div class="loginForm">
      <Form ref="formInline" :model="formInline" :rules="ruleInline">
          <FormItem prop="user">
              <Input type="text" v-model="formInline.user" placeholder="Username">
                  <Icon type="ios-person-outline" slot="prepend"></Icon>
              </Input>
          </FormItem>
          <FormItem prop="password">
              <Input type="password" v-model="formInline.password" placeholder="Password">
                  <Icon type="ios-locked-outline" slot="prepend"></Icon>
              </Input>
          </FormItem>
          <FormItem>
              <Button type="primary" @click="handleSubmit('formInline')"
                element-loading-text="拼命加载中"
                v-loading.fullscreen.lock="fullscreenLoading">登录</Button>
          </FormItem>
      </Form>
    </div>
  </div>
</template>
<script>
import utils from '@/utils';

export default {
  data() {
    return {
      formInline: {
        user: '',
        password: '',
      },
      ruleInline: {
        user: [
          { required: true, message: '请填写用户名', trigger: 'blur' },
        ],
        password: [
          { required: true, message: '请填写密码', trigger: 'blur' },
          { type: 'string', min: 6, message: '密码长度不能小于6位', trigger: 'blur' },
        ],
      },
    };
  },
  watch: {
    // loginInfo: {
    //   handler(curVal) {
    //     if (curVal.loginFlag) {
    //       this.$Message.success('登录成功!');
    //       this.$router.push({ path: 'kylin' });
    //     } else {
    //       this.$Message.error(curVal.errorMsg);
    //     }
    //   },
    //   deep: true,
    // },
  },
  computed: {
    // 登录信息
    loginInfo() {
      return this.$store.state.loginInfo.loginInfo;
    },
    // 全屏加载
    fullscreenLoading() {
      return this.$store.state.common.fullscreenLoading;
    },
  },
  methods: {
    handleSubmit(name) {
      this.$refs[name].validate((valid) => {
        if (valid) {
          this.$store.dispatch('common_showLoading', true);
          const url = `/kylin/login/verify/${this.formInline.user}/${this.formInline.password}`;
          utils.ajax('GET')(url).then(
            json => {
              this.$store.dispatch('login_authenticationInfo', json);
              this.$nextTick(() => this.$store.dispatch('common_showLoading', false));
              if (this.loginInfo.loginFlag) {
                this.$store.dispatch('common_pageMenuControl', json.pageMenu);
                window.localStorage.setItem('pageMenu', json.pageMenu);
                window.localStorage.setItem('loginFlag', true);
                window.localStorage.setItem('userCode', this.formInline.user);
                this.$Message.success('登录成功!');
                this.$router.push({ path: 'kylin' });
              } else {
                this.$Message.error(this.loginInfo.errorMsg);
              }
            });
        } else {
          this.$Message.error('登录验证失败!');
        }
      });
    },
  },
};
</script>
<style media="screen" scoped="">
.loginMain {
  position: absolute;
  background: url("../../assets/login-bg.png") center center no-repeat;
  background-size: cover;
  top: 0;
  left: -15%;
  right: 0;
  bottom: 0;
  z-index: 4;
}
.loginLogo {
  position: absolute;
  background: url("../../assets/login-icons.png") 0 -145px no-repeat;
  width: 289px;
  height: 85px;
  left: 10%;
  top: 60px;
}
.loginForm {
  /*background: #388bbd;
  opacity: .6*/
  top: 350px;
  position: relative;
  left: 33%;
  width: 200px;
}
</style>
