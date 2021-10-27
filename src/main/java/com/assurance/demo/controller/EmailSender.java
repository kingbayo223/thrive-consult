package com.assurance.demo.controller;
import com.assurance.demo.model.AppointmentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring4.SpringTemplateEngine;
import javax.mail.internet.MimeMessage;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class EmailSender {
	 @Autowired
	    SpringTemplateEngine templateEngine;

	    @Autowired
	    private JavaMailSender sender;

	    @RequestMapping("/api/getdetails")
	    public @ResponseBody AppointmentModel sendMail(@RequestBody AppointmentModel appointment) throws Exception {

	        MimeMessage message = sender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message,
	                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
	                StandardCharsets.UTF_8.name());

	        Map<String, Object> model = new HashMap<String, Object>();
	        model.put("fName",appointment.getfName());
	        model.put("mName",appointment.getmName());
	        model.put("lName",appointment.getlName());
	        model.put("phone",appointment.getPhone());
	        model.put("email",appointment.getEmail());
	        model.put("date",appointment.getDate());
	        model.put("amount",appointment.getAmount());
	        model.put("service",appointment.getService());
	        model.put("link",appointment.getLink());


	        Context context = new Context();
	        context.setVariables(model);
	        String html = templateEngine.process("mailTemplate", context);

	        try {
	        	helper.setFrom("thriveconsult1@email.com");
	            helper.setTo(appointment.getEmail());
	            helper.setText(html,true);
	            helper.setSubject("Thrive Consult Booking Confirmation");
	        } catch (javax.mail.MessagingException e) {
	            e.printStackTrace();
	        }
	        sender.send(message);

	        return appointment;

	    }
	

}
