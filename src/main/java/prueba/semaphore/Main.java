package prueba.semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore=new Semaphore(2);
        SemaphoreExample worker1=new SemaphoreExample("cursiva",semaphore);
        SemaphoreExample worker2=new SemaphoreExample("negrita",semaphore);
        SemaphoreExample worker3=new SemaphoreExample("sub",semaphore);
        Thread t1=new Thread(worker1);
        Thread t2=new Thread(worker2);
        Thread t3=new Thread(worker3);
        t1.start();
        t2.start();
        t3.start();

    }
}
