package site.gaoyisheng.test.classloader;


public class ClassLoaderTestMain {

    private static String ClassA = "site.gaoyisheng.test.classloader.A";

    public static void main(String[] args){

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        try {
            //仅载入文件， 不 初始化
            System.out.println("classLoader.loadClass ==> 系统加载class A");
            Class c = classLoader.loadClass(ClassA);

            //载入文件 并 初始化
            System.out.println("Class.forName ==> 加载 class A");
            Class.forName(ClassA);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("hah123");
    }
}
