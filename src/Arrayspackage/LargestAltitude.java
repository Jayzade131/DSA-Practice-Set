public class LargestAltitude {


    public static int largestAltitude(int[] gain) {
        int alti=0;
        int highAlti=0;

        for (int i = 0; i < gain.length; i++) {
            alti =+gain[i];
        }
        if(alti>highAlti)
        {
            highAlti = alti;
        }
        return highAlti;
    }

}
