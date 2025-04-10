package com.ttb.ekafka.poc;

import jakarta.enterprise.context.ApplicationScoped;
import org.apache.camel.builder.RouteBuilder;

@ApplicationScoped
public class Route extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("kafka:{{kafka.topic.name}}")
                .routeId("data-consumer")
                .log("${body}");
    }
}
