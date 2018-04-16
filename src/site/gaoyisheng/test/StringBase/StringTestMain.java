package site.gaoyisheng.test.StringBase;

/**
 * SDK 1.8_144.
 */
public class StringTestMain {

    public static void main(String[] args) {
        System.out.println("-----testEquals()-----");
        testEquals();

        System.out.println("\n" +
                "-----testEquals2()-----");
        testEquals2();

        System.out.println("\n" +
                "-----testIntern()-----");
        testIntern();
    }

    /**
     * .
     * 编译优化，指向同一个对象.
     */
    private static void testEquals() {

        String a = "a" + "b" + 1;
        String b = "ab1";

        System.out.println("a == b 的结果: " + a == b);
        System.out.println("a == b 的结果: " + (a == b));

    }

    /**
     * .
     * ==判断引用是否相等.
     * equals()判断值是否相等.
     */
    public static void testEquals2() {
        String a = "a";
        final String c = "a";

        String b = a + "b";
        String d = c + "b";
        String e = getA() + "b";

        String compare = "ab";

        System.out.println(b == compare);
        System.out.println(d == compare);//编译优化，final能确定，所以指向同一个
        System.out.println(e == compare);
    }

    /**
     * 测试用.
     * @return “a”
     */
    private static String getA() {
        return "a";
    }

    /**
     * 测试intern的作用.
     * <p>
     * intern()方法:
     * 当调用intern方法时，JVM会在常量池中通过equals()方法来匹配是否存在等值的String,
     * 如果存在，则直接返回其地址。否则再新建.
     * 所以，只要值相等，一定可以用==判断相等.
     * <p>
     * 但是intern效率不高.
     */
    private static void testIntern() {
        String a = "a";
        String b = a + "b";
        String c = "ab";
        String d = new String(b);

        System.out.println(b == c);
        System.out.println(c == d);
        System.out.println(c == d.intern());
        System.out.println(b.intern() == d.intern());
    }
}