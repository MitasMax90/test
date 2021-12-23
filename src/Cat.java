public class Cat {
    //Поля класса
     double weight;
     String name;
     int age;
     String color;
    String color2;
    String color3;
    String color4;
    String color5;
    String color6;
    String color7;


    public Cat() {
        this(3000,"BArsik",3,"Gray");
    }

    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }




    //Ниже методы
    public void meow() {
        System.out.println("Meow");
    }

    public void pee() {
        weight -= 20;
    }

    public void eat() {
        this.weight +=50;
        if (50/weight > .01) {
            pee();
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
