class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
public class MultithreadingEvenOdd {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        even.start();
        odd.start();
    }
}
