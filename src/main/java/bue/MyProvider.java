package bue;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.Destination;

@Component
public class MyProvider {
    @Resource
    private JmsMessagingTemplate jmsTemplate;

    @Resource
    private Destination dest;

    public void sendMsg() {
        jmsTemplate.convertAndSend(dest, "xxx");
    }
}
