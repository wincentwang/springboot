package wang.wincent.springboot.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wang.wincent.springboot.rabbitmq.fanoutexchange.FanoutExchangeSender;
import wang.wincent.springboot.rabbitmq.manytomany.ManyToManySender;
import wang.wincent.springboot.rabbitmq.manytomany.ManyToManySender2;
import wang.wincent.springboot.rabbitmq.onetomany.OneToManySender;
import wang.wincent.springboot.rabbitmq.simple.SimpleSender;
import wang.wincent.springboot.rabbitmq.topicexchange.TopicExchangeSender;
import wang.wincent.springboot.rabbitmq.userentity.UserEntitySender;

@RestController
@RequestMapping("/rabbit")
public class RabbitMQController {

	@Autowired
    private SimpleSender simpleSender;
	
	@Autowired
    private OneToManySender oneToManySender;
    
	@Autowired
    private ManyToManySender manyToManySender;
	
	@Autowired
    private ManyToManySender2 manyToManySender2;

	@Autowired
    private UserEntitySender userEntitySender;
	
	@Autowired
    private TopicExchangeSender topicExchangeSender;
	
	@Autowired
    private FanoutExchangeSender fanoutExchangeSender;
	
	/**
	 * one to one
	 */
    @GetMapping("/simple/send")
    public void simpleSend() {
    	simpleSender.send();
    }
    
    /**
     * one to many
     */
    @GetMapping("/onetomany/send")
    public void oneToMany() {
    	oneToManySender.send();
    }
    
    /**
     * many to many
     */
    @GetMapping("/manytomany/send")
    public void manyToMany() {
    	manyToManySender.send();
    	manyToManySender2.send();
    }
    
    /**
     * user entity
     */
    @GetMapping("/userentity/send")
    public void userentity() {
    	userEntitySender.send();
    }
    
    /**
     * Topic Exchange 
     */
    @GetMapping("/topicexchange/send")
    public void topicExchange() {
    	topicExchangeSender.send();
    }
    
    /**
     * Fanout Exchange 
     */
    @GetMapping("/fanoutexchange/send")
    public void fanoutExchange() {
    	fanoutExchangeSender.send();
    }
    
}
