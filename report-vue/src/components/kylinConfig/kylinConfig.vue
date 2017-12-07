<template>
  <el-container>
    <el-header>
      <div class="configHeader">
        <el-row>
          <el-col :span="24">
            <div class="operateButton">
              <el-button
                size="mini"
                type="success"
                @click="refreshOperate()"
                element-loading-text="拼命加载中"
                v-loading.fullscreen.lock="fullscreenLoading">刷新</el-button>
              <el-button
                size="mini"
                type="primary"
                element-loading-text="等待拉取待配置数据"
                @click="insertOperate()">新增</el-button>
            </div>
          </el-col>
        </el-row>
      </div>
    </el-header>
    <el-main>
      <div class="configMain">
        <el-table
          :data="configQueryInfo"
          v-loading.fullscreen.lock="fullscreenLoading"
          element-loading-text="拼命加载中"
          border
          style="width: 100%">
          <el-table-column
            align="center"
            prop="projectCode"
            label="项目代码">
          </el-table-column>
          <!-- <el-table-column
            align="center"
            prop="uuid"
            label="uuid">
          </el-table-column> -->
          <el-table-column
            align="center"
            prop="projectName"
            label="项目名称">
          </el-table-column>
          <el-table-column
            align="center"
            prop="modelCode"
            label="模块代码">
          </el-table-column>
          <el-table-column
            align="center"
            prop="modelName"
            label="模块名称">
          </el-table-column>
          <el-table-column
            align="center"
            prop="cubeCode"
            label="cube代码">
          </el-table-column>
          <el-table-column
            align="center"
            prop="cubeName"
            label="cube名称">
          </el-table-column>
          <el-table-column
            fixed="right"
            label="操作"
            align="center"
            width="140">
            <template scope="scope">
              <el-button @click="cubeShow(scope.row)" type="text" size="small">查看</el-button>
              <el-button @click="cubeEdit(scope.row)" type="text" size="small">编辑</el-button>
              <el-button @click="cubeDelete(scope.row)" type="text" size="small">删除</el-button>
            </template>
          </el-table-column>
        </el-table>
      </div>
      <el-dialog title="cube详细配置" :visible.sync="dialogFormVisible">
        <div class="configForm">
          <el-form :model="form" :rules="rules" ref="form">
            <div v-bind:style="{ display: formSelectCube }">
              <el-form-item label="cube" :label-width="formLabelWidth">
                <el-row>
                  <el-col :span="23" :offset="1">
                    <el-select v-model="selectPeddingCube" placeholder="请选择待配置cube">
                      <el-option
                        v-for="item in peddingConfigInfo"
                        :key="item.cubeCode"
                        :label="item.cubeCode"
                        :value="item.cubeCode">
                      </el-option>
                    </el-select>
                  </el-col>
              </el-row>
              </el-form-item>
            </div>
            <el-form-item label="项目信息" :label-width="formLabelWidth" prop="projectName">
              <el-row>
                <el-tooltip class="item" effect="light" content="项目代码" placement="right">
                  <el-col :span="11" :offset="1">
                    <el-input
                      :disabled="onlyRead"
                      v-model.trim="form.projectCode"
                      auto-complete="off"
                      placeholder="请输入项目代码"></el-input></el-col>
                </el-tooltip>
                <el-tooltip class="item" effect="light" content="项目中文名称" placement="right">
                  <el-col :span="11" :offset="1">
                    <el-input
                      :disabled="onlyRead"
                      v-model.trim="form.projectName"
                      auto-complete="off"
                      placeholder="请输入项目中文名称"></el-input></el-col>
                </el-tooltip>
              </el-row>
            </el-form-item>
            <el-form-item label="模块信息" :label-width="formLabelWidth" prop="modelName">
              <el-row>
                <el-tooltip class="item" effect="light" content="模块代码" placement="right">
                  <el-col :span="11" :offset="1">
                    <el-input
                      :disabled="true"
                      v-model.trim="form.modelCode"
                      auto-complete="off"
                      placeholder="请输入模块代码"></el-input></el-col>
                </el-tooltip>
                <el-tooltip class="item" effect="light" content="模块中文名称" placement="right">
                  <el-col :span="11" :offset="1">
                    <el-input
                      :disabled="onlyRead"
                      v-model.trim="form.modelName"
                      auto-complete="off"
                      placeholder="请输入模块中文名称"></el-input></el-col>
                </el-tooltip>
              </el-row>
            </el-form-item>
            <el-form-item label="cube信息" :label-width="formLabelWidth" prop="cubeName">
              <el-row>
                <el-tooltip class="item" effect="light" content="cube代码" placement="right">
                  <el-col :span="11" :offset="1">
                    <el-input
                      :disabled="true"
                      v-model.trim="form.cubeCode"
                      auto-complete="off"
                      placeholder="请输入cube代码"></el-input></el-col>
                </el-tooltip>
                <el-tooltip class="item" effect="light" content="cube中文名称" placement="right">
                  <el-col :span="11" :offset="1">
                    <el-input
                      :disabled="onlyRead"
                      v-model.trim="form.cubeName"
                      auto-complete="off"
                      placeholder="请输入cube中文名称"></el-input></el-col>
                </el-tooltip>
              </el-row>
            </el-form-item>
            <el-form-item label="主表信息" :label-width="formLabelWidth" prop="kylinPrimaryTable">
              <el-row>
                <el-tooltip class="item" effect="light" content="主表代码" placement="right">
                  <el-col :span="11" :offset="1">
                    <el-input
                      :disabled="true"
                      v-model.trim="form.kylinPrimaryTable.tableCode"
                      auto-complete="off"
                      placeholder="请输入主表代码"></el-input></el-col>
                </el-tooltip>
                <el-tooltip class="item" effect="light" content="主表中文名称" placement="right">
                  <el-col :span="11" :offset="1">
                    <el-input
                      :disabled="onlyRead"
                      v-model.trim="form.kylinPrimaryTable.tableName"
                      auto-complete="off"
                      placeholder="请输入主表中文名称"></el-input></el-col>
                </el-tooltip>
              </el-row>
              <el-collapse v-model="activeNames">
                <el-collapse-item title="维度信息" name="1">
                  <el-row v-for="dimension in form.kylinPrimaryTable.dimensionColumnInfos"  :key="dimension.code">
                    <el-tooltip class="item" effect="light" content="主表维度代码" placement="right">
                      <el-col :span="11" :offset="1"><el-input :disabled="true" v-model.trim="dimension.code" auto-complete="off"></el-input></el-col>
                    </el-tooltip>
                    <el-tooltip class="item" effect="light" content="主表维度中文名称" placement="right">
                      <el-col :span="11" :offset="1"><el-input :disabled="onlyRead" v-model.trim="dimension.name" auto-complete="off"></el-input></el-col>
                    </el-tooltip>
                  </el-row>
                </el-collapse-item>
                <el-collapse-item title="度量信息" name="2">
                  <el-row v-for="measure in form.kylinPrimaryTable.measureColumnInfos"  :key="measure.code">
                    <el-tooltip class="item" effect="light" content="主表度量列名代码" placement="right">
                      <el-col :span="11" :offset="1"><el-input :disabled="true" v-model.trim="measure.code" auto-complete="off"></el-input></el-col>
                    </el-tooltip>
                    <el-tooltip class="item" effect="light" content="主表度量列名中文名称" placement="right">
                      <el-col :span="11" :offset="1"><el-input :disabled="onlyRead" v-model.trim="measure.name" auto-complete="off"></el-input></el-col>
                    </el-tooltip>
                  </el-row>
                </el-collapse-item>
              </el-collapse>
            </el-form-item>
            <el-form-item label="度量信息" :label-width="formLabelWidth" prop="kylinLoadMeasures">
              <el-collapse>
                <el-collapse-item title="" name="3">
                  <template v-for="measure in form.kylinLoadMeasures">
                    <el-row>
                      <el-tooltip class="item" effect="light" content="度量代码" placement="right">
                        <el-col :span="11" :offset="1"><el-input :disabled="true" v-model.trim="measure.code" auto-complete="off"></el-input></el-col>
                      </el-tooltip>
                      <el-tooltip class="item" effect="light" content="度量中文名称" placement="right">
                        <el-col :span="11" :offset="1"><el-input :disabled="onlyRead" v-model.trim="measure.name" auto-complete="off"></el-input></el-col>
                      </el-tooltip>
                    </el-row>
                    <el-row>
                      <el-tooltip class="item" effect="light" content="度量列名代码" placement="right">
                        <el-col :span="11" :offset="1"><el-input :disabled="true" v-model.trim="measure.columnCode" auto-complete="off"></el-input></el-col>
                      </el-tooltip>
                      <el-tooltip class="item" effect="light" content="度量列名中文名称" placement="right">
                        <el-col :span="11" :offset="1"><el-input :disabled="onlyRead" v-model.trim="measure.columnName" auto-complete="off"></el-input></el-col>
                      </el-tooltip>
                    </el-row>
                  </template>
                </el-collapse-item>
              </el-collapse>
            </el-form-item>
            <el-form-item label="伪表信息" :label-width="formLabelWidth" prop="kylinForeignTables">
              <el-collapse>
                <el-collapse-item title="" name="4">
                  <template v-for="foreignTable in form.kylinForeignTables">
                    <el-row>
                      <el-tooltip class="item" effect="light" content="伪表表名代码" placement="right">
                        <el-col :span="11" :offset="1"><el-input :disabled="true" v-model.trim="foreignTable.tableCode" auto-complete="off"></el-input></el-col>
                      </el-tooltip>
                      <el-tooltip class="item" effect="light" content="伪表表名中文名称" placement="right">
                        <el-col :span="11" :offset="1"><el-input :disabled="onlyRead" v-model.trim="foreignTable.tableName" auto-complete="off"></el-input></el-col>
                      </el-tooltip>
                    </el-row>
                    <el-row>
                      <el-row v-for="columnInfo in foreignTable.kylinColumnInfos" :key="columnInfo.code">
                        <el-tooltip class="item" effect="light" content="伪表列名代码" placement="right">
                          <el-col :span="11" :offset="1"><el-input :disabled="true" v-model.trim="columnInfo.code" auto-complete="off"></el-input></el-col>
                        </el-tooltip>
                        <el-tooltip class="item" effect="light" content="伪表列名中文名称" placement="right">
                          <el-col :span="11" :offset="1"><el-input :disabled="onlyRead" v-model.trim="columnInfo.name" auto-complete="off"></el-input></el-col>
                        </el-tooltip>
                      </el-row>
                    </el-row>
                  </template>
                </el-collapse-item>
              </el-collapse>
            </el-form-item>
            <el-form-item label="关联信息" :label-width="formLabelWidth" prop="kylinJoinInfos">
              <el-collapse>
                <el-collapse-item title="" name="5">
                  <template v-for="joinInfo in form.kylinJoinInfos">
                    <el-row>
                      <el-tooltip class="item" effect="light" content="关联表名代码" placement="right">
                        <el-col :span="11" :offset="1"><el-input :disabled="true" v-model.trim="joinInfo.tableCode" auto-complete="off"></el-input></el-col>
                      </el-tooltip>
                      <el-tooltip class="item" effect="light" content="关联表名中文名称" placement="right">
                        <el-col :span="11" :offset="1"><el-input :disabled="onlyRead" v-model.trim="joinInfo.tableName" auto-complete="off"></el-input></el-col>
                      </el-tooltip>
                    </el-row>
                    <el-row>
                      <el-tooltip class="item" effect="light" content="关联表展示列名代码" placement="right">
                        <el-col :span="11" :offset="1"><el-input :disabled="true" v-model.trim="joinInfo.showColumn" auto-complete="off"></el-input></el-col>
                      </el-tooltip>
                      <el-tooltip class="item" effect="light" content="关联表关联列名代码" placement="right">
                        <el-col :span="11" :offset="1"><el-input :disabled="onlyRead" v-model.trim="joinInfo.associationColumn" auto-complete="off"></el-input></el-col>
                      </el-tooltip>
                    </el-row>
                    <el-row>
                      <el-tooltip class="item" effect="light" content="关联表关联条件 => 主表.字段=关联表.关联字段" placement="right">
                        <el-col :span="23" :offset="1"><el-input :disabled="onlyRead" v-model.trim="joinInfo.associationSqlInfo" auto-complete="off"></el-input></el-col>
                      </el-tooltip>
                    </el-row>
                  </template>
                </el-collapse-item>
              </el-collapse>
            </el-form-item>
            <el-form-item label="限制条件" :label-width="formLabelWidth" prop="kylinLimitInfos">
              <el-collapse>
                <el-collapse-item title="" name="6">
                  <div v-bind:style="{ display: formSelectCube }">
                    <el-row>
                      <el-col :span="23" :offset="1">
                        <div class="resetOperate" @click="resetUserDefinedTerm()">
                          <span>重置</span>
                        </div>
                      </el-col>
                    </el-row>
                  </div>
                  <el-row v-for="limitInfo in form.kylinLimitInfos" :key="limitInfo.tableCode">
                    <el-tooltip class="item" effect="light" content="用户自定义条件表名代码" placement="right">
                      <el-col :span="10" :offset="1"><el-input :disabled="true" v-model.trim="limitInfo.tableCode" auto-complete="off"></el-input></el-col>
                    </el-tooltip>
                    <el-tooltip class="item" effect="light" content="用户自定义条件表名中文名称" placement="right">
                      <el-col :span="10" :offset="2"><el-input :disabled="onlyRead" v-model.trim="limitInfo.tableName" auto-complete="off"></el-input></el-col>
                    </el-tooltip>
                    <el-col :span="1">
                      <div class="deleteIcon">
                        <!-- <i class="el-icon-delete"></i> -->
                      </div>
                    </el-col>
                    <el-tooltip class="item" effect="light" content="用户自定义条件表列名代码" placement="right">
                      <el-col :span="10" :offset="1"><el-input :disabled="true" v-model.trim="limitInfo.columnCode" auto-complete="off"></el-input></el-col>
                    </el-tooltip>
                    <el-tooltip class="item" effect="light" content="用户自定义条件表列名中文名称" placement="right">
                      <el-col :span="10" :offset="2"><el-input :disabled="onlyRead" v-model.trim="limitInfo.columnName" auto-complete="off"></el-input></el-col>
                    </el-tooltip>
                    <div v-bind:style="{ display: formSelectCube }">
                      <el-col :span="1">
                        <div class="deleteIcon">
                          <i class="el-icon-delete" @click="deleteUserDefinedTerm(limitInfo)"></i>
                        </div>
                      </el-col>
                    </div>
                  </el-row>
                </el-collapse-item>
              </el-collapse>
            </el-form-item>
          </el-form>
          <div slot="footer" class="dialog-footer" v-bind:style="{ display: onlyReadHide }">
            <el-button @click="dialogFormVisible = false">取 消</el-button>
            <el-button type="primary" @click="submitOrEdit('form')">确 定</el-button>
          </div>
        </div>
      </el-dialog>
    </el-main>
  </el-container>
</template>

<script>
import utils from '@/utils';

// 逐项校验表单
const validateKylinLoadMeasures = (rule, value, callback) => {
  if (value && value.length) {
    value.forEach(v => {
      if (!v.columnName || !v.name) {
        callback(new Error('请输入度量相关信息对应中文名称!'));
      }
    });
  }
  callback();
};
const validateKylinForeignTables = (rule, value, callback) => {
  if (value && value.length) {
    value.forEach(v => {
      if (!v.tableName) {
        callback(new Error('请输入对应伪表的中文名称!'));
      }
      v.kylinColumnInfos.forEach(item => {
        if (!item.name) {
          callback(new Error('请输入伪表对应列名中文名称!'));
        }
      });
    });
  }
  callback();
};
const validateKylinJoinInfos = (rule, value, callback) => {
  if (value && value.length) {
    value.forEach(v => {
      if (!v.showColumn) {
        callback(new Error('请输入关联表关联列名对应代码!'));
      }
      if (!v.tableName) {
        callback(new Error('请输入关联表名中文名称!'));
      }
    });
  }
  callback();
};
const validateKylinPrimaryTable = (rule, value, callback) => {
  if (value) {
    if (!value.tableName) {
      callback(new Error('请输入主表中文名称!'));
    }
    if (value.dimensionColumnInfos && value.dimensionColumnInfos.length) {
      value.dimensionColumnInfos.forEach(v => {
        if (!v.name) {
          callback(new Error('请输入主表对应维度中文名称!'));
        }
      });
    }
    if (value.measureColumnInfos && value.measureColumnInfos.length) {
      value.measureColumnInfos.forEach(v => {
        if (!v.name) {
          callback(new Error('请输入主表对应度量中文名称!'));
        }
      });
    }
  }
  callback();
};
const validateKylinLimitInfos = (rule, value, callback) => {
  if (value && value.length) {
    value.forEach(v => {
      if (!v.columnName) {
        callback(new Error('请输入用户自定义表对应列名中文名称!'));
      }
      if (!v.tableName) {
        callback(new Error('请输入用户自定义表对应中文名称!'));
      }
    });
  }
  callback();
};
export default {
  name: 'kylinConfig',
  data() {
    return {
      // 折叠面板激活状态
      activeNames: [],
      // 新增提交(submit) || 编辑操作(edit)
      submitOrEditFlag: 'edit',
      // form中input只读标识
      onlyRead: false,
      // form中提交按钮显示标识
      onlyReadHide: 'block',
      // 新增显示选择cube
      formSelectCube: 'block',
      // form dialog是否显示
      dialogFormVisible: false,
      // form label宽度
      formLabelWidth: '90px',
      // 新增选择cube
      selectPeddingCube: '',
      // 规则校验
      rules: {
        projectName: [
          { required: true, message: '请输入项目中文名称', trigger: 'blur' },
        ],
        modelName: [
          { required: true, message: '请输入模块中文名称', trigger: 'blur' },
        ],
        cubeName: [
          { required: true, message: '请输入cube中文名称', trigger: 'blur' },
        ],
        kylinPrimaryTable: [
          { validator: validateKylinPrimaryTable, required: true, trigger: 'blur' },
        ],
        kylinLoadMeasures: [
          { validator: validateKylinLoadMeasures, required: true, type: 'array', trigger: 'blur' },
        ],
        kylinForeignTables: [
          { validator: validateKylinForeignTables, required: true, type: 'array', trigger: 'blur' },
        ],
        kylinJoinInfos: [
          { validator: validateKylinJoinInfos, required: true, type: 'array', trigger: 'blur' },
        ],
        kylinLimitInfos: [
          { validator: validateKylinLimitInfos, required: true, type: 'array', trigger: 'blur' },
        ],
      },
    };
  },
  methods: {
    // cube查看操作
    cubeShow(row) {
      this.activeNames = [];
      this.onlyRead = true;
      this.onlyReadHide = 'none';
      this.formSelectCube = 'none';
      this.dialogFormVisible = true;
      this.$store.dispatch('kylinConfig_setFormInfo', row);
    },
    // cube编辑操作
    cubeEdit(row) {
      this.activeNames = [];
      this.submitOrEditFlag = 'edit';
      this.onlyRead = false;
      this.onlyReadHide = 'block';
      this.formSelectCube = 'block';
      this.dialogFormVisible = true;
      this.$store.dispatch('kylinConfig_setFormInfo', row);
    },
    // cube 删除操作
    cubeDelete(row) {
      this.$nextTick(() => this.$store.dispatch('common_showLoading', true));
      this.$store.dispatch('kylinConfig_deleteConfigInfo', row);
      // 存储至后端数据库,并刷新前端界面
      this.operateConfigInfo();
    },
    // 新增或者更新操作
    submitOrEdit(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          this.dialogFormVisible = false;
          this.$nextTick(() => this.$store.dispatch('common_showLoading', true));
          if (this.submitOrEditFlag === 'edit') {
            this.$store.dispatch('kylinConfig_editConfigInfo', this.form);
          } else if (this.submitOrEditFlag === 'submit') {
            this.$store.dispatch('kylinConfig_newConfigInfo', this.form);
          }
          // 存储至后端数据库,并刷新前端界面
          this.operateConfigInfo();
          return true;
        }
        return false;
      });
    },
    operateConfigInfo() {
      utils.ajax('POST')('/kylin/updateConfigInfo', { configInfo: this.configQueryInfo }).then(
        json => {
          // window.localStorage.setItem('bbbb', JSON.stringify(json));
          this.$store.dispatch('kylinConfig_showConfigInfo', json);
          this.$nextTick(() => this.$store.dispatch('common_showLoading', false));
          this.$message({
            message: '操作成功!',
            type: 'success',
          });
        });
    },
    // 刷新操作
    refreshOperate() {
      this.$store.dispatch('common_showLoading', true);
      utils.ajax('GET')('/kylin/getKylinConfigData').then(
        json => {
          this.$store.dispatch('kylinConfig_showConfigInfo', json);
          this.$nextTick(() => {
            this.$store.dispatch('common_showLoading', false);
          });
        });
    },
    // 插入操作
    insertOperate() {
      this.selectPeddingCube = '';
      this.activeNames = [];
      this.submitOrEditFlag = 'submit';
      this.onlyRead = false;
      this.onlyReadHide = 'none';
      this.formSelectCube = 'block';
      this.dialogFormVisible = true;
      // 获取待处理配置信息
      this.$store.dispatch('common_showLoading', true);
      utils.ajax('GET')('/kylin/getKylinPendingConfigData').then(
        json => {
          this.$store.dispatch('kylinConfig_clearForm', json);
          // if (json.kylinPendingDataFlag === false) {
          //   this.onlyReadHide = 'none';
          // } else {
          //   this.onlyReadHide = 'block';
          // }
          this.$nextTick(() => {
            this.$store.dispatch('common_showLoading', false);
          });
        });
    },
    // 删除用户自定义条件
    deleteUserDefinedTerm(deleteInfo) {
      this.$store.dispatch('kylinConfig_deleteUserDefinedTerm', deleteInfo);
      // 存储至后端数据库,并刷新前端界面
      this.operateConfigInfo();
    },
    // 重置当前用户自定义条件(针对用户当前手动删除操作)
    resetUserDefinedTerm() {
      this.$store.dispatch('kylinConfig_resetUserDefinedTerm');
    },
  },
  watch: {
    // 添加用户自定义查询条件
    selectPeddingCube: {
      handler(curVal) {
        if (curVal === '') {
          this.onlyReadHide = 'none';
        } else {
          this.onlyReadHide = 'block';
        }
        this.$store.dispatch('kylinConfig_selectPeddingCube', curVal);
      },
      deep: true,
    },
  },
  computed: {
    // 初始配置信息
    configQueryInfo() {
      return this.$store.state.kylinConfig.configQueryInfo;
    },
    // form中展示内容
    form() {
      return this.$store.state.kylinConfig.form;
    },
    // 全屏加载
    fullscreenLoading() {
      return this.$store.state.common.fullscreenLoading;
    },
    // 待处理配置信息
    peddingConfigInfo() {
      return this.$store.state.kylinConfig.peddingConfigInfo;
    },
  },
  mounted() {
    // 页面初始化时加载页面查询展示信息
    this.$store.dispatch('common_showLoading', true);
    utils.ajax('GET')('/kylin/getKylinConfigData').then(
      json => {
        // window.localStorage.setItem('aaaaa', JSON.stringify(json));
        this.$store.dispatch('kylinConfig_showConfigInfo', json);
        this.$nextTick(() => {
          this.$store.dispatch('common_showLoading', false);
        });
      });
    // const json = JSON.parse(window.localStorage.getItem('aaaaa'));
    // // console.log(utils.serialize(json));
    // this.$store.dispatch('kylinConfig_showConfigInfo', json);
    // this.$nextTick(() => {
    //   this.$store.dispatch('common_showLoading', false);
    // });
  },
};
</script>

<style scoped>
.configMain {
  margin: 0 auto;
  background: #fff;
  border: 1px solid #ebebeb;
  border-radius: 3px;
  margin-bottom: 10px;
  padding: 20px 20px 0;
  position: relative;
  height: 800px;
}
.configHeader {
  padding: 10px;
  background: #fff;
  border-color: #e5e6e9 #dfe0e4 #d0d1d5;
  border: 1px solid #ebebeb;
}
.el-header {
  box-sizing: border-box;
}
.el-main {
  padding-top: 0px;
}
.el-row {
    margin-bottom: 20px;
    &:last-child {
      margin-bottom: 0;
    }
}
.el-col {
  border-radius: 4px;
}
.bg-purple-dark {
  background: #99a9bf;
}
.bg-purple {
  background: #d3dce6;
}
.bg-purple-light {
  background: #e5e9f2;
}
.grid-content {
  border-radius: 4px;
  min-height: 36px;
}
.row-bg {
  padding: 10px 0;
  background-color: #f9fafc;
}
.configForm {
  height: 500px;
  overflow-y: scroll;
}
.dialog-footer {
  text-align: center;
}
.el-form-item {
  border-bottom: 1px solid #ebebeb;
}

.el-collapse-item:last-child {
    margin-bottom: 0px;
}
.onlyReadHide {
  display: none;
}
.nolyReadShow {
  display: block;
}
.operateButton {
  padding: 8px;
}
.deleteIcon {
  padding: 8px;
}
.deleteIcon :hover{
  color: gray;
  cursor: pointer;
}
.resetOperate {
  float: right;
  height: 50px;
  width: 50px;
}
.resetOperate :hover{
  color: #409EFF;
  cursor: pointer;
}
</style>
<style>
.el-table th {
    text-align: center;
}
.el-collapse, .el-collapse-item__header, .el-collapse-item__wrap {
    border-bottom: 1px solid rgba(255,255,255,.5);
    border-top: 1px solid rgba(255,255,255,.5);
}
</style>
