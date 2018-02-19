package prueba.map;

public class Main {
    public static void main(String[] args) {
        Controller controller=new Controller();
        controller.addToHashTable("ciudad", "que se yo");//este no deberia aparecer cuando se hace el print
        controller.addToHashTable("ciudad", "que se yo2");//reemplaza al de arriba
        controller.addToHashTable("aaa", "que se yo1");
        controller.addToHashTable("aaba", "que se yo3");//cuando se inserta el 3er elemento el observer debe dar warning
        controller.addToHashTable("aabha", "que se yoa3");
        controller.printAll();
    }
}
