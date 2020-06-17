package dy03;

public class HomeWork {

    public static void main(String[] args) {
         /*//根据给定的方法来输出一个等腰三角
            int max = 5;
            //控制行数
            for(int i = 1; i<=5 ; i++) {
                //控制空格
                for (int j = 1; j <= max - i; j++)
                    System.out.print(" ");
                //控制星数
                for (int k = 1; k <= i * 2 - 1; k++)
                    System.out.print("*");
                System.out.println();
            }
        }
*/

//给定方法输出一个1到100的质数的和//
        int sum = 0;

        int k = 2;

// 找出1-100的质数之和
        for (int i = 2; i <= 100; i++) { // i值为2，质数为除去1和自身整除的数 j初始值为2去除偶数

            for (k = 2; k < i; k++) { //内层循环遍历查询i的整除数

                if (i % k == 0) { //判断当前i是否可以整除k值
                    break; //整除则跳出循环
                }

            }

//如果当前内循环没有正常结束k与i对比不成立
            if (k >= (i - 1)) { //计算当前的i值是否等于i-1的值 ，相等则说明为质数
                sum += i; // 累加质数
                System.out.println(i); // 输出质数
            }

        }

        System.out.println(sum); // 输出质数之和

    }
}