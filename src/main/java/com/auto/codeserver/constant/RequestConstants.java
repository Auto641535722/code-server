package com.auto.codeserver.constant;

/**
 * @Author shan.wang
 * @Description 接口请求的常量
 * @Date 15:46 2021/5/25
 * @Param
 * @return
 **/
public final class RequestConstants {

    private RequestConstants() {
    }

    public static final String SAMPLE_HEADER_KEY = "one-app-custom-header";

    public static final String RETURN_STATUS_SUCCESS = "SUCCEED";
    public static final String RETURN_STATUS_FAILED = "FAILED";

    /**
     * 公共参数
     */
    public static final String HEADER_DID = "Did";
    public static final String HEADER_AID = "aid";
    public static final String TENANT_ID = "tenantId ";
    public static final String URL_APP_KEY = "appkey";
    public static final String URL_SIGN = "sign";
    public static final String URL_SIGNT = "signt";
    public static final String URL_NONCE = "nonce";
    public static final String URL_VIN = "vin";

    /**
     * 字符常量
     */
    public static final String MEDDLE_LINE = "-";
    public static final String UNDER_LINE = "_";
    public static final String MERGE_SYMBOL = "&";
    public static final String QUESTION_MARK = "?";
    public static final String EQUAL_SIGN = "=";
    public static final String UTF_8 = "UTF-8";
    public static final String EMPTY_STRING = "";
    public static final String SPACE_STRING = " ";
    public static final String COMMA = ",";

}
