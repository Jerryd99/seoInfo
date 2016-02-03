package com.winndoo.seoinfo.utils;

import java.io.File;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;  
import javax.mail.internet.MimeMessage;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.mail.javamail.JavaMailSenderImpl;  
import org.springframework.mail.javamail.MimeMessageHelper;  

public class MailUtils {
	
	public static JavaMailSenderImpl sender = new JavaMailSenderImpl();  
	
	public static void sendMail(String to, String subject, String from, String text,String filename, String filepathname) {
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
        props.put("mail.smtp.localhost", "127.0.0.1");
        Session session = Session.getInstance(props);  
        sender.setSession(session); // 为发送器指定会话
	      
	    MimeMessage mail = sender.createMimeMessage();  
	    MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(mail, true);
			helper.setTo(to); // 发送给谁  
		    helper.setSubject(subject); // 标题  
		    helper.setFrom("service@winndoo.com"); // 来自  
		    // 邮件内容，第二个参数指定发送的是HTML格式  
		    helper.setText(text,true);  
		    
	    
		    File file = new File(filepathname);  
		    if(!file.exists()){
		    	System.out.println("文件不存在");
		    }
		    else{
		    	helper.addAttachment(filename, file);
		    	sender.send(mail); // 发送
		    }
		    
		      
		      
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	    
	      
	    System.out.println("邮件发送成功");
	}
      
      public static void main(String[] args) throws MessagingException{
    	  MailUtils.sendMail("99333566@qq.com", "sub", null, "text", "dailing.txt", "E:\\dailing.txt");
      }
    
}
