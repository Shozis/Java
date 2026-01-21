public class lab6 {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 4, 10 },
                { 5, 15, 3 },
                { 8, -6, 0 }
        };

        int perem = 0;
        int i = arr.length - 1;
        int j = 0;

        int dot2 = 0;

        for (int t = 0; t < arr.length; t++) {
            if (arr[i][j] > perem) {
                perem = arr[i][j];

                dot2 = j;
            } else {
                i--;
                j++;
            }
        }
        for (i = 0; i < arr.length; i++ )
        System.out.print(arr[i][dot2] + " ");
    }
}
