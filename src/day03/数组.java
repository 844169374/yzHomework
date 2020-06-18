package day03;

public class 数组 {


    private  static  char[] generate() {

        char[] chs = new char[5];
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int index = 0;
        for (int i = 0; i < chs.length; i++) {

            index = (int) (Math.random() * letters.length);
            chs[i] = letters[index];
        }
        return chs;
    }





}
