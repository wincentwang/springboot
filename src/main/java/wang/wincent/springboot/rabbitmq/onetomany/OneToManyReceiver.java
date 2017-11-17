package wang.wincent.springboot.rabbitmq.onetomany;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "simpleQueue")
public class OneToManyReceiver {

	@RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver1  : " + hello);
    }
	
}
