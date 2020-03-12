package com.test.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.*;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class PersonExportVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Excel(name = "name", orderNum = "0", width = 15)
    private String name;

    @Excel(name = "userName", orderNum = "1", width = 15)
    private String userName;

    @Excel(name = "phoneNumber", orderNum = "2", width = 15)
    private String phoneNumber;

}
