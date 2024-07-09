import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrays {
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

        //for each loops
        for (String s:values){ // String is the array data type , "s" is the variable and the "values" is the array reference
            System.out.println(s);
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Array lists
        //Arraylist is in the util package.
        //Below array stores String type of values
        ArrayList<String> arraylist = new ArrayList<String>();
        //need to create arraylist object
        arraylist.add("Navod");
        arraylist.add("Malith");
        System.out.println("=======================================");
        System.out.println(arraylist.get(0)); //can replase with getFirst() method

        System.out.println("=======================================");
        //Arraylists with for loops and other methods
        for (int i=0; i< arraylist.size();i++){
            System.out.println(arraylist.get(i));
        }
        System.out.println("=======================================");
        //using foreach loop
        for (String m:arraylist){
            System.out.println(m);
        }

        //item is persent in the ayyalist (need to checkt the value is in the arraylist or not (using "contains" method)

        System.out.println(arraylist.contains("Navod"));

        //Convert array to arraylist
        String[]name = {"Navod","Malith","Amarasinghe"};
        // converting to the arraylist
        //List is in the top of the hierarchy
        List<String> namelist = Arrays.asList(name);
        System.out.println(namelist.getFirst());




    }
}
