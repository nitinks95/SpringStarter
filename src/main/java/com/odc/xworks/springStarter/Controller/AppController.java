package com.odc.xworks.springStarter.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
	@Value("${spring.application.name}")
    String appName;
	
	@GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }
	
	@GetMapping("/action")
    public String actionPage(Model model, @RequestParam String name, @RequestParam String msg) {
        model.addAttribute("appName", appName);
        model.addAttribute("name", name);
        model.addAttribute("msg", msg);
        return "action";
    }
}
