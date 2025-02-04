package com.mono.infosender.senders;


import com.mono.infosender.model.AbsSendObject;

import java.io.IOException;

public class Sender<T extends AbsSendObject> extends AbsSender<T> {

    @Override
    public void send(T infoModel) throws IOException, InterruptedException {
        send(infoModel.getAddress() , infoModel.getObject());
    }
}
