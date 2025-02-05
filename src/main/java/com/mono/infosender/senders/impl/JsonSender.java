package com.mono.infosender.senders.impl;


import com.mono.infosender.objects.ext.JsonSendObject;

import java.io.IOException;

public class JsonSender<T extends JsonSendObject> extends AbsJsonSender<T> {

    @Override
    public void send(T jsonSenderObject) throws IOException, InterruptedException {
        send(jsonSenderObject.getAddress() , jsonSenderObject.getObject());
    }
}
