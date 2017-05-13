package com.psychokiller.wire.messages;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Saying extends AbstrctMessage{
    @JsonProperty
    private long id;

    @JsonProperty
    private String content;


    @JsonCreator
    public Saying(@JsonProperty("id") long id,@JsonProperty("context") String content) {
        this.id = id;
    }


    public long getId() {
        return id;
    }


    public String getContent() {
        return content;
    }

}
