package books;

/**
 * @author 松哥
 */
public class MyInterfaceb implements MyInterfaceAbstract {
    @Override
    public void methodA() {
        System.out.println("这是一个接口方法A");
    }

    @Override
    public void methodB() {
        System.out.println("这是一个接口方法B");
    }

    @Override
    public void methodC() {
        System.out.println("这是一个接口方法C");
    }

    @Override
    public void methodD() {
        System.out.println("这是一个接口方法D");
    }

    @Override
    public void methodE() {
        System.out.println("实现了E的覆盖重写方法！");
    }
}
