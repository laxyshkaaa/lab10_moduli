import java.sql.SQLOutput;

abstract class Animal{
    public String food;
    public String location;
    public String name;

    Animal(String name, String food, String location){
        this.name = name;
        this.food = food;
        this.location = location;

    }


     public void MakeNoise() {}
     public void eat(){}
     public void sleep(){}


}
class Dog extends Animal {
    public String color;
    Dog(String name, String food, String location,  String color  ){
        super(name, food, location);
        this.color = color;

    }


    @Override
    public void MakeNoise() {
        System.out.println("Собачка гавкает");
    }

    @Override
    public void eat() {
        System.out.println("Собачка кушает чипсы лэйс");

    }
}
    class Cat extends Animal {
        public int age;
        Cat(String name, String food, String location,  int age  ) {
            super(name, food, location);
            this.age = age;
        }



        @Override
        public void MakeNoise() {
            System.out.println("Кошечка мяукает");
        }

        @Override
        public void eat() {
            System.out.println("Кошечка лакает молоко");

        }
    }
    class Horse extends Animal{
        public double weight;
        Horse(String name, String food, String location,  double weight  ){
            super(name, food, location);
            this.weight = weight;
        }
        @Override
        public void MakeNoise(){
            System.out.println("Лошадь кричит");
        }
        @Override
        public void eat() {
            System.out.println("Лошадь кушает сено");

        }
    }
    class Veterinar{
    public void Treatanimal(Animal an){
        System.out.println("Животное " + an.name + " находится "  + an.location + " и кушает " + an.food);
    }
    }




public class Main {
    public static void main(String[] args)
    {
        Cat c1 = new Cat("Валя", "мясо", "Дома", 12);
        Dog d1 = new Dog("Никита", "корм", "в приюте", "Белая");
        Horse h1 = new Horse("Иван", "сено", " в загоне", 332.2);
        c1.eat();
        d1.MakeNoise();
        h1.eat();
        Veterinar v1 = new Veterinar();
        v1.Treatanimal(h1);


    }
}