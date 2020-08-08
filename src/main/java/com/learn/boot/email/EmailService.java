/*
 * package com.learn.boot.email;
 * 
 * import javax.mail.internet.MimeMessage;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.core.io.FileSystemResource; import
 * org.springframework.mail.javamail.JavaMailSender; import
 * org.springframework.mail.javamail.MimeMessageHelper; import
 * org.springframework.stereotype.Component;
 * 
 * @Component public class EmailService {
 * 
 * @Autowired private JavaMailSender javaMailSender;
 * 
 * public boolean sending(String to,String cc,String bcc,String subject,String
 * text, FileSystemResource fileSystemResource ) { boolean status=false; try {
 * MimeMessage message=javaMailSender.createMimeMessage(); MimeMessageHelper
 * mimeMessageHelper=new MimeMessageHelper(message, fileSystemResource!=null
 * ?true :false); mimeMessageHelper.setTo(to); if(cc!=null) {
 * mimeMessageHelper.setCc(cc);} if(bcc!=null) { mimeMessageHelper.setBcc(bcc);}
 * mimeMessageHelper.setSubject(subject); mimeMessageHelper.setText(text);
 * if(fileSystemResource!=null) {
 * mimeMessageHelper.addAttachment(fileSystemResource.getFilename(),
 * fileSystemResource); } javaMailSender.send(message); status=true; } catch
 * (Exception e) { // TODO: handle exception status=false; e.printStackTrace();
 * } return status;
 * 
 * }
 * 
 * }
 */