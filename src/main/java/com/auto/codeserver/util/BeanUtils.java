package com.auto.codeserver.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BeanUtils
 * @Description bean工具类
 * @Author xudong.liao
 * @Date 2021/8/19 18:08
 * @Version 1.0
 **/

public class BeanUtils {

    public static <T, R> List<R> copyProperties(List<T> sources, Class<R> clazz)
            throws InstantiationException, IllegalAccessException {
        List<R> res = new ArrayList<>();
        for (Object source : sources
        ) {
            R obj = clazz.newInstance();
            org.springframework.beans.BeanUtils.copyProperties(source, obj);
            res.add(obj);
        }
        return res;
    }

}
