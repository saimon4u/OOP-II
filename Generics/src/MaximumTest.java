public class MaximumTest {
    public static <T extends Comparable <T> > T maximum (T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0) max = y;
        if(z.compareTo(max) > 0) max = z;
        return max;
    }

//    public static Comparable maximum(Comparable x, Comparable y ,Comparable z){
//        Comparable max = x;
//        if(y.compareTo(max) > 0) max = y;
//        if(z.compareTo(max) > 0) max = z;
//        return max;
//    }
    public static void main(String[] args) {
        System.out.printf("Maximum of %d %d %d is %d\n\n",3,4,5,maximum(3,4,5));
        System.out.printf("Maximum of %.1f %.1f %.1f is %.1f\n\n",3.3,4.2,5.5,maximum(3.3,4.2,5.5));
        System.out.printf("Maximum of %s %s %s is %s\n\n","my","name","saimon",maximum("my","name","saimon"));
    }
}
