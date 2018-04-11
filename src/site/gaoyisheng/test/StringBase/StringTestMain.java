package site.gaoyisheng.test.StringBase;

public class StringTestMain {


    public static void main(String[] args) {
        testEquals();
        testEquals2();
    }

    public static void testEquals2(){
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
    private static String getA(){
        return "a";
    }

    /**
     * .
     * 编译优化，指向同一个对象
     */
    private static void testEquals(){
        
        String a = "a" + "b" + 1;
        String b = "ab1";
        
        System.out.println("a == b 的结果: " + a == b);
        System.out.println("a == b 的结果: " + ( a == b));

    }
}
