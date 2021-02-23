package com.youngwooweb.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class SessionController {

    @GetMapping("/")
    public String home(Model model, HttpSession session) {
        String preferredLang = (String) session.getAttribute("preferredLang");
        model.addAttribute("preferredLang", preferredLang);
        model.addAttribute("sessionId", session.getId());
        return "index";
    }
    @GetMapping("/setLang")
    public String setLang(@RequestParam("preferredLang") String preferredLang, HttpSession session) {
        session.setAttribute("preferredLang", preferredLang);
        return "redirect:/";
    }
    @PostMapping("/destroy")
    public String destroySession(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

}

