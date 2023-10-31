package com.example.Demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @GetMapping("/get")
    public  String first(){
        return "hello";
    }
    @PostMapping("/post")
    public String sec(@RequestParam("s1")String s1){
        return "heyy " +s1;
    }

    @DeleteMapping("/delete/{id}")
    public String third(@PathVariable int id ){
        return "deleted"+id;
    }
    @PutMapping("/put")
    public  String forth(@RequestParam("id")int id,@RequestParam("name")String name ){
        return "update";
    }


}
