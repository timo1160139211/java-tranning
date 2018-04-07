package site.gaoyisheng.test.classloader;

public class A {
    public static int a;

    static {
        a = 6;
        System.out.println("Class A static initial!  Current value of 'a' is " + a );
    }
}
