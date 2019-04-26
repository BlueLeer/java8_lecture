import com.sun.java.accessibility.util.Translator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author WangLe
 * @date 2019/4/24 16:12
 * @description 动态代理
 */
public class Test {
    public static void main(String[] args) {
        A o = (A) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{A.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (args != null && args.length > 0) {
                    System.out.println("invoke..." + args[0]);
                } else {
                    System.out.println("invoke...参数是空的");
                }
                return null;
            }
        });

        o.func1("Hello");

    }
}

interface A {
    void func1(String message);

    void func2();
}
