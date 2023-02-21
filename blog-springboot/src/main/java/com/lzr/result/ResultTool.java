package com.lzr.result;

/**
 * @Author lzr
 * @Date 2023/2/21 10:00
 * @Description: 统一返回工具类
 */
public class ResultTool {
    public static JsonResult success() {
        return new JsonResult(true);
    }

    public static <T> JsonResult<T> success(T data) {
        return new JsonResult(true, data);
    }

    public static JsonResult error() {
        return new JsonResult(false);
    }

    public static JsonResult error(ResultCode resultEnum) {
        return new JsonResult(false, resultEnum);
    }
}
