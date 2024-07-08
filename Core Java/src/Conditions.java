public class Conditions {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9,0};
        //print 2,4,6,8,0

        //if else block
        for (int i =0; i< array.length; i++){
            if (array [i] %2 == 0){ // use to get the "%" reminder and use "==" to equaly compare
                System.out.println(array[i]);
                //break key word use to exit the loop
                break;
            }else {
                System.out.println("It is not a odd value" + array[i]);
            }
        }

        // execise
        float [] numbers = new float[5];
        numbers[0] = 1.12F;
        numbers[1] = 1.13F;
        numbers[2] = 1.14F;
        numbers[3] = 1.15F;
        numbers[4] = 1.16F;

        System.out.println( "The fist index is ="+ numbers [0]);
        System.out.println( "The last index is ="+ numbers [numbers.length - 1]);

        // reverse the order of the array
        for (int i = numbers.length - 1; i >0; i--){
            System.out.println("Array index is "+ i + " and the value is "+ numbers[i]);
        }

        //calculate the total number of elements = it is can get by the length
            System.out.println("Total number of arrays ="+ numbers.length);


    }
}
