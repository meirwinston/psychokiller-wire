package com.psychokiller.wire.messages;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Account extends AbstrctMessage{
    private String phoneNumber;

    @JsonCreator
    public Account(@JsonProperty("phoneNumber") String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
