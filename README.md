# Email Service Example
## Which function can it offer
Send the message by Email.<br>
<br>
## How to do
1. Create app password in Google account (for sender email use)
2. init Spring Boot Project
3. pom.xml (outer package you can use)
   ```xml
   
		<dependency>
    		<groupId>org.springframework.boot</groupId>
    		<artifactId>spring-boot-starter-mail</artifactId>
    		<version>3.4.3</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-freemarker</artifactId>
		</dependency>
   
   ```
4. application.yaml (config setting)
   ```yaml
   spring:
   #mailsender
       mail:
           host: smtp.gmail.com
           port: 587
           username: ${MAIL_USERNAME}
           password: ${MAIL_PASSWORD}
           properties:
               mail:
                   debug: true
                   smtp:
                       auth: true
                       starttls:
                           enable: true
                           required: true

   #freemarker
       freemarker:
           template-loader-path: classpath:/templates/
           suffix: .ftl
           charset: UTF-8
           check-template-location: true
           cache: false 
   ```
5. templates
   create email module with freemark template language (ftl) <br>
   Or you can use html to design <br>
   <br>
6. Service
   Set the email address taht you want to email to (mailTo), can search the email address in database. <br>
   Set the email subject. (subject) <br>
   Get template module, you should define the module path.
   Set the model (model with parameters), it can be printed in the email message. <br>
   
9. Test
