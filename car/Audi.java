public class Audi implements Car {
    @Override
    public void go() {
        System.out.println("Audi go");
    }

    @Override
    public void open() {
        System.out.print(("Audi open"));
    }
}
