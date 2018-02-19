package prueba.semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore=new Semaphore(2);
        SemaphoreExample worker1=new SemaphoreExample("cursiva",semaphore);
        SemaphoreExample worker2=new SemaphoreExample("negrita",semaphore);
        SemaphoreExample worker3=new SemaphoreExample("sub",semaphore);
        worker1.start();
        worker2.start();
        worker3.start();

    }
}
