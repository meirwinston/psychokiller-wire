package com.psychokiller.wire;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.psychokiller.wire.messages.Saying;
import io.dropwizard.jersey.validation.Validators;
import org.testng.annotations.Test;

import javax.validation.Validator;
import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class SayingTest {

    private static final ObjectMapper MAPPER = ObjectMapperFactory.newObjectMapper();
    private static final Validator VALIDATOR = Validators.newValidator();

    @Test
    public void testSaying() throws IOException {
        Saying expected = new Saying(1,"Hello");
        String json = MAPPER.writeValueAsString(expected);
        Saying actual = MAPPER.readValue(json, Saying.class);
        assertEquals(expected.getId(), actual.getId());
//        assertEquals(expected.getTimestamp(), actual.getTimestamp());

    }
}
