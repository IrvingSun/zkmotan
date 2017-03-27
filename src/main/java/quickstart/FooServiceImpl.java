package quickstart;

/**
 * Created by irvingsun on 17/3/27.
 */
public class FooServiceImpl implements FooService {
    public String hello(String name) {
        System.out.println("Invoke RPC service method, "+name);
        return "Hello, "+name;
    }
}
