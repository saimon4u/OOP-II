import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Arraylist {
    private static final String[] colors = {"MAGENTA","RED","WHITE","BLUE","CYAN"};
    private static final String[] removeColors = {"RED","WHITE","BLUE"};
    public Arraylist (){
        List<String> list = new ArrayList<String>();
        List<String> removeList = new ArrayList<String>();
        for(String color: colors){
            list.add(color);
        }
        for(String color : removeColors){
            removeList.add(color);
        }
        System.out.println("ArrayList: ");
        for(int i=0; i<list.size(); i++){
            System.out.printf("%s ",list.get(i));
        }
        removeColors(list,removeList);
        System.out.println("\n\nArrayList after calling remove: ");
        for(String color: list){
            System.out.printf("%s ",color);
        }
    }
    private void removeColors(Collection<String>collection1,Collection<String>collection2){
        Iterator<String>iterator = collection1.iterator();
        while(iterator.hasNext())if(collection2.contains(iterator.next()))iterator.remove();
    }
}
