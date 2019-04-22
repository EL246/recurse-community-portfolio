package com.recurse.portfolio;

import com.recurse.portfolio.data.User;
import com.recurse.portfolio.security.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public ModelAndView index(@CurrentUser User user) {
        if (user == null) {
            return new ModelAndView("home");
        } else {
            ModelAndView mv = new ModelAndView("secure");
            mv.addObject("username", user.getInternalName());
            return mv;
        }
    }
}
