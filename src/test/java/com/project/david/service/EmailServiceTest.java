package com.project.david.service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thymeleaf.util.DateUtils;

@SpringBootTest
public class EmailServiceTest {

	@Autowired
	EmailService emailService;

	@Test
	public void sendEmail() {
		String sendTo = "davidchen428@yahoo.com";
		String subject = "EmailService Project Test: " + transferDateStr(Instant.now());
		Map<String, Object> model = Map.of("name", "昶文");

		try {
			emailService.sendTemplateEmail(sendTo, subject, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String transferDateStr(Instant date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd").withZone(ZoneId.of("Asia/Taipei"));
		return formatter.format(date);
	}
}
