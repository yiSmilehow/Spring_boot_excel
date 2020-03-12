package com.test.service.impl;

import com.test.mapper.TestExcelMapper;
import com.test.pojo.PersonExportVo;
import com.test.service.TestExcelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestExcelServiceImpl implements TestExcelService {

    @Resource
    private TestExcelMapper testExcelMapper;

    public List<PersonExportVo> excelVo() {
        return testExcelMapper.exportVo();
    }
}
