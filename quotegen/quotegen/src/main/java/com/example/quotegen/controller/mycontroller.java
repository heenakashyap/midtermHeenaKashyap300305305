/*
Heena Kashyap
(300305305)
Course: 3275-001

*/

package com.example.quotegen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mycontroller {
//--    @RequestMapping("/")
   // @ResponseBody
  // -- public String listofItems() {
//return "list of items";
      // -- return "home";
  // -- }

    @Autowired
    private RandomJokes joke;

    public String getRandomJokes(){
        return joke.getRandomJokes();
    }


    @RequestMapping("/joke")
    public String hello(Model model){
        model.addAttribute("message",getRandomJokes()+"");
        return "index";
    }




}
