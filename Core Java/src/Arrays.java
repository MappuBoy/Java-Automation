public class Arrays {
    public static void main(String[] args) {

        //Arrays can create two different ways

        // 1st way
        int[] array = new int[5]; //declaring the value
        array[0] = 1; //values assigning from the "0" index //initialize the array
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        //location of the array
        System.out.println("Location of the array is : " + array);

       //2nd way
        int[] arraytwo = {1,2,3,4,5,6,12,13,14,12,1,13};

        System.out.println("Array index of the zero " + array[0]);


        //////////////////////////////////////////////////////////////////////////////////////////////////////
        // Numarical Arrays
        // Array with loops (using for loop)

        for (int i = 0; i< array.length; i++){ // array .length use to get the length of the array
            System.out.println(" Array index of the "+ i + " value  is " + array[i]) ;
        }

        //print values of the array two
        for (int j =0; j< arraytwo.length; j++){
            System.out.println(" Array index of the "+ j + " value  is " + arraytwo[j]) ;
        }

        //String arrays
        String [] values = {"Navod","Malith", "Amarasinghe"};
        for (int j =0; j< values.length; j++){
            System.out.println(" Array index of the "+ j + " value  is " + values[j]) ;
        }



    }
}
