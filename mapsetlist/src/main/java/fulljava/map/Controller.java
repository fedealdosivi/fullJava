package fulljava.map;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer {

    private HashTableExample hashTableExample;

    public Controller(){
        hashTableExample=new HashTableExample(3);
        hashTableExample.addObserver(this);
    }

    public void addToHashTable(String key, String value){
        hashTableExample.setData(key,value);
    }

    public void printAll(){
        hashTableExample.printData();
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Nueva Actualizacion" + o + " " + arg);
    }
}
