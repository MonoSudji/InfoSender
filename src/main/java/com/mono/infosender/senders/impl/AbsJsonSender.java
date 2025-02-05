package com.mono.infosender.senders.impl;

import com.mono.infosender.objects.ext.JsonSendObject;
import com.mono.infosender.senders.AbstractSender;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class AbsJsonSender<T extends JsonSendObject> implements AbstractSender<T> {

    protected void send(String address, Object object) throws IOException, InterruptedException {
        JsonSendObject jsonSendObject = new JsonSendObject();
        HttpClient client = HttpClient.newHttpClient();
        client.send(HttpRequest.newBuilder()
                .uri(URI.create(address))
                .POST(HttpRequest.BodyPublishers.ofString(object.toString()))
                .build(), HttpResponse.BodyHandlers.ofString());

    }
}
