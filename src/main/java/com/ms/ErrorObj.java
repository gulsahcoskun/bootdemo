package com.ms;

/**
 * Created by GulsahCoskun on 28.05.2018.
 */
public class ErrorObj {

    private String message;
    private int cause;

    public String getMessage() {
        return message;
    }

    public ErrorObj setMessage(String message) {
        this.message = message;
        return this;
    }

    public int getCause() {
        return cause;
    }

    public ErrorObj setCause(int cause) {
        this.cause = cause;
        return this;
    }
}
