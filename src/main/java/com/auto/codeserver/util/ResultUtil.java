package com.auto.codeserver.util;
import com.auto.codeserver.constant.RequestConstants;
import com.auto.codeserver.model.vo.Result;

import java.util.UUID;


/**
 * @Author shan.wang
 * @Description Result返回结果工具类
 * @Date 14:11 2021/5/26
 * @Param
 * @return
 **/
public final class ResultUtil {

    private ResultUtil() {
    }

    public static <T> Result<T> success() {
        return Result.<T>builder()
                .returnStatus(RequestConstants.RETURN_STATUS_SUCCESS)
                .serverTime(createServerTime())
                .requestId(createRequestId())
                .build();
    }

    public static <T> Result<T> success(T data) {
        return Result.<T>builder()
                .returnStatus(RequestConstants.RETURN_STATUS_SUCCESS)
                .data(data)
                .serverTime(createServerTime())
                .requestId(createRequestId())
                .build();
    }

    /**
     * 构造带分页结果的Result对象
     *
     * @param data 数据对象
     * @param totalCount 总条数
     */
    public static <T> Result<T> success(T data, Integer totalCount, Integer pageNo,
            Integer pageSize) {

        return Result.<T>builder()
                .returnStatus(RequestConstants.RETURN_STATUS_SUCCESS)
                .data(data)
                .serverTime(createServerTime())
                .requestId(createRequestId())
                .totalCount(totalCount)
                .pageNo(pageNo)
                .pageSize(pageSize)
                .build();
    }

    public static <T> Result<T> fail(String errorCode, String errorMessage, Object extMessage) {
        return Result.<T>builder()
                .returnStatus(RequestConstants.RETURN_STATUS_FAILED)
                .errorCode(errorCode)
                .errorMessage(errorMessage)
                .serverTime(createServerTime())
                .requestId(createRequestId())
                .extMessage(extMessage)
                .build();
    }

    public static <T> Result<T> fail(String errorCode, String errorMessage) {
        return Result.<T>builder()
                .returnStatus(RequestConstants.RETURN_STATUS_FAILED)
                .errorCode(errorCode)
                .errorMessage(errorMessage)
                .serverTime(createServerTime())
                .requestId(createRequestId())
                .build();
    }


    private static String createServerTime() {
        return String.valueOf(System.currentTimeMillis());
    }

    private static String createRequestId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static boolean resultSuccess(Result result) {
        return RequestConstants.RETURN_STATUS_SUCCESS.equals(result.getReturnStatus());
    }

    public static boolean resultFailed(Result result) {
        return !resultSuccess(result);
    }
}

