public class Hangar {

    public static void main(String[] args) {
        Car car = new Car("Toyota", 5000);
        Boat boat = new Boat("Beneteau", 300);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());

    }
}
