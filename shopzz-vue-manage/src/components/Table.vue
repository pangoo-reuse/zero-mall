<template>
  <el-card>
    <el-table
      :load="loading"
      :data="tableData"
      tooltip-effect="dark"
      style="width: 100%"
      @selection-change="handleSelectionChange"
  >
    <slot name='column'></slot>
  </el-table>
  <el-pagination
    background
    layout="prev, pager, next"
    :total="total"
    :page-size="size"
    :current-page="page"
    @current-change="changePage"
  />
  </el-card>
</template>

<script>
import { onMounted, reactive, toRefs, getCurrentInstance } from 'vue'
import axios from '@/utils/axios'
export default {
  name: 'Table',
  props: {
    action: String,
    id: String,
    canshu: {
      type: Object,
      default () {
        return {}
      }
    },
  },
  setup(props) {
    const app = getCurrentInstance()
    const state = reactive({
      loading: false,
      tableData: [], // 数据列表
      total: 0, // 总条数
      page: 1, // 当前页
      size: 10, // 分页大小
      multipleSelection: []
    })
    onMounted(() => {
      getList()
    })

    const getList = (query) => {
      state.loading = true
      var params = {
        page: state.page,
        size: state.size,
        keyId: props.id
      }


      console.log("参数：" + JSON.stringify(props.canshu));
      var finalParams = {...query, ...params, ...props.canshu}

      axios.post(props.action, finalParams).then(res => {
        state.tableData = res.data.records
        state.total = res.data.total
        state.page = res.data.current
        state.loading = false
        //app.ctx.goTop() // 回到顶部
      })
    }

    const handleSelectionChange = (val) => {
      state.multipleSelection = val
    }

    const changePage = (val) => {
      state.page = val
      getList()
    }

    return {
      ...toRefs(state),
      changePage,
      handleSelectionChange,
      getList
    }
  }
}
</script>