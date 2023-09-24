import java.util.ArrayList;

public class WildcardTest {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5};
        ArrayList <Integer> integersList = new ArrayList<Integer>();
        for(Integer element : integers){
            integersList.add(element);
        }
        System.out.printf("integerList contains: %s\n",integersList);
        System.out.printf("Total of the element in integerList: %.0f\n\n",sum(integersList));


        Double[] doubles = {1.1,3.3,5.5};
        ArrayList <Double> doubleList = new ArrayList<Double>();
        for(Double element : doubles){
            doubleList.add(element);
        }
        System.out.printf("doubleList contains: %s\n",doubleList);
        System.out.printf("Total of the element in doubleList: %.1f\n\n",sum(doubleList));

        Number[] numbers = {1,2.4,3.4,1};
        ArrayList <Number> numbersList = new ArrayList<Number>();
        for(Number element : numbers){
            numbersList.add(element);
        }
        System.out.printf("numberList contains: %s\n",numbersList);
        System.out.printf("Total of the element in numberList: %.1f\n\n",sum(numbersList));
    }
    public static double sum(ArrayList <? extends Number> list){
        double total = 0;
        for (Number element : list){
            total += element.doubleValue();
        }
        return total;
    }
}
