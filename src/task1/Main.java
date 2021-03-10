package task1;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("tiger", 5);
        Mammals mammal = new Mammals("bear", 3, 4, true);
        Birds bird = new Birds("eagle", 6, true, true, 2);
        Parrot parrot = new Parrot("ara", 4, true, true, 2, true);
        Flamingo flamingo = new Flamingo("Chilean", 1, true, true, 2, "red");
        Horse horse = new Horse("pony", 5, 4, false, "Shetland");
        Dog dog = new Dog("laika", 3, 4, true, false);

        Animal[] animalsArray = {animal, mammal, bird, parrot, flamingo, horse, dog};
        Mammals[] mammalsArray = {mammal, horse, dog};
        Birds[] birdsArray = {bird, parrot, flamingo};
        Parrot[] parrotsArray = {parrot};
        Flamingo[] flamingosArray = {flamingo};
        Horse[] horsesArray = {horse};
        Dog[] dogsArray = {dog};

        //System.out.println(horsesArray);

    }
}
