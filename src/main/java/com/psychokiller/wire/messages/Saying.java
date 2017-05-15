package com.psychokiller.wire.messages;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Saying extends AbstrctMessage{
    @JsonProperty
    private String content;


    @JsonCreator
    public Saying(@JsonProperty("context") String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
