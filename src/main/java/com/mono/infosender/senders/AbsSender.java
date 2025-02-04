package com.mono.infosender.senders;

import com.mono.infosender.model.SendObject;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract  class AbsSender<T extends SendObject> implements AbstractSender<T> {

    public void send(String address, Object object) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        client.send(HttpRequest.newBuilder()
                .uri(URI.create(address))
                .POST(HttpRequest.BodyPublishers.ofString(object.toString()))
                .build(), HttpResponse.BodyHandlers.ofString());

    }
}
