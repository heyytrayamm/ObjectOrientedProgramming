public class MyRunnable implements Runnable {

    public final String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 1;i <= 5 ; i++) {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            System.out.println(name);
        }
    }
}
