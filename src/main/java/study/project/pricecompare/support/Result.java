package study.project.pricecompare.support;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.Serializable;

@Data
public class Result<E> implements Serializable {

    private static final long serialVersionUID = -1L;

    /* 正常状态, 请求被正确处理,并且获得预期的结果. */
    public static final int OK = 0;

    /* 参数不符合要求 */
    public static final int PARAM_ILLEGAL = 1;

    /* 业务错误 */
    public static final int BUSINESS_ERROR = 2;

    /* 系统内部错误 */
    public static final int SYSTEM_ERROR = 3;

    public static final String SUCCESS_STRING = "SUCCESS";

    private int code = OK;

    // 数据, 具体接口, 具体约定
    private E data;

    // 错误信息
    private String errorMsg;

    public Result() {
    }

    public Result(E data) {
        this.data = (E) data;
    }

    public static <T> Result<T> buildSuccess(T data) {
        Result<T> model = new Result<T>();
        model.setData(data);
        return model;
    }

    public static Result<String> buildSuccess() {
        return buildSuccess(SUCCESS_STRING);
    }

    @SuppressWarnings("rawtypes")
	public static Result buildFail(int code, String errorMsg) {
        Result model = new Result();
        model.setCode(code);
        model.setErrorMsg(errorMsg);
        return model;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
