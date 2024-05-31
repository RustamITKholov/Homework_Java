package ООП.HOMEWORKS.Homework_1;

public class HotDrinks extends BottleOfWater {

    private double temperature;

    public HotDrinks(String name, int cost, double volume, double temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemp(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", temperature = " + temperature;
    }
}
