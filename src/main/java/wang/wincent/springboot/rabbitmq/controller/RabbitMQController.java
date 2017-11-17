package wang.wincent.springboot.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wang.wincent.springboot.rabbitmq.simple.SimpleSender;

@RestController
@RequestMapping("/rabbit")
public class RabbitMQController {

	@Autowired
    private SimpleSender simpleSender;
    
    @GetMapping("/simple/send")
    public void simpleSend() {
    	simpleSender.send();
    }
}
