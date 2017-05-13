package com.psychokiller.wire;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.dropwizard.jackson.Jackson;

public final class ObjectMapperFactory {

    public static ObjectMapper newObjectMapper() {
        ObjectMapper objectMapper = Jackson.newObjectMapper();
        configure(objectMapper);
        return objectMapper;
    }

    public static void configure(ObjectMapper objectMapper) {
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
    }
}
