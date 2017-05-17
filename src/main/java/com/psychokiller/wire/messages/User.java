package com.psychokiller.wire.messages;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.security.Principal;

public class User extends AbstrctMessage implements Principal{
    private String phoneNumber;

    @JsonCreator
    public User(@JsonProperty("phoneNumber") String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonIgnore
    @Override public String getName() {
        return phoneNumber;
    }
}
