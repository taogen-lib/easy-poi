package com.taogen.easypoi.commons.vo;

import com.taogen.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * @author Taogen
 */
@Data
public class User {
    @Excel(name = "ID")
    private Long id;
    @Excel(name = "姓名")
    private String userName;
    @Excel(name = "年龄")
    private Integer age;
}
