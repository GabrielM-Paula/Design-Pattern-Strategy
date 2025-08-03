package one.digitalinnovation.gof;

public class Atacar implements Comportamento {

    @Override
    public void agir() {
        System.out.println("Atacou");
    }
}
