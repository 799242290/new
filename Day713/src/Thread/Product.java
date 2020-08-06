package Thread;

public class Product implements Runnable {
    Machine m;

    public Product(Machine m) {
        this.m = m;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (m) {
                if (!m.machine) {
                    try {
                        m.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 1; i <= 5; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("正在打造第" + i + "件法器");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("打造完成");
                m.machine = false;
                m.notify();
            }
        }
    }
}
