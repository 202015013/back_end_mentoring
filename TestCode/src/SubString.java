public class SubString {
    public static void main(String[] args) {
        SubString my = new SubString();
        String num = "(1,2)";
        System.out.println(my.sub(num));
    }

    public String sub(String num) {
        return num.substring(1,4);
    }
}