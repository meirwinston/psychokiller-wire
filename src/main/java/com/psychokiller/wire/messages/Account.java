package com.psychokiller.wire.messages;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Account extends AbstrctMessage{
    private String phoneNumber;

    @JsonCreator
    public Account(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
