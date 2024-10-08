package br.com.ufape.es.topicos.product_service.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import br.com.ufape.es.topicos.product_service.config.RabbitMQConsumerConfig;

@Service
public class PriceMessageConsumer {

    @RabbitListener(queues = RabbitMQConsumerConfig.PRICE_QUEUE)
    public void receiveMessage(String message) {
        System.out.println("Mensagem recebida do serviço de preço: " + message);
    }
}
