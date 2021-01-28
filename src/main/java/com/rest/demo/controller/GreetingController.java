package com.rest.demo.controller;

import com.rest.demo.bean.Greeting;
import com.rest.demo.business.GreetingBusiness;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    final GreetingBusiness business;

    public GreetingController() {
        business = new GreetingBusiness();
    }

    @RequestMapping(value = "/greeting")
    public Greeting greeting() {
        return business.badGreeting();
    }

    @RequestMapping(value = "/")
    public String welcome() {
        return "Bonjour à vous cher utilisateur <3. Merci de renseigner l'url sous la forme /gretting/'votreMessage'/'nomAutheur'";
    }

    @RequestMapping(value = "/greeting/{name}/{auteur}")
    public Greeting greeting(@PathVariable("name") String name, @PathVariable("auteur") String auteur) {
        return business.greeting(name, auteur);
    }
}
