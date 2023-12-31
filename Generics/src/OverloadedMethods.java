public class OverloadedMethods {
//    public static void printArray(Integer[] inputArray){
//        for(Integer element : inputArray){
//            System.out.printf("%s ",element);
//        }
//        System.out.println();;
//    }
//
//    public static void printArray(Double[] inputArray){
//        for(Double element : inputArray){
//            System.out.printf("%s ",element);
//        }
//        System.out.println();;
//    }
//
//    public static void printArray(Character[] inputArray){
//        for(Character element : inputArray){
//            System.out.printf("%s ",element);
//        }
//        System.out.println();;
//    }
    public static <E> void printArray(E[] inputArray){
        for(E element : inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] characterArray = {'a','b','c','d','e'};
        System.out.println("Array of Integer contains: ");
        printArray(integerArray);
        System.out.println("Array of Double contains: ");
        printArray(doubleArray);
        System.out.println("Array of Character contains: ");
        printArray(characterArray);
    }
}
