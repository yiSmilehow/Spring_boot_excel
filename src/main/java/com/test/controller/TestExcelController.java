package com.test.controller;

import com.test.pojo.PersonExportVo;
import com.test.service.TestExcelService;
import com.test.util.ExcelUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
public class TestExcelController {

    @Resource
    private TestExcelService testExcelService;

    /**
     * 导出excel表
     *
     * @param response
     * @return
     */
    @RequestMapping(value = "/excelVo", method = RequestMethod.GET)
    public String excelVo(HttpServletResponse response) {
        List<PersonExportVo> personExportVoList = testExcelService.excelVo();
        try {
            ExcelUtils.exportExcel(personExportVoList, "员工信息表", "员工信息", PersonExportVo.class, "员工信息", response);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    /**
     * 导入
     *
     * @param file
     * @return
     */
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public List<PersonExportVo> importExcel(@RequestParam("file") MultipartFile file) {
        List<PersonExportVo> personExportVoList = null;
        try {
            personExportVoList = ExcelUtils.importExcel(file, PersonExportVo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personExportVoList;
    }

}
