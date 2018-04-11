package site.gaoyisheng.test.dynamicLoadClassBetter;

public class ObjectFactory {

    /**
     * 安全的newInstance()实例方法.
     * 无需类型强制类型转换.
     * @param tClass 泛型类
     * @param <T> 泛型类型
     * @return 返回对应类型实例
     */
    public static <T> T getNewInstance(Class<T> tClass){

        try {

            return tClass.newInstance();

        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }

    }
}
