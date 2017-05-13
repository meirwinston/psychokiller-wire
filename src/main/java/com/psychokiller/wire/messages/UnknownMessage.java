package com.psychokiller.wire.messages;

import java.time.ZonedDateTime;

public class UnknownMessage extends AbstrctMessage {
    public UnknownMessage(){
        super(ZonedDateTime.now());
    }
}
