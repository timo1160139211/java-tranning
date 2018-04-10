package site.gaoyisheng.test.reflection;

public class Animal {

    protected String name = "动物";

    protected int age = 0;

    protected String sex = "";

    protected boolean isFull = false;

    public void run(){
        System.out.println("Running ...");
    }

    public boolean eat(boolean b){
        System.out.println("Eating ...");
        return isFull || b;
    }

}
