public class Boat extends Vehicle {
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
     public String doStuff() {
        return "I am {brand} and I go glug glug!";
    }
}
