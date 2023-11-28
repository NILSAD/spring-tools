package cn.nilsad.common.util.result;

/**
 * 除OK为成功响应外，其他类型都表示为错误状态
 * 错误码定义规则为5位数字
 * 前两位表示业务场景，后三位表示为错误码
 * 例：10000，10表示通用，000表示未知错误
 */
public enum ResultCode {
    OK(0,"操作成功"),
    UNKNOWN(10000, "未知错误"),
    VALIDATION(10001, "校验异常"),
    PARAM(10003, "参数异常"),
    KEY_NONENTITY(10004, "该APP-Key不存在"),

    GPT(11000, "GPT未知错误"),
    ;

    /**自定义状态码**/
    private final int code;
    /**自定义描述**/
    private final String message;

    ResultCode(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
