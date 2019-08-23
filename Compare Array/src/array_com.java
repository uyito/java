public class array_com {

    private static boolean compare(int arr[], int arr2[]) {
        for(int j=0; j< arr.length; j++){

//            for(int i = 0; arr[j] == arr2[i]; i++){
//                return true;
//            }
            int num = arr2.length - 1;
            int i = 0;
            while(i< arr2.length){
               if(arr[j] == arr2[i]){

                   break;
               } else if(arr[j] != arr2[num]){
                   return false;
               }
               else
               {
                   i++;
               }

            }


        }
        return true;

    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 2};
        int[] arr2 = new int[]{1, 1, 2};

        boolean result = compare(arr, arr2);

        System.out.println(result);

    }
}
