/**
 * @author WangLe
 * @date 2019/4/24 16:34
 * @description
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
//        System.out.println(ClassLoaderTest.class.getClassLoader().getClass().getSimpleName());
//        // String类使用的是BootStrap类加载器,不能获取.
//        System.out.println(String.class.getClassLoader().getClass().getSimpleName());

        try {
//            Object i = null;
//            String s = i.toString();
            int a = 1/0;
        } catch (RuntimeException e) {
            System.out.println("cause:"+e.getCause().getMessage());
            System.out.println("message:"+e.getMessage());
//            e.printStackTrace();

        }


    }
}
