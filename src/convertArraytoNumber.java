public class convertArraytoNumber {
    public int convert(int[] ar) {
        int number = 0;
        for (int digit : ar) {
            number = number * 10 + digit;
        }
        return number;
    }
}