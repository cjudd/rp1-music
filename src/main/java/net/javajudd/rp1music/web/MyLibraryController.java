package net.javajudd.rp1music.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MyLibraryController {

    @RequestMapping({"/", "library"})
    public String index() {
        return "index";
    }

}
