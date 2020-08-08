/*
 * package com.learn.boot.email;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.CommandLineRunner; import
 * org.springframework.core.io.FileSystemResource; import
 * org.springframework.stereotype.Component;
 * 
 * @Component public class EmailRunner implements CommandLineRunner {
 * 
 * @Autowired private EmailService emailService;
 * 
 * @Override public void run(String... args) throws Exception { // TODO
 * Auto-generated method stub FileSystemResource file=new
 * FileSystemResource("D:\\Spring Boot+Microservices(Naresh IT)\\SpringBoot8PM_01072020.png"
 * ); boolean status=emailService.sending("patilvedangi14@gmail.com",
 * "anandashish9595@gmail.com ", "ashishrpl.anand726@gmail.com", "Hello",
 * "Welcome", file); if(status) { System.out.println("Email sent SuccessFully");
 * } else { System.out.println("Email Failed"); } }
 * 
 * 
 * 
 * }
 */