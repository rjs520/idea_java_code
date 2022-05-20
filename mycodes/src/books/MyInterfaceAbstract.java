package books;

/**
 * @author 松哥
 */
public interface MyInterfaceAbstract {
    //这是一个抽象方法
    public abstract void methodA();

    abstract void methodB();

    public void methodC();

    void methodD();

    public default void methodE() {
        System.out.println("这是一个默认方法");
    }

    public static void methodF() {
        System.out.println("这是一个静态方法");
    }

    public default void method1() {
        methodG();
    }

    private void methodG() {
        System.out.println("这是一个私有默认方法！");
    }
}
