package com.winndoo.seoinfo.utils;

import java.io.File;
import java.util.Properties;  
import javax.mail.Session;  
import javax.mail.internet.MimeMessage;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.mail.javamail.JavaMailSenderImpl;  
import org.springframework.mail.javamail.MimeMessageHelper;  
  
/** 
 * 这里不做异常处理 
 */  
public class MailTest {  
    public static void main(String[] args) throws Exception{  
        // 发送器  
        JavaMailSenderImpl sender = new JavaMailSenderImpl();  
        sender.setHost("smtp.exmail.qq.com");  
        sender.setPort(465); // 默认就是25  
        sender.setUsername("service@winndoo.com");   
        sender.setPassword("Iknowthat221");  
        sender.setDefaultEncoding("UTF-8");  
          
        // 配置文件对象  
        Properties props = new Properties();      
        props.put("mail.smtps.auth", "true"); // 是否进行验证  
        props.put("mail.smtp.ssl.enable", "true"); // 是否进行验证
        props.put("mail.transport.protocol", "smtps"); // 是否进行验证 
        Session session = Session.getInstance(props);  
        sender.setSession(session); // 为发送器指定会话  
          
        MimeMessage mail = sender.createMimeMessage();  
        MimeMessageHelper helper = new MimeMessageHelper(mail, true);  
        helper.setTo("99333566@qq.com"); // 发送给谁  
        helper.setSubject("subjects"); // 标题  
        helper.setFrom("service@winndoo.com"); // 来自  
        // 邮件内容，第二个参数指定发送的是HTML格式  
        helper.setText("sssss",true);  
        // 增加CID内容  
//        ClassPathResource img = new ClassPathResource("abc.jpg");  
//        helper.addInline("myImg", img);  
//        // 增加附件  
//        ClassPathResource file = new ClassPathResource("/att1.txt");  
//        helper.addAttachment("att1.txt", file);  
        
        File file = new File("E:\\dailing.txt");  
        helper.addAttachment("dailing.txt", file);
          
        sender.send(mail); // 发送  
          
        System.out.println("邮件发送成功");  
    }  
}  