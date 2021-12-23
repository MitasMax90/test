public class Human {
    String name;
    int age;
    int weight;
    String address;
    String work;
    String shop;
    String favoriteFood;
    String favoriteFilm;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 60;
        this.age = 19;
    }

    public Human(String name, String address) {
        this.name = name;
        this.address = address;
        this.weight = 60;
    }

    public Human(String name, int age, int weight) {
        this(name, age);
        this.weight = weight;

    }

    public Human(String name, int age, String work) {
        this(name, age);
        this.weight = 60;
        this.work = work;
    }

    public Human(int age, int weight, String address, String work) {
        this.name = "Johnny";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }
}
