// Car.java
public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// SportsCar.java
public class SportsCar extends Car {
    private boolean turboCharged;

    public SportsCar(String model, int year, boolean turboCharged) {
        super(model, year);
        this.turboCharged = turboCharged;
    }

    public void displayTurboInfo() {
        System.out.println("Turbocharged: " + turboCharged);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        displayTurboInfo();
    }
}

// Garage.java
public class Garage {
    public void repairVehicle(Car vehicle) {
        System.out.println("Repairing vehicle: " + vehicle.getModel());
        // Additional repair logic
    }
}
