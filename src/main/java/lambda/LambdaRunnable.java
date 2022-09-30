package lambda;

public class LambdaRunnable {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Jeito antigo");
            }
        }). run();

        new Thread(() -> System.out.println("Jeito novo")).run();
    }
}
