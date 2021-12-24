package com.example.messagingstompwebsocket;

/**
 * @ClassName Greeting
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-12-24 19:35
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
public class Greeting {

    private String content;

    public Greeting() {

    }

    public Greeting(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
