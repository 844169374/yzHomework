
package dy03;

public class suzu2 {


    private  static  char[] generate() {

        char[] chs = new char[5];
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        boolean[] flages = new boolean[letters.length];
        int index = 0;
        for (int i = 0; i < chs.length; i++) {
            do {
                index = (int) (Math.random()*letters.length);
            }while(flages[index]);
            chs[i] = letters[index];
            flages[index] = true;
        }

        return chs;
    }
}
