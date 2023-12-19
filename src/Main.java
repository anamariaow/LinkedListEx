import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creare LinkedList con elementi e stamparlo in console
        Fruit frutto1 = new Fruit("arancia");
        Fruit frutto2 = new Fruit("avocado");
        Fruit frutto3 = new Fruit("ananas");
        Fruit frutto4 = new Fruit("anguria");


        LinkedList<Fruit> frutta = new LinkedList<>(List.of(frutto1, frutto2, frutto3, frutto4));
        System.out.println("Lista frutta iniziale: " + frutta);

        //aggiungere un elemento al primo posto della lista e uno all'ultimo e stampare
        frutta.addFirst(new Fruit("albicocca"));
        frutta.addLast(new Fruit("amarena"));
        System.out.println("Lista aggiornata: " + frutta);
    }
}