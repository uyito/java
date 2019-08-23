import java.util.Scanner;

class GetInput{
    public double get_double(){
        Scanner num = new Scanner(System.in);
        System.out.println("enter vale to search: ");
        double value = num.nextDouble();
        return value;

    }
        }



public class MyClass extends GetInput{
    private  static double Search(double num, double[] arr){
        int x = 0;
        for(int i=0 ; i < arr.length; i++){
            if(num == arr[i]){
            x += 1;
            }
        }
        System.out.println("this is the number of time you serach number appaered: " +x);
        return x;
    }



    private static double Max_array(double[] array) {
        double max = array[0];
        for(int i=1; i < array.length; i++){
            if (max < array [i]){
                max = array[i];
            }
        }
        System.out.println(max);
        return max;

    }
    public static void main(String[] args) {

        double[] max_arr = new double []{3.0, 5.0, 10.0, 11.5, 16, 3, 13};

        MyClass num = new MyClass();
        double get_ent = num.get_double();
        Search(get_ent, max_arr);


        Max_array(max_arr);
    }
}
