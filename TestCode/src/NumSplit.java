public class NumSplit {
    public static void main(String[] args) {
        NumSplit numSplit = new NumSplit();
        String num = "1,2,3,4";
        numSplit.splitString(num);
    }

    void splitString(String s) {
        String sptNum[] = s.split(",");
        for (String num : sptNum)
            System.out.println(num);
    }
}
