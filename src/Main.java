import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int a[] = {0,1,2,3,4,0,0,1,1,1,1};
        int i01 = 0;
        int i0 = 0;


        for (int i = 0; i < a.length; i++) {
            switch (a[i]){
                case 0:
                    i0++;
                case 1:
                    i01++;
                    break;
            }
        }
        System.out.println(i01 + " " + i0);

    }


    //int[][] array = new int[5][3];
    //int[][] array2 = new int[][]{{1,2,3,4,5},{6,7,8},{1}};
    //for (int i = 0; i < array2.length; i++){
    //    for (int j = 0; j < array2[i].length; j++){
    //        System.out.println(array2[i][j]);
    //    }
    //}
    //System.out.println(Arrays.toString(array2[0]));

        /*
        switch (n){
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Default case");
                break;
        }
        int o = -8;
        while (true){
            System.out.println(o);
            if(o == 10){
                break;
            } else {
                o++;
            }
        }
        do {
            n++;
        } while(n < 10);
        for (int i = 0; i < 100; i+=3){
            System.out.println(i);
        }
        */
        //long fst_time = System.currentTimeMillis();
       //int size = 10;
       //int[] array = new int[size];
       //Arrays.fill(array, 12);
        //long snd_time = System.currentTimeMillis();
        //System.out.println("" + (snd_time - fst_time));
        //int[] sndarray = new int[]{11, 12, 13, 14, 15, 16};
        //int b = array.length;
        //for (int k : array) {
        //    System.out.println(k);
        //}

        //System.out.println(Arrays.toString(array));

    }
