package com.odc.xworks.springStarter.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.odc.xworks.springStarter.SpringStarterApplication;
import com.odc.xworks.springStarter.entity.Message;

@Controller
public class AppController {
	
	private static final Logger log = LoggerFactory.getLogger(SpringStarterApplication.class);
	
	@Value("${spring.application.name}")
    String appName;
	
	@GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }
	
	@PostMapping("/action")
    public String postMessage(Message msg, Model model) {
		log.info("invoking postMessage()");
		Message mAddedMsg = new Message(msg.getsName(), msg.getsMessage());
        model.addAttribute("appName", appName);
        model.addAttribute("lId", mAddedMsg.getlId().toString());
        model.addAttribute("sName", mAddedMsg.getsName());
        model.addAttribute("sMessage", mAddedMsg.getsMessage());
        
        return "action";
    }
}
