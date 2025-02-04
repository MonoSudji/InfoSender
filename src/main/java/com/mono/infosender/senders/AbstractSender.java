package com.mono.infosender.senders;


import java.io.IOException;

public interface AbstractSender<T>{
    void send(T infoModel) throws IOException, InterruptedException;
}
