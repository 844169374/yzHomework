package com.io.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

// 文件读写操作：把文件a.txt中的内容复制到文件b.txt中
public class ReaderAndWriterTest {
    // JDK1.7及之后的写法
    @Test
    public void test02() {
        try(
                FileReader fr = new FileReader(new File("a.txt"));
                FileWriter fw = new FileWriter(new File("b.txt"));
        ) {
            char[] cbuf = new char[1024];
            int len;
            while((len = fr.read(cbuf)) != -1) {
                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // JDK1.7之前的写法
    @Test
    public void test01() {
        // 创建文件输入流对象
        FileReader fr = null;
        // 创建文件输出流对象
        FileWriter fw = null;
        try {
            fr = new FileReader(new File("a.txt"));
            // 在FileWriter的构造器中可以指定文件输出方式是追加模式还是覆盖模式
            // 如果第二个参数是true表示是追加模式，否则是覆盖模式
            // 默认是覆盖模式
            fw = new FileWriter(new File("b.txt"), true);
            // 读取文件内容
            char[] cbuf = new char[1024 * 8];
            int len;
            while((len = fr.read(cbuf)) != -1) {
                // 把读取到的内容写出到文件中
                fw.write(cbuf, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (fw != null) fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null ) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}