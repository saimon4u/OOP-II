public class Main {
    public static void main(String[] args) {
        System.out.println("Creating threads:");
        Thread thread1 = new Thread(new PrintTask("task1"));
        Thread thread2 = new Thread(new PrintTask("task2"));
        Thread thread3 = new Thread(new PrintTask("task3"));
        Thread thread4 = new Thread(new PrintTask("task4"));
        System.out.println("Threads created, starting tasks: ");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        System.out.println("Task started,main ends\n");
    }
}