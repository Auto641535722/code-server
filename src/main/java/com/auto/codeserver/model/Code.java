package com.auto.codeserver.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 *
 * @TableName t_code
 */
@TableName(value ="t_code")
@Data
@Builder()
@Accessors(chain = true)
public class Code implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private String id;

    /**
     *
     */
    private Integer sort;

    /**
     *
     */
    private Integer valid;

    /**
     *
     */
    private String codeType;

    /**
     *
     */
    private String name;

    private String value;

    /**
     *
     */
    private LocalDateTime createdTime;

    /**
     *
     */
    private LocalDateTime updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}
