public class JavaCoreWithStrings {
    public static void main(String[] args) {

        //There are two ways to create String objects
        String stringvalue = "Navod Malith Amarasinghe";
        //String Stringtwo = "Navod Amarasinghe";

        //String literal
        System.out.println(stringvalue);
       // System.out.println(Stringtwo);

        //String Object
        String s1 = new String("Welcome");
        String s2 = new String("Welcome");

        // breaking strings using spit method - split it to when there is a space
        //after split it there are three values so to store these values using array

        String [] namesplitting = stringvalue.split(" ");
        for (String s: namesplitting){
            System.out.println(s);
        }

        //using trim mwthod to wipeout the spaces
        String [] wipeoutspaces = stringvalue.split("Malith");
        for (String s: wipeoutspaces){
            System.out.println(s);
            System.out.println("After using trim method");
            System.out.println(s.trim());
        }

        // print all the characters one by one and it prints using CharacterAt method identify the index
        for (int i = 0; i < stringvalue.length(); i++) {

            System.out.println(stringvalue.charAt(i));
        }
        System.out.println("=======================================================");

        // Print the string into reverse order
        for (int i = stringvalue.length()-1; i>=0; i--) {

            System.out.println(stringvalue.charAt(i));
        }


    }
}
