package wang.wincent.springboot.rabbitmq.fanoutexchange;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.B")
public class FanoutExchangeReceiver2 {

   @RabbitHandler
   public void process(String msg) {
        System.out.println("FanoutReceiverB  : " + msg);
   }

}
