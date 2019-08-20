package com.endang.project2;

import com.endang.project2.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/view")
    public String viewData(){
        return "viewdata";
    }

    @RequestMapping("/viewGen")
    public String viewDataGen(Model model){
        List<Employee> listdata = new ArrayList<Employee>();
        int max = 100;
        for (int i = 0; i < max; i++) {
            Employee emp = new Employee("Nama "+i,"Position "+i,"Office "+i,10+i);
            listdata.add(emp);
        }
        model.addAttribute("data",listdata);
        return "viewdatagen";
    }
}
