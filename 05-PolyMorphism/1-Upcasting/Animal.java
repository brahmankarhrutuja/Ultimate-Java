class Animal {
    void eat(){
        System.out.println("Animal is sleeping.");
    }
    void sleep() {
        System.out.println("Animal is Sleeping.");
    }
    void foodHabit() {
        System.out.println("Animal Food habit is good.");
    }
}
class Monkey extends Animal {
    void eat() {
        System.out.println("Monkey is eating Banana.");
    }
    void sleep() {
        System.out.println("Monkey is sleeping on tree.");
    }
    void foodHabit() {
        System.out.println("Steal and eat.");
    }
} 

class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger is eating Flesh.");
    }
    void sleep() {
        System.out.println("Tiger is sleeping on grass.");
    }
    void foodHabit() {
        System.out.println("Hunt and eat.");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Deer is eating grass.");
    }
    void sleep() {
        System.out.println("Deer is sleeping on ground.");
    }
    void foodHabit() {
        System.out.println("Grazes and eat.");
    }
}

class Main {
    public static void main(String[] args) {
        Monkey m = new Monkey(); 
        Tiger t = new Tiger();
        Deer d = new Deer();
        animalBehaviors(m);
        animalBehaviors(t);
        animalBehaviors(d);
    }
        static void animalBehaviors(Animal ref) {
        ref.eat();
        ref.sleep();
        ref.foodHabit();
       

    }
}