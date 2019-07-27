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
}
