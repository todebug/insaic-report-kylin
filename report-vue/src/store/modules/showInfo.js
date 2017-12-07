import * as types from '../mutation-types';

// initial state
const state = {
  // 查询结果展示信息
  showInfo: {
    cloumnInfos: [],
    results: [],
  },
};

// getters
// const getters = {
//   checkoutStatus: state.checkoutStatus,
// };

// actions
const actions = {
  queryForm_initKylinShowInfo({ commit }) {
    commit(types.INIT_KYLIN_INFO);
  },
  showInfo_renderTable({ commit }, fetchData) {
    commit(types.QUERY_RESULT_RENDER_TABLE, fetchData);
  },
};

// mutations
const mutations = {
  [types.INIT_KYLIN_INFO]() {
    // 渲染表格
    state.showInfo.cloumnInfos = [];
    state.showInfo.results = [];
  },
  [types.QUERY_RESULT_RENDER_TABLE](stateEslinitRule, fetchData) {
    // 渲染表格
    state.showInfo.cloumnInfos = [];
    state.showInfo.results = [];
    state.showInfo.cloumnInfos = fetchData.returnData.tableHead;
    state.showInfo.results = fetchData.returnData.tableBody;
  },
};

export default {
  state,
  // getters,
  actions,
  mutations,
};
