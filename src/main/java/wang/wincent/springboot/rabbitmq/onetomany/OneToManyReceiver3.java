package wang.wincent.springboot.rabbitmq.onetomany;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "simpleQueue")
public class OneToManyReceiver3 {

	@RabbitHandler
    public void process(String message) {
        System.out.println("Receiver3 : " + message);
    }
	
}
