class Intro{
    public static void main(String args[]){
        //Arrays
        // int arr[]={1,2,3,4,5};
        // System.out.println(arr[3]);
        // int arr[] = new int[10]; //Declaring Array default -> 0
        // System.out.println(arr[5]);
        // Boolean arr1[] = new Boolean[10]; 
        // boolean arr2[] = new boolean[10]; 
        // System.out.println(arr1[0]);// null
        // System.out.println(arr2[0]);// false
        
        // String arr[]=new String[3];
        // arr[0]="name1";
        // System.out.println(arr[0]);
        
        // for(int i=0;i<arr.length;i++){
            
        //      System.out.println(arr[5]);
            //  for(int i : arr){  //for - each
            //      System.out.println(i);
            //  }
        // int arr[][]=new int[3][3];
        int arr1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Print the content of the 2D array
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
        System.out.println(); // Move to the next line after printing each row
        }


    }
}


/*Fast access -> It is very fat to access in any 
ele in an array(by index),accessing the first ele 
will take same time as lat ele*/

//Fixed size -> once created, we can't change size




