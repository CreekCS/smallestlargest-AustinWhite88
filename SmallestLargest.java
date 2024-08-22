//put your name here
public class SmallestLargest{
    public static void main(String[] args){
        int array[] = new int[10];
        for(int i = array.length - 1; i>= 0; i--){
            array[i] = (int)(Math.random()*100 + 1);
        }
        int small = smallestValue(array);
        int large = largestValue(array);
        System.out.println("your smallest value in the array is: " + small );
        System.out.println("your largest value in the array is: " + large );

    }
    public static int smallestValue(int[] s){
        int smallest = 100;
        for(int i = 0; i < 10; i++){
            if(s[i] < smallest){
                smallest = s[i];
            }
        }
        return smallest;
    }
    public static int largestValue(int[] l){
        int largest = 0;
        for(int i = 0; i < 10; i++){
            if(l[i] > largest ){
                largest = l[i];
            }
        }
        return largest;
    }
}