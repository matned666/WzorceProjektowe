package b_structural.fasade_demo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Waiter {

    public void giveBeer(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Input beer type \"small\", \"big\": ");
        String rozmiar = reader.nextLine();
        reader.close();
        System.out.println("Here you are, " + rozmiar +" beer.");
    }

    public void giveMenuMeat(){
        String first = "Beef steak with patatoe";
        String seccond = "Pork with rice";
        String third = "Strogonoff with cabbage";
        ArrayList<String> menu = new ArrayList<>();
        menu.add(first);
        menu.add(seccond);
        menu.add(third);

        System.out.println("Menu meat: "+menu.toString());
    }
    public void giveMenuVege(){
        System.out.println("Menu vege: "+MeatMenu.getMenu());
    }


    public void checkPlease() {
        Random random = new Random();
        System.out.println("You have to pay: $"+random.nextInt(100) + "," + random.nextInt(99));
    }
}
