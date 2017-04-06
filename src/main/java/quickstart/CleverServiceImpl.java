package quickstart;

/**
 * Created by sunwei3 on 2017/4/6.
 */
public class CleverServiceImpl implements FooService{
    public String hello(String name) {
        System.out.println("Invoke RPC service method, [Clever]"+name);
        return "Clever Hello, "+name;
    }
}
