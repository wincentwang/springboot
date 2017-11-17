package wang.wincent.springboot.rabbitmq.manytomany;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManyToManySender {

	@Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
    	for(int i=1;i<=10;i++){
			String sendMsg = "1-No:"+i+"----ManyToMany ";
			System.out.println("Sender1: " + sendMsg);
			this.rabbitTemplate.convertAndSend("manyToMany", sendMsg);
    	}
	}
    
}
