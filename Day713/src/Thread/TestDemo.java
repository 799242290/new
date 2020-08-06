package Thread;

public class TestDemo {
    public static void main(String[] args) {
        Machine m = new Machine();
        Thread t1 = new Thread(new Product(m));
        Thread t2 = new Thread(new Consumer(m));
        t1.start();
        t2.start();
    }


}
