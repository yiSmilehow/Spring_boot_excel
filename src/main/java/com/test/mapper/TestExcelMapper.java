package com.test.mapper;

import com.test.pojo.PersonExportVo;

import java.util.List;

public interface TestExcelMapper {


    /**
     * 导出excel
     *
     * @return
     */
    List<PersonExportVo> exportVo();

}
