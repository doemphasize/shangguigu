import org.apache.commons.mail.SimpleEmail;
import org.junit.Test;

public class EmailTest01 {
    @Test
   public void test1() throws Exception {
        SimpleEmail email = new SimpleEmail();
        //设置要联系的主机名
        email.setHostName("127.0.0.1");
        //设置端口号
        email.setSmtpPort(25);
        //设置登录远程服务器的用户和密码，
        email.setAuthentication("root@chenming.com","123456");
//        编写邮件，发送给谁
        email.addTo("doemphasize@163.com");
        email.setFrom("root@chenming.com");
        //设置主题
        email.setSubject("hello,world");
        //设置邮件内容
        email.setMsg("这是我第一次发送邮件");


        email.send();
    }
}
