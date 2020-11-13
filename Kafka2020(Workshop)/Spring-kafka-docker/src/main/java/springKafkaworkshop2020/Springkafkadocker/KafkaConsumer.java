package springKafkaworkshop2020.Springkafkadocker;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="mytopic", groupId="my_group_id")
    public void getMessage(String message){

        System.out.println(message);

    }
}