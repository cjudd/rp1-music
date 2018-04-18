package net.javajudd.rp1music.web;

import net.javajudd.rp1music.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MyLibraryController {

    @Autowired
    SongRepository songRepository;

    @RequestMapping({"/", "library"})
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("songs", songRepository.findAll());
        return mav;
    }

}
