package com.auto.codeserver.model.dto;

import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @ClassName CodeTypeDto
 * @Description codetype的dto
 * @Author xudong.liao
 * @Date 2021/8/19 17:05
 * @Version 1.0
 **/
@Builder
@Data
@Accessors(chain = true)
public class CodeTypeDto {

    /**
     * id
     */
    @NotNull
    private String id;

    /**
     * 名称
     */
    @NotNull
    private String name;

    /**
     * 是否有效
     */
    @NotNull
    private Integer valid;
}
