package com.zking.oa.controller;

import com.zking.oa.model.Book;
import com.zking.oa.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @ModelAttribute
    public void init(Model model) {
        System.out.println("init");
        model.addAttribute("classList", new String[]{"t220", "t225", "t230"});
        Book book=new Book();
        book.setBookId(2);
        model.addAttribute("Book",book);

    }

    @RequestMapping("/toAdd")
//    @RequestMapping(value = "/toAdd",method = {RequestMethod.GET})
//    @GetMapping("/toAdd")
//    @PostMapping("/toAdd")
    public String toAdd(Book book,Model model) {
        System.out.println("toAdd");
        String[] classList = (String[]) model.asMap().get("classList");
        System.out.println(Arrays.toString(classList));

        return "addBook";
    }

   @PostMapping("/add")
    public ModelAndView add(ModelAndView modelAndView, Book book, RedirectAttributes redirectAttributes) {
        System.out.println("add");
       System.out.println(book);
       bookService.add(book);

       redirectAttributes.addAttribute("id",110);

       modelAndView.setViewName("redirect:/book/toAdd");
       return modelAndView;
    }
}
