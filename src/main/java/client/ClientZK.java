package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import quickstart.FooService;

/**
 * Created by irvingsun on 17/3/27.
 */
public class ClientZK {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:motan_client_zk.xml");
        FooService fooService = (FooService) applicationContext.getBean("remoteService");
        System.out.println(fooService.hello("Irving Sun00"));
    }
}
