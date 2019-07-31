import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.junit.Test;

public class EmailTest {
    @Test
   public void test1() throws Exception {
        SimpleEmail email = new SimpleEmail();
        //设置要联系的主机名
        email.setHostName("smtp.qq.com");
        //设置登录远程服务器的用户和密码，
        email.setAuthentication("952965014@qq.com","tsestkhczgpsbfdi");
//        编写邮件，发送给谁
        email.addTo("952965014@qq.com");
        email.setFrom("952965014@qq.com");
        //设置主题
        email.setSubject("hello,world");
        //设置邮件内容
        email.setMsg("这是我第一次发送邮件");


        email.send();
    }
}
