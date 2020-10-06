package com.odc.xworks.springStarter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.odc.xworks.springStarter.SpringStarterApplication;
import com.odc.xworks.springStarter.entity.Application;
import com.odc.xworks.springStarter.entity.Message;
import com.odc.xworks.springStarter.dto.MessageDTO;
import com.odc.xworks.springStarter.repo.MessageRepo;

@Controller
public class AppController {
	
	private static final Logger log = LoggerFactory.getLogger(SpringStarterApplication.class);
	
	@Autowired
    private MessageRepo msgRepo;
	String appName="SpringStarter";
	
	@GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }
	
	@PostMapping("/action")
    public String postMessage(Message msg, Model model) {
		log.info("invoking postMessage()");
		// MessageDTO mAddedMsg = msgRepo.save(MessageMapper.INSTANCE.MsgToMsgDTO(msg));
		MessageDTO mAddedMsg = msgRepo.save(new MessageDTO(msg.getsName(), msg.getsMessage()));
        model.addAttribute("appName", appName);
        model.addAttribute("lId", mAddedMsg.getlId());
        model.addAttribute("sName", mAddedMsg.getsName());
        model.addAttribute("sMessage", mAddedMsg.getsMessage());
        return "action";
    }
	
	@GetMapping("/createApp")
    public String createAppPage(Model model) {
        model.addAttribute("appName", appName);
        return "app-mgmt-home";
    }
	
	@PostMapping("/postApp")
	public String postAppPage(Application app, Model model) {
		
		return "app";
	}
	
}