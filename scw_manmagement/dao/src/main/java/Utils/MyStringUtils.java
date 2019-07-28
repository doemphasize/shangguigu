package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyStringUtils {
    public static boolean isEmpty(String str){
        if(str==""){
            return true;
        }
        if (str.trim().equals("")){
            return  true;
        }

        return false;

    }
    public static String formatdate(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String s = format.format(date);
        return s;
    }
}
