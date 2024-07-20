package in.chandra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    public BookController(){
        System.out.println("Book controller () method called!!!!");
    }
    @GetMapping("/book")
    public ModelAndView getBookData(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("id", 101);
        mav.addObject("name","java");
        mav.addObject("price",450.22);

        mav.setViewName("Book");// based on this we can crete


        return mav;
    }
}
