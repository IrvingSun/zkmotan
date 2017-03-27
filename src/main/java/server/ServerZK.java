package server;

import com.weibo.api.motan.common.MotanConstants;
import com.weibo.api.motan.util.MotanSwitcherUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by irvingsun on 17/3/27.
 */
public class ServerZK {
    public static void main(String[] args) {
        MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER,true);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:motan_service_zk.xml");
        System.out.println("Server start...");
    }
}
