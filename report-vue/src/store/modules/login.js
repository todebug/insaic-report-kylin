import * as types from '../mutation-types';

// initial state
const state = {
  // 页面初始化加载数据
  loginInfo: {
    // 登录验证成功标识
    loginFlag: false,
    // 用户名
    userCode: '',
    // 密码
    password: '',
    // 登录提示信息
    errorMsg: '',
  },
  // 麒麟页面菜单权限
  pageMenu: [],
};

// getters
// const getters = {
//   checkoutStatus: state.checkoutStatus,
// };

// actions
const actions = {
  login_authenticationInfo({ commit }, loginData) {
    commit(types.LOGIN_AUTHENTICATION, loginData);
  },
  login_logout({ commit }) {
    commit(types.LOGIN_LOGUOT);
  },
};

// mutations
const mutations = {
  [types.LOGIN_AUTHENTICATION](stateEslinitRule, loginData) {
    state.loginInfo.loginFlag = loginData.loginFlag;
    state.loginInfo.userCode = loginData.userCode;
    state.loginInfo.errorMsg = loginData.errorMsg;
    state.pageMenu = loginData.pageMenu;
  },
  [types.LOGIN_LOGUOT]() {
    state.loginInfo.loginFlag = false;
    state.loginInfo.userCode = '';
    state.loginInfo.password = '';
    state.loginInfo.errorMsg = '';
    state.pageMenu = [];
  },
};

export default {
  state,
  // getters,
  actions,
  mutations,
};
