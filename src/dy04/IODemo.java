import java.io.*;

1
        2
        3
        4
        5
        6 public class IODemo {
 7
         8     public static void main(String[] args) throws IOException {
        9
        10         //从文件out.txt中读取文件
        11         FileInputStream inp = new FileInputStream("E:\\test\\out.txt");
        12         byte[] b = new byte[1024];
        13         int length = inp.read(b);
        14         String s = new String(b,0,length);
        15         System.out.println(s);
        16         inp.close();
        17
        18         //把读出的字符串写入到in.txt
        19         FileOutputStream out = new FileOutputStream("E:\\test\\in.txt");
        20         byte[] b2 = s.getBytes();
        21         out.write(b2);
        22         System.out.println("写入成功");
        23         out.close();
        24     }


