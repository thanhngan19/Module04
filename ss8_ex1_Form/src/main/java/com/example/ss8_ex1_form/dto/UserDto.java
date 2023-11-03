package com.example.ss8_ex1_form.dto;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
public class UserDto implements Validator {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String email;

    public UserDto(int id, String firstName, String lastName, String phoneNumber, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public UserDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
      UserDto user= (UserDto) target;
      if(user.getFirstName().length()<4){
          errors.rejectValue("firstName",null,"Min 5");
      }
      else if(user.getFirstName().length()>45){
          errors.rejectValue("firstName",null,"Max 45");
      }
      else if(user.getLastName().length()<4){
          errors.rejectValue("lastName",null,"Min 5");
      }
      else if(user.getLastName().length()>45){
          errors.rejectValue("lastName",null,"Max 45");
      }
      else if(!user.getPhoneNumber().matches("^(0|\\+84)(3[2-9]|5[2689]|7[06789]|8[1-9]|9[0-9])[0-9]{7}$")){
          errors.rejectValue("phoneNumber",null,"Wrong forrmat");
      }
      else if(user.getAge()<18){
          errors.rejectValue("age",null,"more than 18");
      }
      else if(!user.getEmail().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
          errors.rejectValue("email",null,"wrong format");
      }
    }
}
