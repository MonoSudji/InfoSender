package com.mono.infosender.senders;


import com.mono.infosender.model.AbsSendObject;
import com.mono.infosender.model.SendObject;

import java.io.IOException;

public class Sender<T extends SendObject> extends AbsSender<T> {

    @Override
    public void send(T infoModel) throws IOException, InterruptedException {
        send(infoModel.getAddress() , infoModel.getObject());
    }
}
