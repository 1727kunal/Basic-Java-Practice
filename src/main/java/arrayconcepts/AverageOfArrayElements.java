package arrayconcepts;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        double [] arr1 = new double[]{3.5, 4.5, 5.5, 6.5, 7, 8, 9};
        double sum=0;
        double avg;
        for(int i=0; i<arr1.length; i++){
            sum = sum +arr1[i];
        }
        avg = sum /arr1.length;
        System.out.println("Average of array values is = "+avg);
    }
}
