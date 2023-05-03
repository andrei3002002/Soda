

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");

    Soda fanta = new Soda("Raspberries");
    System.out.println("Old taste of Fanta: " + fanta.getFlavor());
    fanta.setFlavor("Strawberry");
    System.out.println("\tNew taste of Fanta: " + fanta.getFlavor());

    System.out.println();

    Soda cola  = new Soda("Vanilla");
    System.out.println("Old taste of Cola: " + cola.getFlavor());
    cola.setFlavor("Cherry");
    System.out.println("\tNew taste of Cola: " + cola.getFlavor());

  }
}