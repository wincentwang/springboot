package wang.wincent.springboot.rabbitmq.userentity;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserEntitySender {

	@Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
    	UserEntity user=new UserEntity();
    	user.setPassword("123123");
    	user.setUsername("wincent");
    	System.out.println("Sender: " + user);
		this.rabbitTemplate.convertAndSend("userEntityQueue", user);
	}
    
}
