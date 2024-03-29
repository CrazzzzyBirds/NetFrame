package com.heima.netframe.net.exception;

/**
 * 正常网络连接，结果异常
 */
public class ResultException extends RuntimeException {
    private  int code;
    private String message;

    public ResultException(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
