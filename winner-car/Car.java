class Car {

    private String owner;

    private int speed;

    private boolean isMaxSpeed(int maxSpeed) {
        return this.speed == maxSpeed;
    }

    String getOwner(Car car) {
        return this.owner;
    }

    int getMaxSpeed(Car car) {
        return this.speed;
    }
}