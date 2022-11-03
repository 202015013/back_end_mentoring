import java.util.ArrayList;


public class Winner {

    private ArrayList<Car> cars;
    private ArrayList<String> winners;
/*
	private int maxSpeed;*/

    private void addCars(Car car) {
        cars.add(car);
    }

    private void addWinner(Car car) {
        winners.add(car.getOwner(car));
    }

    public static void main(String[] args) {
        Winner winner = new Winner();
        Car car = new Car();

        winner.addCars(car);
        winner.addWinner(car);
        car.getMaxSpeed(car);

    }
}