import java.util.Arrays;
import java.util.LinkedList;

public class Toarray {
    public Toarray(){
        String colors[] = {"black","blue","yellow"};
        LinkedList<String> links = new LinkedList<String>(Arrays.asList(colors));
        String check[] = new String[10];
        for(int i=0; i<10; i++){
            check[i] = "a";
        }
        /*
        * new String[0] = a new array with size 3 (index = 2)
        *
        * 0 = starting index of source
        *
        * check is the destination where all the copied data will be store
        *
        * 0 is the starting index of destination
        *
        * links.size() is the amount of data that will going to be copied
        *
        * */
        System.arraycopy(links.toArray(new String[0]), 0, check, 0, links.size());
        System.out.println("Colors: ");
        for(String color: check){
            System.out.println(color);
        }
    }
}
