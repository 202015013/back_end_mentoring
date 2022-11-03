public class Benz implements Car {
    @Override
    public void go() {
        System.out.println("Benz go");
    }

    @Override
    public void open() {
        System.out.print(("Benz open"));
    }
}
