package io.nats.examples;

import io.nats.client.Connection;
import io.nats.client.Nats;
import io.nats.client.Options;

public class ReconnectNone {
    public static void main(String[] args) {

        try {
            // [begin reconnect_none]
            Options options = new Options.Builder().
                                        server("nats://demo.nats.io:4222").
                                        noReconnect(). // Disable reconnect attempts
                                        build();
            Connection nc = Nats.connect(options);

            // Do something with the connection

            nc.close();
            // [end reconnect_none]
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}