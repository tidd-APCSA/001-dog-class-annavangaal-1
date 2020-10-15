public class Main {
  public static void main(String[] args) {
    // test your code here by creating a three different dogs from the Dog class. Be sure you give each dog different characteristics.
    Dog luka = new Dog("Luka", "American Cocker Spaniel", "Black", 27.5, true);
    Dog lucy = new Dog("Lucy", "Lab Mix", "Brown", 33.4, false);
    Dog rex = new Dog("Rex", "German Sheperd", "Brown", 67.8, true);

    System.out.print(luka.getName());
    System.out.print(" is a " + luka.getColor());
    System.out.println(" " + luka.getBreed());
    System.out.print("who weighs " + luka.getWeight() + " pounds,");
    System.out.println(" and it is " + luka.isHouseTrained() + " that he is house trained.");

    System.out.println();

    System.out.print(lucy.getName());
    System.out.print(" is a " + lucy.getColor());
    System.out.println(" " + lucy.getBreed());
    System.out.print("who weighs " + lucy.getWeight() + " pounds, and it is ");
    System.out.println(lucy.isHouseTrained() + " that she is house trained.");
  
    System.out.println();

    System.out.print(rex.getName());
    System.out.print(" is a " + rex.getColor());
    System.out.println(" " + rex.getBreed());
    System.out.print("who weighs " + rex.getWeight() + " pounds, and it is ");
    System.out.println(rex.isHouseTrained() + " that he is house trained.");

    System.out.println();

    System.out.println(luka);
    System.out.println(lucy);
    System.out.println(rex);
  }
} 
