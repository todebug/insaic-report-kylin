package com.insaic.kylin.controller;

import com.insaic.base.exception.ExceptionUtil;
import com.insaic.base.utils.DateStyle;
import com.insaic.base.utils.DateUtil;
import com.insaic.kylin.handler.KylinHandler;
import com.insaic.kylin.model.kylin.config.KylinConfigInfo;
import com.insaic.kylin.model.kylin.query.KylinQueryData;
import com.insaic.kylin.service.KylinBaseService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

 /**
 * Created by dongyang on 2017/9/12.
 */
@Controller
@RequestMapping("/kylin")
public class KylinController extends BaseController{

    @Autowired
    private KylinHandler kylinHandler;
    @Autowired
    private KylinBaseService kylinBaseService;

    /**
     * @Author dongyang
     * @Describe loadSelectInfo
     * @Date 2017/9/13 上午11:12
     */
    @RequestMapping(value = "/loadInitInfo/{cleanCache}/{userCode}", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> loadSelectInfo(@PathVariable("cleanCache") Boolean cleanCache,
                                                            @PathVariable("userCode") String userCode) {
        Map<String, Object> modelMap = kylinHandler.loadSelectInfo(cleanCache, userCode);

        return modelMap;
    }

    /**
     * @Author dongyang
     * @Describe kylin/api/query
     * @Date 2017/9/12 下午1:46
     */
    @RequestMapping(value = "/querySql", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> getKylinSql(@RequestBody KylinQueryData queryData) {
        Map<String, Object> modelMap = kylinHandler.getKylinSql(queryData);

        return modelMap;
    }

    /**
     * @Author dongyang
     * @Describe 向缓存中添加待下载文件
     * @Date 2017/9/18 下午2:15
     */
    @RequestMapping(value = "/addDownloadFile", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> addDownloadFile(@RequestBody KylinQueryData queryData) {
        Map<String, Object> modelMap = kylinHandler.addDownloadFile(queryData);

        return modelMap;
    }

    /**
     * @Author dongyang
     * @Describe 获取刷新待下载文件生成状态
     * @Date 2017/9/18 下午4:57
     */
    @RequestMapping(value = "/refreshDownloadFileStatus", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> refreshDownloadFileStatus() {
        Map<String, Object> modelMap = kylinHandler.refreshDownloadFileStatus();

        return modelMap;
    }

    /**
     * @Author dongyang
     * @Describe 下载文件
     * @Date 2017/9/18 下午8:19
     */
    @RequestMapping(value = "/downloadExcelFile/{fileCode}", method = RequestMethod.GET)
    public ResponseEntity<byte[]> downloadExcelFile(@PathVariable("fileCode") String fileCode) {
        String path = this.getClass().getResource("/").getPath()
                + "download/" + DateUtil.dateToString(new Date(), DateStyle.YYYYMMDD)
                + "/" + fileCode + ".xlsx";
        File file = new File(path);
        HttpHeaders headers = new HttpHeaders();
        // fileName = new String((fileName + ".xlsx").getBytes("UTF-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment", fileCode + ".xlsx");
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        if (file.exists()) {
            kylinHandler.setDownloadFileStatus(fileCode);
        } else {
            return new ResponseEntity<byte[]>(null, headers, HttpStatus.ACCEPTED);
        }
        try {
            return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
        } catch (Exception e) {
            ExceptionUtil.handleException(e);
        }

        return null;
    }

     /**
      * @Author dongyang
      * @Describe 获取麒麟配置信息
      * @Date 2017/10/12 下午2:23
      */
     @RequestMapping(value = "/getKylinConfigData", method = RequestMethod.GET)
     public @ResponseBody Map<String, Object> getKylinConfigData() {
         Map<String, Object> modelMap = kylinHandler.getKylinConfigData();

         return modelMap;
     }

     /**
      * @Author dongyang
      * @Describe 获取待手动配置信息
      * @Date 2017/10/17 上午11:41
      */
     @RequestMapping(value = "/getKylinPendingConfigData", method = RequestMethod.GET)
     public @ResponseBody Map<String, Object> getKylinPendingConfigData() {
         Map<String, Object> modelMap = kylinHandler.getKylinPendingConfigData();

         return modelMap;
     }

     /**
      * @Author dongyang
      * @Describe 更新配置信息
      * @Date 2017/10/18 上午11:23
      */
     @RequestMapping(value = "/updateConfigInfo", method = RequestMethod.POST)
     public @ResponseBody Map<String, Object> updateConfigInfo(@RequestBody Map<String, List<KylinConfigInfo>> map) {
         List<KylinConfigInfo> kylinConfigInfos = map.get("configInfo");
         Map<String, Object> modelMap = kylinHandler.updateConfigInfo(kylinConfigInfos);

         return modelMap;
     }

}
