package com.example.messagingstompwebsocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {


	private Logger logger = LoggerFactory.getLogger(GreetingController.class);

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) throws Exception {
		// simulated delay
		Thread.sleep(1000);
		logger.info("message:" + message.getName());
		//进行加3操作
		return new Greeting("Hello, " + HtmlUtils.htmlEscape((Integer.parseInt(message.getName()) + 1) + "!"));
	}

}
