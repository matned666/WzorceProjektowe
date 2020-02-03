package b_structural.fasade_demo;

public class FasadeMain {
    public static void main(String[] args) {
        // używamy żeby ukryć używanie skomplikowanych systemów

        Waiter waiter = new Waiter();

        waiter.giveBeer();
        waiter.giveMenuMeat();
        waiter.giveMenuVege();
        waiter.checkPlease();

    }
}
