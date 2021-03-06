package prueba.map;

import java.util.Hashtable;
import java.util.Observable;

public class HashTableExample extends Observable{

    private Hashtable<String, String>data;
    private int warning;

    public HashTableExample(int warning){
        data=new Hashtable<String, String>();
        this.warning =warning;
    }


    //agrega un valor, si ya existe la clave lo reemplaza y notifica al observador
    //con el nuevo valor y el viejo
    public void setData(String key, String value){
        if (data.containsKey(key)) {
            String valorAntiguo=data.get(key);
            data.put(key,value);
            setChanged();
            notifyObservers(key+ value + " Valor Antiguo=" +valorAntiguo);
        } else {
            data.put(key, value);
            setChanged();
            notifyObservers(key + value);
        }
        verifWarning(value);
    }

    //verifica que la cantidad de datos es mayor o igual a la variable
    //warning

    public void verifWarning(String value){
        if(data.size()== warning){
            setChanged();
            notifyObservers("Se alcanzo el limite permitido");
        }else if(data.size()>warning){
            setChanged();
            notifyObservers("Se supero el limite permitido");
        }
    }

    public void printData(){
        for (String s:data.values()
                ) {
            System.out.println(s);
        }
        System.out.println();
    }
}
