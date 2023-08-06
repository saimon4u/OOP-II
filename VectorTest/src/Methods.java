import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Methods {
    private static final String suits[] = {"Hearts","Diamonds","Clubs","Spades"};
    public void printElements(){
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: \n%s\n",list);
        Collections.sort(list);
        System.out.printf("Sorted array elements: \n%s\n",list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.printf("Reversely sorted array elements: \n%s\n",list);
        System.out.printf("Minimum element: %s\n",Collections.min(list));
        System.out.printf("Maximum element: %s\n",Collections.max((list)));
        System.out.printf("Frequency of Hearts: %d\n",Collections.frequency(list,"Hearts"));
        String string[] = new String[20];
        string[0] = "aaaa";
        List<String> list2 = Arrays.asList(string);
        Collections.fill(list2,"abc");
        System.out.println("List 2: " + list2);
        if(Collections.disjoint(list2,list)) System.out.printf("Disjoint\n");
        else System.out.println("Not disjoint");
//        Collections.addAll(list,string);
//        System.out.println("After addAll: " + list);
        Collections.shuffle(list);
        System.out.println("List 1 after shuffle: " + list);
        Collections.reverse(list);
        System.out.println("List 1 after reverse: " + list);
    }
}
