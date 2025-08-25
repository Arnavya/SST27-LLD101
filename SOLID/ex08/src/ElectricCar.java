public class ElectricCar implements EnginePowered, ElectricPowered {
    @Override
    public void startEngine() {
        System.out.println("Electric car engine started");
    }

    @Override
    public void recharge(int kWh) {
        System.out.println("Recharging " + kWh + " kWh");
    }
}
