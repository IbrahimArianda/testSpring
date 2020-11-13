package springKafkaworkshop2020.Springkafkadocker;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final String TOPIC= "mytopic";


    private KafkaTemplate<String,String> KafkaTemplate;

    public void writeMessage(String msg){

        this.KafkaTemplate.send(TOPIC, msg);
    }

}