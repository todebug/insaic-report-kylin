import * as types from '../mutation-types';

// initial state
const state = {
  // 页面初始化加载数据
  configQueryInfo: [],
  // 待处理配置信息
  peddingConfigInfo: [],
  // 用户自定义字段信息
  kylinLimitInfos: [],
  // form中展示内容
  form: {
    uuid: '',
    projectCode: '',
    projectName: '',
    modelCode: '',
    modelName: '',
    cubeCode: '',
    cubeName: '',
    // 主表信息
    kylinPrimaryTable: {},
    // 度量信息
    kylinLoadMeasures: [],
    // 伪表信息
    kylinForeignTables: [],
    // 关联字段信息
    kylinJoinInfos: [],
    // 用户自定义字段信息
    kylinLimitInfos: [],
  },
};

// getters
// const getters = {
//   checkoutStatus: state.checkoutStatus,
// };

// actions
const actions = {
  kylinConfig_setFormInfo({ commit }, row) {
    commit(types.KYLINCONFIG_SET_FORM_INFO, row);
  },
  kylinConfig_showConfigInfo({ commit }, configInfo) {
    commit(types.KYLINCONFIG_SHOW_CONFIG_INFO, configInfo);
  },
  kylinConfig_editConfigInfo({ commit }, form) {
    commit(types.KYLINCONFIG_EDIT_CONFIG_INFO, form);
  },
  kylinConfig_deleteConfigInfo({ commit }, form) {
    commit(types.KYLINCONFIG_DELETE_CONFIG_INFO, form);
  },
  kylinConfig_newConfigInfo({ commit }, form) {
    commit(types.KYLINCONFIG_NEW_CONFIG_INFO, form);
  },
  kylinConfig_clearForm({ commit }, json) {
    commit(types.KYLINCONFIG_CLEAR_FORM, json);
  },
  kylinConfig_selectPeddingCube({ commit }, selectPeddingCube) {
    commit(types.SELECT_PEDDING_CUBE, selectPeddingCube);
  },
  kylinConfig_deleteUserDefinedTerm({ commit }, deleteInfo) {
    commit(types.DELETE_USER_DEFINED_TERM, deleteInfo);
  },
  kylinConfig_resetUserDefinedTerm({ commit }) {
    commit(types.RESET_USER_DEFINED_TERM);
  },
};

// mutations
const mutations = {
  [types.KYLINCONFIG_SET_FORM_INFO](stateEslinitRule, row) {
    // 展示form表单
    state.form.uuid = '';
    state.form.projectCode = '';
    state.form.projectName = '';
    state.form.modelCode = '';
    state.form.modelName = '';
    state.form.cubeCode = '';
    state.form.cubeName = '';
    state.form.kylinPrimaryTable = {};
    state.form.kylinLoadMeasures = [];
    state.form.kylinForeignTables = [];
    state.form.kylinJoinInfos = [];
    state.form.kylinLimitInfos = [];
    state.form.uuid = row.uuid;
    state.configQueryInfo.forEach(v => {
      if (v.uuid === row.uuid) {
        state.form.projectCode = v.projectCode;
        state.form.projectName = v.projectName;
        state.form.modelCode = v.modelCode;
        state.form.modelName = v.modelName;
        state.form.cubeCode = v.cubeCode;
        state.form.cubeName = v.cubeName;
        state.form.kylinPrimaryTable = v.kylinPrimaryTable;
        state.form.kylinLoadMeasures = v.kylinLoadMeasures;
        state.form.kylinForeignTables = v.kylinForeignTables;
        state.form.kylinJoinInfos = v.kylinJoinInfos;
        state.form.kylinLimitInfos = v.kylinLimitInfos;
        state.kylinLimitInfos = [];
        state.kylinLimitInfos = v.kylinLimitInfos;
      }
    });
  },
  [types.KYLINCONFIG_SHOW_CONFIG_INFO](stateEslinitRule, configInfo) {
    // 展示配置信息
    state.configQueryInfo = configInfo.kylinConfigInfo;
  },
  [types.KYLINCONFIG_EDIT_CONFIG_INFO](stateEslinitRule, form) {
    // 编辑表单信息
    state.configQueryInfo.forEach(v => {
      if (v.uuid === form.uuid) {
        v.projectCode = form.projectCode;
        v.projectName = form.projectName;
        v.modelCode = form.modelCode;
        v.modelName = form.modelName;
        v.cubeCode = form.cubeCode;
        v.cubeName = form.cubeName;
        v.kylinPrimaryTable = form.kylinPrimaryTable;
        v.kylinLoadMeasures = form.kylinLoadMeasures;
        v.kylinForeignTables = form.kylinForeignTables;
        v.kylinJoinInfos = form.kylinJoinInfos;
        v.kylinLimitInfos = form.kylinLimitInfos;
      }
    });
  },
  [types.KYLINCONFIG_DELETE_CONFIG_INFO](stateEslinitRule, form) {
    // 删除表单信息
    state.configQueryInfo = state.configQueryInfo.filter(v => v.uuid !== form.uuid);
  },
  [types.KYLINCONFIG_NEW_CONFIG_INFO](stateEslinitRule, form) {
    // 新增配置信息
    state.configQueryInfo.push(form);
  },
  [types.KYLINCONFIG_CLEAR_FORM](stateEslinitRule, json) {
    // 新增操作,清空form
    if (json.kylinPendingDataFlag === true) {
      state.peddingConfigInfo = json.kylinPendingDatas;
    } else {
      state.peddingConfigInfo = [];
    }
    state.form.uuid = '';
    state.form.projectCode = '';
    state.form.projectName = '';
    state.form.modelCode = '';
    state.form.modelName = '';
    state.form.cubeCode = '';
    state.form.cubeName = '';
    state.form.kylinPrimaryTable = {};
    state.form.kylinLoadMeasures = [];
    state.form.kylinForeignTables = [];
    state.form.kylinJoinInfos = [];
    state.form.kylinLimitInfos = [];
    // 初始化清空用户自定义条件,针对用户当前手动删除操作
    state.kylinLimitInfos = [];
  },
  [types.SELECT_PEDDING_CUBE](stateEslinitRule, selectPeddingCube) {
    // 配置form信息
    if (selectPeddingCube === '') {
      state.form.uuid = '';
      state.form.projectCode = '';
      state.form.projectName = '';
      state.form.modelCode = '';
      state.form.modelName = '';
      state.form.cubeCode = '';
      state.form.cubeName = '';
      state.form.kylinPrimaryTable = {};
      state.form.kylinLoadMeasures = [];
      state.form.kylinForeignTables = [];
      state.form.kylinJoinInfos = [];
      state.form.kylinLimitInfos = [];
    } else {
      state.peddingConfigInfo.forEach(v => {
        if (v.cubeCode === selectPeddingCube) {
          state.form.uuid = v.uuid;
          state.form.projectCode = '';
          state.form.projectName = '';
          state.form.modelCode = v.modelCode;
          state.form.modelName = '';
          state.form.cubeCode = v.cubeCode;
          state.form.cubeName = '';
          state.form.kylinPrimaryTable = v.kylinPrimaryTable;
          state.form.kylinLoadMeasures = v.kylinLoadMeasures;
          state.form.kylinForeignTables = v.kylinForeignTables;
          state.form.kylinJoinInfos = v.kylinJoinInfos;
          state.form.kylinLimitInfos = v.kylinLimitInfos;
          state.kylinLimitInfos = [];
          state.kylinLimitInfos = v.kylinLimitInfos;
        }
      });
    }
  },
  [types.DELETE_USER_DEFINED_TERM](stateEslinitRule, deleteInfo) {
    // 删除用户自定义条件
    if (state.form.kylinLimitInfos.length) {
      state.form.kylinLimitInfos = state.form.kylinLimitInfos.filter(v =>
        !(v.tableCode === deleteInfo.tableCode
        && v.columnCode === deleteInfo.columnCode));
    }
  },
  [types.RESET_USER_DEFINED_TERM]() {
    // 重置当前用户自定义条件(针对用户当前手动删除操作)
    state.form.kylinLimitInfos = state.kylinLimitInfos;
  },
};

export default {
  state,
  // getters,
  actions,
  mutations,
};
