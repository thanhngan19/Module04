package com.example.ss3_ex3_form.service;

import com.example.ss3_ex3_form.model.Form;
import com.example.ss3_ex3_form.repository.IFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService implements IFormSevice{
    @Autowired
    IFormRepository repoForm;
    @Override
    public void addNewForm(Form newForm) {
        repoForm.addNewForm(newForm);
    }

    @Override
    public void editForm(Form oldForm) {
        repoForm.editForm(oldForm);
    }
}
