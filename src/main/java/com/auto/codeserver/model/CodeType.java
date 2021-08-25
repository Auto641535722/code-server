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
 * @TableName t_code_type
 */
@TableName(value ="code_server_dev.t_code_type")
@Data
@Builder
@Accessors(chain = true)
public class CodeType implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private String id;

    private String code;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private Integer valid;

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
