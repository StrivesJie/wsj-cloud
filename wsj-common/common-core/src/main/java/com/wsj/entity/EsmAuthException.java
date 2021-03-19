package com.wsj.entity;

/**
 * @Author: wsj
 * @Date: 2021/3/15 20
 * @Description:
 */
public class EsmAuthException extends Exception{
    private static final long serialVersionUID = -401248370487311023L;
    public EsmAuthException(String message){
        super(message);
    }
}
