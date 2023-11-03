package com.example.ss_1_ex2_translate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping(value ="/word")
public class TranslateController {
    @GetMapping(value ="/trans")
    public String translate(Model model){
        return"index";
    }
    @PostMapping(value ="/trans")
    public String translated(@RequestParam String word, String vie, String eng, Model model){
        ArrayList<Integer> count= new ArrayList<Integer>();
        String result = null;
        Map<String,String> map = new HashMap<String,String>();
        map.put("hello", "xin chào");
        map.put("cat", "mèo");
        map.put("dog", "chó");
        Set<String> set = map.keySet();
        if(vie==null && eng !=null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if(key.equals(word)){
                    result= entry.getValue();
                    count.add(1);
                }
            }
        }else if(vie != null && eng==null){
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getValue();
                if(key.equals(word)){
                    result= entry.getKey();
                    count.add(1);
                }
            }
        }
        if(count.size() == 0){
            String alert ="không tìm thấy trong từ điển";
            model.addAttribute("alert",alert);
        }
        model.addAttribute("result", result);
        return "index";
    }

}
