package wang.wincent.springboot.rabbitmq.onetomany;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OneToManySender {

	@Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
    	for(int i=1;i<=100;i++){
			String sendMsg = "No:"+i+"----OneToMany ";
			System.out.println("Sender: " + sendMsg);
			this.rabbitTemplate.convertAndSend("simpleQueue", sendMsg);
    	}
	}
    
}
