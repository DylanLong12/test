package inheritanceDemoV3;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Mammal mammal = new Mammal();

        System.out.println(mammal);

        mammal.setBeingDangerous(true);
        mammal.setNumberOfLegs(2);
        mammal.setDiet("herbivore");
        System.out.println(mammal);

        Reptile reptile = new Reptile();
        System.out.println(reptile);

        //upside is that when using super(), all child classes will share the same default values from the parent class.
        //downside is that when using super(), all child classes will inherit the same values and that is not flexible.
        //unexpected behavior because mammals and reptiles share different characteristics
    }
}
