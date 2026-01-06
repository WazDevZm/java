class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}

// this is the main class where the execution for this program starts

class AnimalSound{
    public static void main (String[] args){
        Animal myAnimal = new Animal(); // Animal object
        Animal myDog = new Dog(); // Dog object as Animal

        myAnimal.sound(); // calls the method in Animal class
        myDog.sound(); // calls the overridden method in Dog class
    }
}

// the java JDK in the 