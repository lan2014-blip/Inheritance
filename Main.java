public class Main{
    public static void main(String[] args){
        Animal a=new Animal();
        Dog b=new Dog();
        Lion c=new Lion();
        Babylion d=new Babylion();

        a.eat();
        b.eat(); //dog uses eat from Animal class
        c.eat();//lion uses eat from the Animal class
        c.roar();//from the Lion class
        d.eat();//babylion uses eat from animal
        d.play();//from Babylion class

    }
}


class Animal{ //parent class
    void eat(){
        System.out.println("This animal is eating!");
    }
}
//single inheritance => From parent to child directly
class Dog extends Animal{//child class
    void bite(){
        System.out.println("This dog can bite! From Dog class");
    }
}
//hierachical inheritance => several child classes from the same Parent class
class Lion extends Animal{
    void roar(){
        System.out.println("Roar!! From Lion class");
    }
}

//Multilevel inheritance => a class inherits from parent and another class inherits from child
class Babylion extends Lion{
    void play(){
        System.out.println("The BabyLion is playing!");
    }
}