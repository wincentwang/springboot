package wang.wincent.springboot.rabbitmq.manytomany;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManyToManySender2 {

	@Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
    	for(int i=1;i<=10;i++){
			String sendMsg = "2-No:"+i+"----ManyToMany ";
			System.out.println("Sender2: " + sendMsg);
			this.rabbitTemplate.convertAndSend("manyToMany", sendMsg);
    	}
	}
    
}
