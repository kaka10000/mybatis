package com.jeff.web.except;

/**
 * Created by liuren on 2017/11/5.
 */
public class NoPermissionException extends RuntimeException{

    public NoPermissionException(String msg){
        super(msg);
    }
}
