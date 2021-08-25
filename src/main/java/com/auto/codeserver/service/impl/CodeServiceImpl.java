package com.auto.codeserver.service.impl;

import com.auto.codeserver.mapper.CodeMapper;
import com.auto.codeserver.model.Code;
import com.auto.codeserver.service.CodeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
@Slf4j
public class CodeServiceImpl extends ServiceImpl<CodeMapper, Code>
        implements CodeService {

    @Autowired
    private CodeMapper codeMapper;

}
