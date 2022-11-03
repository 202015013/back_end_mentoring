public class Enum {
    enum Fruit {
        APPLE("APPLE"), BANANA("BANANA"), CHERRY("CHERRY");

        final private String name;
        public String getName(){
            return name;
        }
        private Fruit(String name){
            this.name = name;
        }
    }
    enum Company {
        APPLE("APPLE"), SAMSUNG("SAMSUNG"), GOOGLE("GOOGLE");

        final private String name;
        public String getName(){
            return name;
        }
        private Company(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        if (Fruit.APPLE.equals(Company.APPLE)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}

