package xx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class CMain {
    public static void main(String[] args) {
        SpringApplication.run(CMain.class, args);
    }
}
