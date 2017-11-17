package wang.wincent.springboot.rabbitmq.manytomany;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "manyToMany")
public class ManyToManyReceiver2 {

	@RabbitHandler
    public void process(String message) {
        System.out.println("Receiver2  : " + message);
    }
}
