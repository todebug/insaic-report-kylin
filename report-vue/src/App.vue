<style scoped>
.layout{
    border: 1px solid #d7dde4;
    background: #f5f7f9;
    position: relative;
    border-radius: 4px;
    overflow: hidden;
}
.layout-breadcrumb{
    padding: 10px 15px 0;
}
.layout-content{
    min-height: 800px;
    margin: 15px;
    overflow: hidden;
    background: #f5f7f9;
    border-radius: 4px;
    overflow: scroll;
    height: 600px;
}
.layout-content-main{
    padding: 10px;
}
.layout-copy{
    text-align: center;
    padding: 10px 0 20px;
    color: #9ea7b4;
}
.layout-menu-left{
    background: #fff;
    border-right: 1px solid transparent;
}
.layout-header{
    height: 40px;
    background: #fff;
    box-shadow: 0 1px 1px rgba(0,0,0,.1);
}
.layout-logo-left{
    height: 40px;
    padding: 15px;
    background: url("./assets/insaic.png") center no-repeat;
    border-radius: 3px;
    background-size: 57px 40px;
    background-color: #f8f8f9;
}
.layout-ceiling-main a{
    color: #9ba7b5;
}
.layout-hide-text .layout-text{
    display: none;
}
.ivu-col{
    transition: width .2s ease-in-out;
}
.ivu-menu-vertical .ivu-menu-item, .ivu-menu-vertical .ivu-menu-submenu-title {
    padding: 14px 12px;
}
::-webkit-scrollbar {
  width: 0px;
}
.logout {
  float: right;
  padding: 10px;
  margin: 10px;
  color: #409EFF;
}
.logout :hover{
  color: gray;
  cursor: pointer;
}
</style>
<template>
    <div class="layout" :class="{'layout-hide-text': spanLeft < 3}">
        <Row type="flex">
            <Col :span="spanLeft" class="layout-menu-left">
                <Menu active-name="1" theme="light" width="auto" @on-select="gotoNavigation">
                    <div class="layout-logo-left"></div>
                    <MenuItem name="1" v-bind:style="{ display: pageMenu.kylinQuery }">
                        <Icon type="ios-navigate" :size="iconSize"></Icon>
                        <span class="layout-text">报表查询</span>
                    </MenuItem>
                    <MenuItem name="2" v-bind:style="{ display: pageMenu.kylinConfig }">
                        <Icon type="ios-analytics" :size="iconSize"></Icon>
                        <span class="layout-text">报表配置</span>
                    </MenuItem>
                </Menu>
            </Col>
            <Col :span="spanRight">
                <div class="layout-header">
                    <Button type="text" @click="toggleClick">
                        <Icon type="navicon" size="32"></Icon>
                    </Button>
                    <div class="logout" @click="logout">
                      <span>登出</span>
                    </div>
                </div>
                <div class="layout-breadcrumb">
                    <Breadcrumb>
                        <BreadcrumbItem href="/">首页</BreadcrumbItem>
                        <span v-if="breadcrumbTip==='kylin'">
                          <BreadcrumbItem href="kylin" >报表查询</BreadcrumbItem>
                        </span>
                        <span v-if="breadcrumbTip==='kylinConfig'">
                          <BreadcrumbItem href="kylinConfig" >报表配置</BreadcrumbItem>
                        </span>
                    </Breadcrumb>
                </div>
                <div class="layout-content">
                    <div class="layout-content-main" id="app">
                      <router-view></router-view>
                    </div>
                </div>
                <div class="layout-copy">
                    2016-2017 &copy; KylinData &copy; dongyang
                </div>
            </Col>
        </Row>
    </div>
</template>
<script>

export default {
  data() {
    return {
      spanLeft: 1,
      spanRight: 23,
      breadcrumbTip: 'kylin',
    };
  },
  computed: {
    iconSize() {
      return this.spanLeft === 3 ? 16 : 24;
    },
    pageMenu() {
      return this.$store.state.common.pageMenu;
    },
  },
  methods: {
    logout() {
      this.$confirm('确认登出, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning',
      }).then(() => {
        window.localStorage.setItem('loginFlag', false);
        window.localStorage.setItem('userCode', '');
        window.localStorage.setItem('pageMenu', '');
        this.$store.dispatch('common_pageMenuControl', []);
        this.$store.dispatch('login_logout');
        this.$router.push({ path: '/login' });
        this.$message({
          type: 'success',
          message: '登出成功!',
        });
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '操作已取消!',
        });
      });
    },
    gotoNavigation(name) {
      if (name === '1') {
        this.$store.dispatch('queryForm_initKylinQueryInfo');
        this.$store.dispatch('queryForm_initKylinShowInfo');
        this.breadcrumbTip = 'kylin';
        this.$router.push({ path: 'kylin' });
      } else if (name === '2') {
        this.breadcrumbTip = 'kylinConfig';
        this.$router.push({ path: '/kylinConfig' });
      }
    },
    toggleClick() {
      if (this.spanLeft === 3) {
        this.spanLeft = 1;
        this.spanRight = 23;
      } else {
        this.spanLeft = 3;
        this.spanRight = 21;
      }
    },
  },
};
</script>
