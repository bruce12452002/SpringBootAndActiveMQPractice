package lab.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Destination;

@Configuration
@EnableJms
public class DestinationConfig {
    @Value("${destination-name}")
    private String destName;

    @Bean
    public Destination getDestination() {
        System.out.println("name=" + destName);
        if (destName.contains("myQueue")) {
            return new ActiveMQQueue(destName);
        } else if (destName.contains("myTopic")) {
            return new ActiveMQTopic(destName);
        }
        return null;
    }
}
