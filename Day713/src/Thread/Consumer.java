package Thread;

public class Consumer implements Runnable{
    Machine m;

    public Consumer(Machine m) {
        this.m = m;
    }

    @Override
    public void run() {
        while(true){
            synchronized (m){
                if(m.machine){
                    try {
                        m.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("正在售卖法器。。。");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("售卖完毕");
                m.machine = true;
                m.notify();
            }
        }
    }
}
