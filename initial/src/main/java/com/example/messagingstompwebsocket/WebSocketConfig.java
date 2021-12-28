package com.example.messagingstompwebsocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @ClassName WebSocketConfig
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-12-24 20:34
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
@Configuration //Spring配置类
@EnableWebSocketMessageBroker  //启用WebSocket消息处理，有消息代理支持
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override //WebSocketMessageBrokerConfigurer配置消息代理的默认方法
    public void configureMessageBroker(MessageBrokerRegistry config) {
        //启用简单内存的消息代理，将消息传递回前缀为/topic的目标客户端
        config.enableSimpleBroker("/topic");
        //它也是指定/app绑定到用 注释的方法的消息的前缀 @MessageMapping
        config.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/gs-guide-websocket").withSockJS();
    }
}
