package xx.bue;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

@Component
public class MyConsumer {
    @JmsListener(destination = "myqueue")
//    @SendTo
    public void takeMsg(TextMessage msg) throws JMSException {
        System.out.println("進入 sendMsg1=" + msg);
//        return "xxxxxxxxxx";
    }

    @JmsListener(destination = "myqueue")
//    @SendTo
    public void takeMsg(String msg) throws JMSException {
        System.out.println("進入 sendMsg2=" + msg);
//        return 999;
    }
}
