package com.example.ss3_ex3_form.controller;

import com.example.ss3_ex3_form.model.Form;
import com.example.ss3_ex3_form.service.IFormSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/show")
public class FormController {
    @Autowired
    IFormSevice getFromService;
    @GetMapping(value ="/form")
    public String showForm (Model model){
      model.addAttribute("newForm",new Form());
      model.addAttribute("vehicle1", new String[]{"Tàu bay","Tàu thuyền","Ô tô","Khác"});
      model.addAttribute("symptom" , new String[]{"Sốt","Ho","Khó thở","Đau họng","Nôn","Tiêu chảy","Xuất huyết ngoài da","Nổi ban ngoài da"});
      model.addAttribute("infection", new String[]{"Đến trang trại chăn nuôi/Chợ buôn bán động vật sống/Cơ sở diết mỏo động vật/Tiếp xúc động vật","Tiếp xúc gần <2m"});
      model.addAttribute("gender1",new String[]{"female","male"});
      model.addAttribute("nationality1",new String[]{"VietNam","English","UK"});
      model.addAttribute("month1", new String[]{"1","2","3","4","5","6","7","8","9"});
      return "index";
    }


}
