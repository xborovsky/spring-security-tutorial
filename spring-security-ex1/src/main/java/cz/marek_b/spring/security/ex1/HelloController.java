package cz.marek_b.spring.security.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public ModelAndView welcomePage() {
        ModelAndView result = new ModelAndView();

        result.addObject("title", "Spring Security Hello World");
        result.addObject("message", "This is welcome page!");
        result.setViewName("hello");

        return result;
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView result = new ModelAndView();

        result.addObject("title", "Spring Security Hello World");
        result.addObject("message", "This is protected page!");
        result.setViewName("admin");

        return result;
    }

}
