//version 2  -->  Reptile.java
//import Animal from animal folder/package.



package inheritanceDemoV2;

import animal.Animal;

public class Reptile extends Animal {

    private boolean hasScales;
    private boolean laysEggs;

    public Reptile(){
        super(true, 4, "Carnivore");
    }

    public Reptile(boolean hasScales, boolean laysEggs){

        super(true, 4, "Carnivore");
        this.hasScales = hasScales;
        this.laysEggs = laysEggs;
        //this();
    }

    public Reptile(boolean beingDangerous, int numberOfLegs, String diet, boolean hasScales, boolean laysEggs){

        super(beingDangerous, numberOfLegs, diet);
        this.hasScales = hasScales;
        this.laysEggs = laysEggs;

    }

    public Reptile(Animal animal) {
        super(animal.isBeingDangerous(), animal.getNumberOfLegs(), animal.getDiet());
        // super(animal.beingDangerous,animal.numberOfLegs, animal.diet);
        // --> but in this case, this constructor is taking Animal object.
        // Animal is a superclass,but it is not in the same package as Reptile class.

    }


    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println(" Hiss~~~");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println(" Eat anything.  ");
    }

    public static void main(String[] args) {
        Reptile reptile = new Reptile();
        System.out.println(reptile.getDiet());
    }

}
