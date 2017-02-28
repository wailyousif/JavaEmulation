package com.ironyard.controller;

import com.ironyard.data.Person;
import com.ironyard.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wailm.yousif on 2/27/17.
 */

@Controller
public class PersonController
{
    @Autowired
    private PersonRepo personRepo;

    @RequestMapping(path = "/postform", method = RequestMethod.POST)
    public String save(@RequestParam(value = "name", required = false) String name,
                       @RequestParam(value = "age", required = false) Integer age
        )
    {
        Person person = new Person(name, age);
        personRepo.save(person);
        return "redirect:/show";
    }

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String show(Model dataModel)
    {
        Iterable<Person> personList = personRepo.findAll();
        dataModel.addAttribute("persons", personList);
        return "/open/index";
    }
}
