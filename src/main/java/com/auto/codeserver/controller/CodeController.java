package com.auto.codeserver.controller;

import com.auto.codeserver.model.dto.CodeTypeDto;
import com.auto.codeserver.model.vo.Result;
import com.auto.codeserver.service.CodeTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CodeController
 * @Description 代码服务controlller
 * @Author xudong.liao
 * @Date 2021/8/19 15:43
 * @Version 1.0
 **/
@RestController
@Api(value = "代码服务")
@RequestMapping(value = "codeType")
public class CodeController {

    @Autowired
    private CodeTypeService codeTypeService;

    /**
     * 增加代码类型
     * @Author xudong.liao
     * @Description insertCodeType
     * @Date 2021/8/19 17:12
     * @Param [codeTypeDto]
     * @return com.auto.codeserver.model.vo.Result
     */
    @ApiOperation(value = "增加代码类型")
    @PostMapping
    public Result insertCodeType(@RequestBody @Validated CodeTypeDto codeTypeDto) {
        return codeTypeService.insertCodeType(codeTypeDto);
    }


    /**
     * 获取所有有效的代码类型
     * @Author xudong.liao
     * @Description getCodeType
     * @Date 2021/8/19 17:12
     * @Param [pageNo, pageSize]
     * @return com.auto.codeserver.model.vo.Result
     */
    @ApiOperation(value = "获取所有有效的代码类型", notes = "分页")
    @GetMapping
    public Result getCodeType(@RequestParam(value = "pageNo", required = true) @Min(value = 1) Integer pageNo,
            @RequestParam(value = "pageSize", required = true) @Min(value = 10) @Max(value = 50) Integer pageSize) {
        return codeTypeService.getCodeType(pageNo, pageSize);
    }

    /**
     * 删除代码类型
     * @Author xudong.liao
     * @Description delCodeType
     * @Date 2021/8/19 17:28
     * @Param [id]
     * @return com.auto.codeserver.model.vo.Result
     */
    @ApiOperation(value = "删除代码类型")
    @DeleteMapping
    public Result delCodeType(@RequestParam(value = "id") String id) {
        return codeTypeService.delCodeType(id);
    }

    /**
     * 修改代码类型
     * @Author xudong.liao
     * @Description insertCodeType
     * @Date 2021/8/19 17:12
     * @Param [codeTypeDto]
     * @return com.auto.codeserver.model.vo.Result
     */
    @ApiOperation(value = "修改代码类型")
    @PutMapping
    public Result updateCodeType(@RequestBody @Validated CodeTypeDto codeTypeDto) {
        return codeTypeService.updateCodeType(codeTypeDto);
    }

}
