package de.mschneid.microservices.currencyexchangeservice;

import lombok.extern.java.Log;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Log
public class RabbitMqReceiver {

    @RabbitListener(queues = "#{autoDeleteQueue1.name}")
    public void receive1(RabbitTestMessage in) throws InterruptedException {
        log.info("received message: " + in.toString());
    }

}
