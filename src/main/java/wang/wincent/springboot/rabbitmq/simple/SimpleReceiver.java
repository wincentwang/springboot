package wang.wincent.springboot.rabbitmq.simple;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "simpleQueue")
public class SimpleReceiver {

	@RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver1  : " + hello);
    }
	
}
