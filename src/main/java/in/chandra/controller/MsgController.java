package in.chandra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

    public  MsgController(){
        System.out.println("MsgController () ::Constructor called using bean");
    }
    @GetMapping("/greet")
    public ModelAndView greetMsg(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("msg","welcome to the method 2");
        modelAndView.setViewName("Index");
        return modelAndView;
    }
    @GetMapping("/welcome")
    public ModelAndView getWelcomem1(){
        ModelAndView mav=new ModelAndView();
        //setting data into the key value map
        mav.addObject("msg","Welcome to AshokIT");
        //setting to the filename view retun file name
        mav.setViewName("Index");
        return mav;
    }
}
