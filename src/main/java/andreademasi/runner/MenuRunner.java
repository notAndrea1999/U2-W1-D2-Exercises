package andreademasi.runner;

import andreademasi.U2W1D1EexercisesApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MenuRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1D1EexercisesApplication.class);
        System.out.println(ctx.getBean("getMenu"));
    }
}
