package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import mobile.Phone;
import search.SearchCommand;
import service.PhoneService;

public class webcontroller {
    @Resource
    PhoneService phoneService;

    @GetMapping ("/")
    public String playGame(Model model) {
        List<Phone> phoneList = phoneService.getAllPhones();
        model.addAttribute("phoneList", phoneList);
        model.addAttribute("searchCommand", new SearchCommand());
        return "index";

    }

    @PostMapping("/search")
    public String searchSubmit(ModelMap model,@ModelAttribute SearchCommand searchCommand) {
        List<Phone> result = new ArrayList<Phone>();
        if(!searchCommand.getText().isEmpty())
        {
            result = phoneService.getPhones(searchCommand.getText());
            if(result.size()>0)
                model.addAttribute("phoneList", result);
            else
            {
                model.addAttribute("searchResult", "No item found!");
                model.addAttribute("phoneList", new ArrayList<Phone>());
            }
            return "index";
        }
        else
        {
            result = phoneService.getAllPhones();
            model.addAttribute("phoneList", result);
            return "index";
        }
    }
}
