package io.codelex.dynamiccontentwithjavaspring;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MenuController {
    MenuServices menuServices;

    public MenuController(MenuServices menuServices) {
        this.menuServices = menuServices;
    }

    @GetMapping("/menu1")
    public ModelAndView getMenu1(Model model) {
        String time = menuServices.getTime();
        String date = menuServices.getDate();
        model.addAttribute("time", time);
        model.addAttribute("date", date);
        return new ModelAndView("menu1");
    }

    @GetMapping("/menu2")
    public ModelAndView getMenu2(Model model) {
        int randomInt = menuServices.getRandomInt();
        int count = menuServices.getCount();
        model.addAttribute("randomInt", randomInt);
        model.addAttribute("counter", count);
        return new ModelAndView("menu2");
    }

}


