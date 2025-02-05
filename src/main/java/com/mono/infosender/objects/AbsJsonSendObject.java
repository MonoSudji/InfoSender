package com.mono.infosender.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.http.HttpClient;


@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbsJsonSendObject<T>{
    private HttpClient clientHttp;
    private String address;
    private T object;

    public abstract String toJson();
}
