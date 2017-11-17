package wang.wincent.springboot.rabbitmq.fanoutexchange;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.C")
public class FanoutExchangeReceiver3 {

	@RabbitHandler
	public void process(String msg) {
	   	System.out.println("FanoutReceiverC  : " + msg);
	}

}
