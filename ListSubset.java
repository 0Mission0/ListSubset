public class ListSubset {

    static int num = 6;
    static int size = 3;
    static int sum = 0;

    public static void main(String[] args) {

        boolean[] flagArray = new boolean[num];
        solve(0, size, flagArray);
        System.out.println("\nsum = " + sum);
    }

    public static void solve(int n, int size, boolean[] flagArray) {
        if( size == 0 ) {
            sum++;
            checkArray(flagArray);
            return;
        }
        int length = flagArray.length;
        for(int counter1 = n; counter1 < length - size + 1; counter1++) {
            flagArray[counter1] = true;
            solve(counter1 + 1, size - 1, flagArray);
            flagArray[counter1] = false;
        }
    }

    public static void checkArray(boolean[] flagArray) {
        for(int counter = 0; counter < flagArray.length; counter++) {
            if( flagArray[counter] == true ) {
                System.out.print((counter + 1) + " ");
            }
        }
        System.out.println();
    }

}
