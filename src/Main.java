

public class Main {
    public static void main(String[] args) {
        System.out.println("Problem 1.1: ");
        convertArraytoNumber convert = new convertArraytoNumber();
        int[] ar = {2, 0, 1, 8};
        int number = convert.convert(ar);
        System.out.println("Converted integer: " + number);

        System.out.println("Problem 1.2: ");
        median m = new median();
        System.out.println("Median "+ m);

    }
}
