package com.example.ss3_ex3_form.repository;

import com.example.ss3_ex3_form.model.Form;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class FormRepository implements IFormRepository{
    public static ArrayList<Form> form = new ArrayList<Form>();
    @Override
    public void addNewForm(Form newForm) {
        form.add(newForm);
    }

    @Override
    public void editForm(Form oldForm) {
  form.clear();
  form.add(oldForm);

    }
}
