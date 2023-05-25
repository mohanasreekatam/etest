package threading;
public class main3 {
    public static void main(String[] args) {

        for (int i = 0; i <= 3; i++)
        {
            MultiThreading m1 ;
            m1 = new MultiThreading(i);
            Thread myThread = new Thread(m1);
            myThread.start();
            try {
                myThread.join();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        throw new RuntimeException();
    }
}