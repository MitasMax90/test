public class Main {
    public static void main(String[] args) {
        Plane plane1 = new Plane();
        plane1.flyStraight(50);
        plane1.flyUp(80,90);
        plane1.turnRight();
        plane1.flyStraight(30);
        plane1.dropBombs();
        plane1.flyStraight(40);
        plane1.flyDown(100,10);
        plane1.fillFuel();
        plane1.flyDown(100,10);
        plane1.fillFuel();
        plane1.fillFuel();
    }
}

