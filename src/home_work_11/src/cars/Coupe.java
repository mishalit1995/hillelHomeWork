package cars;

public class Coupe implements Car {
    private int id;
    private  int prise;
    private int speed;
    private int fuelConsumption;
    private int capacity;
    private String color;

    public Coupe(int id, int prise, int speed, int fuelConsumption, int capacity, String color) {
        this.id = id;
        this.prise = prise;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.capacity = capacity;
        this.color = color;
    }

    public Coupe(String[] carProperties) {
        this(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2]), Integer.parseInt(carProperties[3]),
                Integer.parseInt(carProperties[4]), Integer.parseInt(carProperties[5]), carProperties[6]);
    }

    public String toOutput() {
       return  "Coupe," + getId() + "," + getPrise() + "," + getSpeed() + "," + getFuelConsumption() + "," + capacity +
                        "," + color;
    }
    @Override
    public String toString() {
        return "Coupe #" + getId() + ", prise = " + getPrise() + "$" + ", color = " + color + ", speed = " + getSpeed()
                + " m/h" + ", capacity = " + capacity + " people" + ", fuel consumption = " + getFuelConsumption();

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getPrise() {
        return prise;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getFuelConsumption() {
        return fuelConsumption;
    }
}