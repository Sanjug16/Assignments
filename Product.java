public class Product {

    public static void main(String[] args) {
           int[][] A = {
               {2, 3},
               {1, 2}
           };
           int[][] B = {
               {2, 4},
               {2, 1}
           };
           int[][] C = new int[2][2];
           for (int i = 0; i < 2; i++) {
               for (int j = 0; j < 2; j++) {
                   C[i][j] = 0;
                   for (int k = 0; k < 2; k++) {
                       C[i][j] += A[i][k] * B[k][j];
                   }
               }
           }
           System.out.println("Product matrix C is:");
           for (int i = 0; i < 2; i++) {
               for (int j = 0; j < 2; j++) {
                   System.out.print(C[i][j] + " ");
               }
               System.out.println();
           }
       }
   }
