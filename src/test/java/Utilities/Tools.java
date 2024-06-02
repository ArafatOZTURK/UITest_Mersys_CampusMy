package Utilities;

public class Tools {

    public static void Wait(int sn){

        try {
            Thread.sleep(sn*2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }




}
