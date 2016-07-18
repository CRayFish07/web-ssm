package main.java.com.vstaryw.web.util;

/**
 * @author yuw
 * @time 2016/7/18 10:15
 */
public class ResultInfo<T> {
    private String errorCode;
    private String errorMsg;
    private T data = null;
    public ResultInfo() {

    }

    public ResultInfo(String errorCode,String errorMsg){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    public ResultInfo(String errorCode,String errorMsg,T object){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data =object;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
