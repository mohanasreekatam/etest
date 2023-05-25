package threading;

public class array {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0 ;
        for (int i =3; i < numbers.length ; i+=3) {
            sum += numbers[i];
        }
        System.out.println(sum);

    }
}
