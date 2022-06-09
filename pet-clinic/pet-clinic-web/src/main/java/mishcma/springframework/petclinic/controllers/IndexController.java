package mishcma.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/oups")
    public String oupsHandler(){
        return "notimplemented";
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }
}
