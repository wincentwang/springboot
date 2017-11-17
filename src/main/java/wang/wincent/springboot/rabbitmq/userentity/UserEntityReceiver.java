package wang.wincent.springboot.rabbitmq.userentity;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "userEntityQueue")
public class UserEntityReceiver {

	@RabbitHandler
    public void process(UserEntity user) {
        System.out.println("Receiver1  : " + user);
    }
	
}
