package com.javaclimb.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.javaclimb.drug.common.DateUtil;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 供应商
 */
@Data
@TableName(value = "supplier")
public class Supplier implements Serializable {
    /*主键*/
    @TableField(value = "id")
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /*供应商名称*/
    private String name;

    /*供应商描述*/
    private String content;

    /*创建时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    /*生产时间转换成年月日*/
    public String getcreatetimeStr(){
        return DateUtil.dateConvert(createtime);
    }
}
