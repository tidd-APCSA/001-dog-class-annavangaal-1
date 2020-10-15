public class Dog{

  private String name;
  private String breed;
  private String color;
  private double weight;
  private boolean houseTrained;


  public Dog(String name, String breed, String color, double weight, boolean houseTrained){
    this.name = name;
    this.breed = breed;
    this.color = color;
    this.weight = weight;
    this.houseTrained = houseTrained;
  }

  public String getName(){
    return this.name;
  }

  public String getBreed(){
    return this.breed;
  }

  public String getColor(){
    return this.color;
  }

  public double getWeight(){
    return this.weight;
  }

  public boolean isHouseTrained(){
    return this.houseTrained;
  }

  public String toString()
  {
    return this.name + "🐶";
  }
}