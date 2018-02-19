package prueba.map;

import java.util.HashMap;
import java.util.Observable;

public class HashMapExample extends Observable{

    private HashMap<String,String> data;
    private int warning=0;

    public HashMapExample(int warning){
        data=new HashMap<String, String>();
        this.warning=warning;
    }

    public void setData(String key, String value){
        if (data.containsKey(key)) {
            data.put(key,value);;
        } else {
            data.put(key, value);
        }
    }

    public boolean verifWarning(String value){
        if(data.size()>= warning){
            System.out.println("ENTROOOO");
            notifyObservers(value);
            return true;
        }else {
            return false;
        }
    }

    public void printData(){
        for (String s:data.values()
                ) {
            System.out.println(s);
            System.out.println(data.size());
        }
        System.out.println();
    }

}
