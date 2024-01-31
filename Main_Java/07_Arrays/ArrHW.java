public class ArrHW {
    public static void main(String args[]){
        //Swap 1st and last rows
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr[0].length; i++) {
            int temp = arr[0][i];
            arr[0][i] = arr[arr.length - 1][i];
            arr[arr.length - 1][i] = temp;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        //replace negative elements with 0
        int arr1[][]={{1,-9,3},{-8,5,-4},{7,-1,9}};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                if(arr1[i][j]<0){
                    arr1[i][j]=0;
                }
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("-------------------");
        //find max element in array and print
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println("-------------------");
        //sum of each row in an array
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            System.out.println("Sum of Row "+(i+1)+" = "+sum);
        }
        System.out.println("-------------------");
    }
}
