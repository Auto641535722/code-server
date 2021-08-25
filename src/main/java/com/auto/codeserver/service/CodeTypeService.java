package com.auto.codeserver.service;


import com.auto.codeserver.model.dto.CodeTypeDto;
import com.auto.codeserver.model.vo.Result;

/**
*
*/
public interface CodeTypeService  {

    Result getCodeType(Integer pageNo, Integer pageSize);

    Result insertCodeType(CodeTypeDto codeTypeDto);

    Result delCodeType(String id);

    Result updateCodeType(CodeTypeDto codeTypeDto);
}
