public class Person {
    Car car;

    void choiceCar(Car car) {
        this.car = car;

        go();
        open();
    }

    private void go() {
        car.go();
    }

    private void open() {
        car.open();
    }
}
