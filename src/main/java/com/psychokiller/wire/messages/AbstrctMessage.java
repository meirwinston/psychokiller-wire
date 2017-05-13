package com.psychokiller.wire.messages;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.dropwizard.jackson.Discoverable;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

/**
 * Base class for messages in the "events" topic.
 */
@JsonNaming(SnakeCaseStrategy.class)
@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSubTypes({
//    @JsonSubTypes.Type(value = AddEventMessage.class),
})
public abstract class AbstrctMessage implements Discoverable {

    @NotNull
    @JsonProperty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
    protected ZonedDateTime timestamp;

    public AbstrctMessage(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }
    public AbstrctMessage() {
        this.timestamp = ZonedDateTime.now();
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }





//    @Override
//    public abstract boolean equals(Object o);
//
//    @Override
//    public abstract int hashCode() ;
}
