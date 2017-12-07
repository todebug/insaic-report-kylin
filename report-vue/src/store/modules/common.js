import * as types from '../mutation-types';

// initial state
const state = {
  // loading状态
  fullscreenLoading: false,
  // 页面菜单是否显示 none || block
  pageMenu: {
    kylinConfig: 'none',
    kylinQuery: 'none',
  },
};

// getters
// const getters = {
//   checkoutStatus: state.checkoutStatus,
// };

// actions
const actions = {
  common_showLoading({ commit }, fag) {
    commit(types.QUERY_LOADING_CONTROL, fag);
  },
  common_pageMenuControl({ commit }, pageMenus) {
    commit(types.QUERY_PAGEMENU_CONTROL, pageMenus);
  },
};

// mutations
const mutations = {
  [types.QUERY_LOADING_CONTROL](stateEslinitRule, flag) {
    // loading状态控制
    state.fullscreenLoading = flag;
  },
  [types.QUERY_PAGEMENU_CONTROL](stateEslinitRule, pageMenus) {
    // 页面菜单状态控制
    state.pageMenu.kylinConfig = 'none';
    state.pageMenu.kylinQuery = 'none';
    if (pageMenus && pageMenus.length) {
      pageMenus.forEach(v => {
        if (v === 'kylinConfig') {
          state.pageMenu.kylinConfig = 'block';
        } else if (v === 'kylinQuery') {
          state.pageMenu.kylinQuery = 'block';
        }
      });
    }
  },
};

export default {
  state,
  // getters,
  actions,
  mutations,
};
