package com.auto.codeserver.service.impl;

import com.auto.codeserver.constant.CommonConst;
import com.auto.codeserver.mapper.CodeTypeMapper;
import com.auto.codeserver.model.CodeType;
import com.auto.codeserver.model.dto.CodeTypeDto;
import com.auto.codeserver.model.vo.Result;
import com.auto.codeserver.service.CodeTypeService;
import com.auto.codeserver.util.ResultUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.time.LocalDateTime;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
@Slf4j
public class CodeTypeServiceImpl extends ServiceImpl<CodeTypeMapper, CodeType> implements CodeTypeService {

    @Autowired
    private CodeTypeMapper codeTypeMapper;


    @Override
    public Result insertCodeType(CodeTypeDto codeTypeDto) {
        CodeType codeType = CodeType.builder()
                .updateTime(LocalDateTime.now())
                .createdTime(LocalDateTime.now()).build();
        BeanUtils.copyProperties(codeTypeDto, codeType);
        codeTypeMapper.insert(codeType);
        return ResultUtil.success();
    }

    public Result insertCodeTypes(List<CodeTypeDto> codeTypeDtos) {
        try {
            List<CodeType> codeTypeList = com.auto.codeserver.util.BeanUtils.copyProperties(codeTypeDtos, CodeType.class);
            codeTypeList.forEach(item -> item.setCreatedTime(LocalDateTime.now()).setUpdateTime(LocalDateTime.now()));
            saveBatch(codeTypeList);
        } catch (InstantiationException e) {
            log.error("复制对象失败", e);
        } catch (IllegalAccessException e) {
            log.error("复制对象失败", e);
        }
        return ResultUtil.success();
    }


    @Override
    public Result delCodeType(String id) {
        codeTypeMapper.deleteById(id);
        return ResultUtil.success();
    }

    @Override
    public Result updateCodeType(CodeTypeDto codeTypeDto) {
        return null;
    }

    @Override
    public Result getCodeType(Integer pageNo, Integer pageSize) {
        QueryWrapper<CodeType> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(CodeType::getValid, CommonConst.CONST_S)
                .orderByDesc(CodeType::getUpdateTime);
        IPage<CodeType> page = new Page<>(pageNo, pageSize);
        page = codeTypeMapper.selectPage(page, queryWrapper);
        return ResultUtil.success(page.getRecords());
    }

}
