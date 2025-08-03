package one.digitalinnovation.gof;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Comportamento atacar = new Atacar();
        Comportamento defender = new Defender();
        Comportamento fugir = new Fugir();

        Entidade user = new Entidade();
        user.setComportamento(atacar);
        user.agir();
        user.agir();

        user.setComportamento(defender);
        user.agir();

        user.setComportamento(fugir);
        user.agir();

    }
}