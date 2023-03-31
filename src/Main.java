public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        System.out.println("số lẻ");
        oddThread.start();
        oddThread.join();
        System.out.println("số chẵn");
        evenThread.start();
        evenThread.join();
    }
}
