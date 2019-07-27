package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class test2 {
    public static void main(String[] args) throws Exception{
        //设定为当前文件夹
        File directory = new File("");
//获取绝对路径
        String absolutePath = directory.getAbsolutePath();
//对字符串进行拼接，具体要自己测试下
        InputStream is = new FileInputStream(absolutePath+"\\src\\jdbc.properties");
    }
}
