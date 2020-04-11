package xx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
//@ComponentScan("xx.bue")
@EnableJms
public class CMain {
    public static void main(String[] args) {
        SpringApplication.run(CMain.class, args);
    }
}
