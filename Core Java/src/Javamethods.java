import com.sun.source.tree.BreakTree;

public class Javamethods {
    public static void main(String[] args) {
        Javamethods jm = new Javamethods();
        jm.getdata();
        System.out.println(getData());

        UserData userData = new UserData();
        System.out.println(userData.getdatafromotherclass());

        //after using static keyword
        getData();

    }
    public void getdata(){
        System.out.println("get data");
    }

    public static String getData(){
        System.out.println("Using Static keyword");
        return "Navod Amarasinghe";
    }


}
