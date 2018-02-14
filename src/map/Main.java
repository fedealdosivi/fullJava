package map;

public class Main {
    public static void main(String[] args) {
        Controller controller=new Controller();
        controller.addToHashTable("hola", "que se yo");
        controller.addToHashTable("holu", "que se ya");
        controller.addToHashTable("holi", "que se ye");
        controller.addToHashTable("hole", "que se yi");
        controller.addToHashTable("hola", "que se yo");
        controller.printAll();
    }
}
