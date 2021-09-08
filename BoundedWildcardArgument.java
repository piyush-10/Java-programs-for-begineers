package javaFramework;

import static javaFramework.Wildcard.*;

class Animal{
    long lifespan;
    double weight;
    Animal(long years,double kg){
        this.lifespan = years;
        this.weight = kg;
    }
    public void print(){
        System.out.println("Maximum longevity: "+ lifespan + " in years");
        System.out.println("Maximum Weight: "+ weight + " in kgs");
    }
}
class Aquatic extends Animal{
    boolean scale;
    Aquatic(long years, double kg,boolean skin){
        super(years,kg);
        this.scale = skin;
    }
    public void print(){
        super.print();
        System.out.println("Has scale? "+ scale);
    }
}
class Land extends Animal{
    short vision;
    Land(long years,double kg,short vision ){
        super(years,kg);
        this.vision = vision;
    }
}
class Pet extends Land{
    String name;
    Pet(long years, double kg, short vision, String name){
        super(years,kg,vision);
        this.name = name;
    }
}
class Wild extends Land{
    double speed;
    Wild(long years, double kg, short vision, double speed){
        super(years,kg,vision);
        this.speed = speed;
    }
}
class AnimalWorld<T extends Animal>{
    T [] listOfAnimal;

    AnimalWorld(T [] list){
        this.listOfAnimal =list;
    }
}
class Wildcard {
    static void vitality(AnimalWorld<?> animals) {
        for (int i = 0; i < animals.listOfAnimal.length; i++) {
            animals.listOfAnimal[i].print();
            System.out.println();
        }
        System.out.println("***************");
        System.out.println();
    }

    static void showSea(AnimalWorld<? super Aquatic> animals) {
        for (int i = 0; i < animals.listOfAnimal.length; i++) {
            animals.listOfAnimal[i].print();
        }
        System.out.println();
    }

    static void showLand(AnimalWorld<? extends Land> animals) {
        for (int i = 0; i < animals.listOfAnimal.length; i++) {
            animals.listOfAnimal[i].print();
            System.out.println("vision: " + animals.listOfAnimal[i].vision);
        }
        System.out.println();
    }

    static void showPet(AnimalWorld<? extends Pet> animals) {
        for (int i = 0; i < animals.listOfAnimal.length; i++) {
            System.out.println("Pet's name: " + animals.listOfAnimal[i].name);
            animals.listOfAnimal[i].print();
            System.out.println("vision: " + animals.listOfAnimal[i].vision);
        }
        System.out.println();
    }
}

public class BoundedWildcardArgument {
    public static void main(String[] args) {
        //create a list of unknown animals of class Animal

        Animal unknown = new Animal(40,720);
        // An unknown annimal object is created
        Animal u[]= {unknown};          //Array of unknown animals

        AnimalWorld <Animal> uList = new AnimalWorld(u);
                                            //place the unknown into  the list
        //create a list of aquatic animals
        Aquatic whale = new Aquatic(90,150000,true);
                                                //a whale object is created
        Aquatic shark = new Aquatic(400,2150,true);
                                            // a shark object is created
        Aquatic q []={whale, shark};         //array of aquatic animal
        AnimalWorld<Aquatic> qList = new AnimalWorld(q);
                                        // place the aquatic animal into a list
        Land owl = new Land(3,1, (short) 0);
                                        // created a list of land animal
        Land l [] ={owl};             // an array of land objects is created
        AnimalWorld<Land> lList= new AnimalWorld(l);
                                            // place the animals into a list
        // create a list of pet animal
        Pet dog = new Pet(15,75,(short)2,"Prince");
                                            //   a pet dog object is created
        Pet cat =new Pet(15,75,(short)2,"kitti");
                                            //second pet object is created
        Pet p [] = {dog,cat};         //an array of pet object is created
        AnimalWorld<Pet> pList = new AnimalWorld(p);
                                            //Place it into a list
        Wild cheetah = new Wild(15,75,(short)2,80);
                                                                    //A cheetah object is created
        Wild deer = new Wild(10,50,(short)2,70);
                                                            //A deer object is created
        Wild [] w= {cheetah,deer};
        AnimalWorld<Wild> wList = new AnimalWorld(w);

        //Call the methods and see the outcomes
        //vitality (...)is with unlimited wildcard argument and
        //hence we can pass argument of any type
        vitality(uList);
        vitality(qList);
        vitality(lList);
        vitality(pList);
        vitality(wList);
        //showSea(...) is with lower bound wildcard argument with
        // class Aquatic and its super classes
        System.out.println("***Now we are running showSea method***");
        showSea(uList);
        showSea(qList);
        //showSea(lList);
        //showSea(pList);
        //showSea(wList);
        System.out.println("***Now we are running showLand method***");
        //showLand(uList);
        //showLand(qList);
        showLand(lList);
        showLand(pList);
        showLand(wList);
        System.out.println("***Now we are running showPet method***");
        //showPet(uList);
        //showPet(qList);
        //showPet(lList);
        showPet(pList);
        //showPet(wList);

    }
}