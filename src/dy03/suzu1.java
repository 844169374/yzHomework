package dy03;

public class suzu1 {
    //该方法的功能是把一个数组按照奇数、偶数分拣到两个数组中，然后交替输出
    public static void output(int num[]){
        int oddNum[];//奇数数组
        int evenNum[];//偶数数组

        int evenCount=0,oddCount=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }//循环结束已经统计出了num数组中偶数的个数为evenCount,奇数的个数为oddCount

        oddNum=new int[oddCount];
        evenNum=new int[evenCount];

        int p=0,q=0;
        for (int i = 0; i < num.length; i++){
            if(num[i]%2==0){
                evenNum[p]=num[i];
                p++;
            }else{
                oddNum[q]=num[i];
                q++;
            }
        }//此时已经将数组num按照奇数、偶数分拣到两个数组oddNum，evenNum中


        if(evenNum.length>oddNum.length){//如果偶数个数较多
            for(int i=0;i<=oddNum.length-1;i++){
                System.out.print(oddNum[i]+" "+evenNum[i]+" ");
            }//先按照奇数的个数交替输出
            for(int i=oddNum.length;i<=evenNum.length-1;i++){
                System.out.print(evenNum[i]+" ");
            }//输出剩下的偶数
        }else{
            for(int i=0;i<=evenNum.length-1;i++){
                System.out.print(oddNum[i]+" "+evenNum[i]+" ");
            }//先按照偶数的个数交替输出
            for(int i=evenNum.length;i<=oddNum.length-1;i++){
                System.out.print(oddNum[i]+" ");
            }//输出剩下的奇数
        }

    }

    public static void main(String[] args) {
		/*
		int n[]=new int[8];
		for (int i = 0; i < n.length; i++) {
			String s=JOptionPane.showInputDialog("请输入第"+(i+1)+"个整数：");
			n[i]=Integer.parseInt(s);
		}
		*/
        int n[]={1,2,3,5,8,4,6,10};//{1,3,5},{2,8,4,6,10}
        output(n);

    }
}

