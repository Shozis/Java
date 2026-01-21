public class lab5 {
        public static void main(String[] args) {

            double arr[] = {14, 6, 3, 0, 7, 12, -3, 1, 5, 2};

                        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] % 3 == 0 ? arr[i] + " " : "");
    }}
}



// import java.util.ArrayDeque;
// import java.util.Deque;

// public class lab5 {
//         public static void main(String[] args) {

//             double arr[] = {14, 6, 3, 0, 7, 12, -3, 1, 5, 2};
//             Deque<Integer> k = new ArrayDeque<>();

//             for (int i = 0; i < arr.length; i++){
//                 if (arr[i] % 3 == 0){
//                     k.add((int) arr[i]);
//                 } 
//             }

//             System.out.print(k);
//     }
// }