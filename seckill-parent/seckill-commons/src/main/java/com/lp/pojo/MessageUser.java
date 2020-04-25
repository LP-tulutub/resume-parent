package com.lp.pojo;

import java.io.Serializable;

public class MessageUser extends MiaoshaMessageUser implements Serializable {

    private MiaoshaMessage miaoshaMessage;

    public MessageUser() {
    }

    public MiaoshaMessage getMiaoshaMessage() {
        return miaoshaMessage;
    }

    public void setMiaoshaMessage(MiaoshaMessage miaoshaMessage) {
        this.miaoshaMessage = miaoshaMessage;
    }
}
