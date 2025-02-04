package com.mono.infosender.model;

import lombok.Data;

import java.net.http.HttpClient;


@Data
public abstract class AbsSendObject<T>{
    private HttpClient clientHttp;
    private String address;
    private T object;

    public abstract String toJson();
}
