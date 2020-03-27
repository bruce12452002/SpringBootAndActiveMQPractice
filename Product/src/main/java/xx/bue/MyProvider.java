package xx.bue;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
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
        System.out.println("進入 sendMsg");
        jmsTemplate.convertAndSend(dest, "xxx");
    }

    @Scheduled(fixedDelay = 2000)
    public void sendMsgSchedule() {
        System.out.println("進入 sendMsgSchedule");
        jmsTemplate.convertAndSend(dest, "sche xxx");
    }
}
