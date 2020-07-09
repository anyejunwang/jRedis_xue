/**
 * @Description
 * @Author sw
 * @Date 2020/04/14 10:21
 **/
public class testClassLoader {

    public static void main(String[] args) {
        System.out.println(testClassLoader.class.getResource(""));
        System.out.println(testClassLoader.class.getResource("/"));
        System.out.println(testClassLoader.class.getResource("/testClassLoader"));
        System.out.println(testClassLoader.class.getResource("/testClassLoader/test1"));

        System.out.println(testClassLoader.class.getClassLoader().getResource(""));
        System.out.println(testClassLoader.class.getClassLoader().getResource("/"));
        System.out.println(testClassLoader.class.getClassLoader().getResource("/testClassLoader"));

        System.out.println(testClassLoader.class.getClassLoader().getSystemResource(""));
        System.out.println(testClassLoader.class.getClassLoader().getSystemResource("/"));
        System.out.println(testClassLoader.class.getClassLoader().getSystemResource("/testClassLoader"));

        StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();

        for (int i = 0; i < stackTrace.length; i++) {
            System.out.println("key = " + stackTrace[i]);
        }
    }
}
