import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import java.util.Arrays;

public class TestTasks {


    //set max avalible heap -Xms9G -Xmx9G
    private static int avalibleT = Integer.MAX_VALUE - 8;


    @Test()
    public void testTask4() {
        int[] arr = new int[0];

        while(true) {
            if(arr.length == avalibleT)
                break;
            try {
                arr  = new int[avalibleT=avalibleT-8];
            } catch (OutOfMemoryError e) {
                System.out.println(e.getMessage()+"\n Increase maximum heap size... -Xms9G -Xmx9G");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        System.out.println("Array length:" + arr.length);
        int n = arr.length -  avalibleT / 2;
        System.out.println("N :" + n);
        final LocalTime start =LocalTime.now();
//       TaskFour.moveArray(arr,n;
        TaskFour.rotate(arr, n);
        final LocalTime end = LocalTime.now();
        System.out.println(start);
        System.out.println(end);
        Assertions.assertTrue(true);
    }
}
