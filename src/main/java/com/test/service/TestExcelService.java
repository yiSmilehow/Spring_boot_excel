package com.test.service;

import com.test.pojo.PersonExportVo;

import java.util.List;

public interface TestExcelService {

    /**
     * 导出excel
     *
     * @return
     */
    List<PersonExportVo> excelVo();

}
