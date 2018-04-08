package site.gaoyisheng.test.dynamicLoadClass;

public class DynamicLoaderTestMain {

    public static void main(String[] args) {
        //excel/word/等动态载入

        String EXCEL = "site.gaoyisheng.test.dynamicLoadClass.Excel";
        String WORD = "site.gaoyisheng.test.dynamicLoadClass.Word";

        //String currentType = EXCEL;
        String currentType = WORD;

        try {
            Class c = Class.forName(currentType);

            Assembly assembly = (Assembly) c.newInstance();

            System.out.println("Class 类加载器: " + c.getClass().getClassLoader());
            System.out.println("Assembly 类加载器: " + assembly.getClass().getClassLoader());

            assembly.start();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
