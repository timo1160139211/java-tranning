package site.gaoyisheng.test.classloader;


public class ClassLoaderTestMain {

    public static void main(String[] args) {

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        try {
            String classA = "site.gaoyisheng.test.classloader.A";

            //仅载入文件， 不 初始化
            System.out.println("classLoader.loadClass ==> 系统加载class A");
            classLoader.loadClass(classA);

            //载入文件 并 初始化
            System.out.println("Class.forName ==> 加载 class A");
            Class.forName(classA);

            System.out.println("\n" +
                    "Bootstrap Loader依赖'sun.boot.class.path'系统参数:" + System.getProperty("sun.boot.class.path"));
            System.out.println("\n" +
                    "ExtClassLoader依赖'java.ext.dirs':系统参数" + System.getProperty("java.ext.dirs"));
            System.out.println("\n" +
                    "AppClassLoader依赖'java.class.path'系统参数:" + System.getProperty("java.class.path"));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("haha123  done");
    }
}
