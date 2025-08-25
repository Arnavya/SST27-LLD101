// Demo08.java
public class Demo08 {
    public static void main(String[] args) {
        PedalPowered bike = new Bicycle();
        bike.pedal(5);

        ElectricCar car = new ElectricCar();
        car.startEngine();
        car.recharge(50);
    }
}
