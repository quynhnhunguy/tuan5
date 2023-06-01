package com.example.demo.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import com.example.demo.Validator.anonation1.ValidUserId;
import com.example.demo.entity.User;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId,User> {
    @Override
    public boolean isValid (User user, ConstraintValidatorContext context){
        if(user== null)
            return true;
        return user.getId()!=null;

    }
}