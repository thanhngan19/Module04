package com.example.ss3_ex3_form.repository;

import com.example.ss3_ex3_form.model.Form;

public interface IFormRepository {
    void addNewForm (Form newForm);
    void editForm (Form oldForm);

}
