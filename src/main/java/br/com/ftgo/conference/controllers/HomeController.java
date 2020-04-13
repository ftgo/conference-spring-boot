package br.com.ftgo.conference.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Value("${app.version}")
    private String version;

    @GetMapping
    @RequestMapping("/")
    public Map getStatus() {
        HashMap<String, String> status = new HashMap<>();
        status.put("app-version", version);

        return status;

    }
}
