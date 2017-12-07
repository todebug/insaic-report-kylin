<template>
  <div class="queryBarMain">
  	<div class="reprotTitle">
  		<span>报表查询</span>
  	</div>
    <query-form></query-form>
  </div>
</template>

<script>
import utils from '@/utils';
import queryForm from './queryForm';

export default {
  name: 'queryBarMain',
  // data() {
  //   return {
  //   };
  // },
  watch: {
  },
  filters: {
    date: (timestamp) => utils.data(timestamp),
  },
  computed: {
  },
  methods: {
  },
  beforeMount() {
  },
  components: {
    'query-form': queryForm,
  },
};
</script>

<style scoped>
.reprotTitle {
  text-align: left;
  font-size: 15px;
  color: #596771;
  border-bottom: 1px solid #eaeaed;
  font-weight: 700;
  margin: -20px -20px 0;
  padding: 10px 0 10px 20px;
  background: #f6f7f9;
  border-radius: 2px 2px 0 0;
  height: 3pc;
  line-height: 18px;
}
.queryBarMain {
  margin: 0 auto;
  background: #fff;
  border: 1px solid #ebebeb;
  border-radius: 3px;
  margin-bottom: 10px;
  padding: 20px 20px 0;
  position: relative;
  border-color: #e5e6e9 #dfe0e4 #d0d1d5;
}
</style>
