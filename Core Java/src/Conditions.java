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
    }
}
