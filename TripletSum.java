public class TripletSum {
   //main method
   public static void main(String[] args){

      //Declare and initialize the array elements
      int arr[] = {11, 4, 5, 6, 21, 29};

      //a particular number whose triplet meeds to be find out
      int sum = 37;

      // Fix the first element as a[i]
      for (int i = 0; i < arr.length - 2; i++) {

         // Fix the second element as a[j]
         for (int j = i + 1; j < arr.length - 1; j++) {
            // Now look for the third number in an array
            for (int k = j + 1; k < arr.length; k++) {             
               if (arr[i] + arr[j] + arr[k] == sum) {

                  //printing the triplet
                  System.out.print("The triplet is " + arr[i] + ", " + arr[j] + ", " + arr[k] + ".");
               }
            }
         }
      }
   }
}
