package com.rest.demo.business;

import com.rest.demo.bean.Greeting;

public class GreetingBusiness {
    public Greeting greeting(String message, String auteur) {
        Greeting grt = new Greeting();
        grt.setAuteur(auteur);
        grt.setMessage("Bonjouur " + message + " ravi de vous revoir en bonne forme <3");
        return grt;
    }

    public Greeting badGreeting() {
        Greeting grt = new Greeting();
        grt.setMessage("Votre nom est ce qui fait de vous une personne si spéciale. N'ayez aucune crainte à le mentionner :). Merci de le renseigner sous la forme gretting/message/autheur");
        return grt;
    }
}
