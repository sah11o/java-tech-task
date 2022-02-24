//fields speed, regularPrice, color
class Car {
    private int speed;
    private int regularPrice;
    private String color;

    public Car(int speed, int regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public int getSalePrice() {
        return regularPrice;
    }
}

// create a sub class Truck extens Car with the following attributes: weight
public class Truck extends Car {
    private int weight;

    public Truck(int speed, int regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getSalePrice() {
        int regularPrice = super.getSalePrice();
        if (weight > 2300) {
            regularPrice -= regularPrice * .10;
            return regularPrice;
        } else {
            regularPrice -= regularPrice * .20;
        }
        return regularPrice;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        Truck truck = new Truck(100, 10000, "red", 2000);
        System.out.println(truck.getSalePrice());
        truck.setWeight(2400);
        System.out.println(truck.getSalePrice());
    }
}
