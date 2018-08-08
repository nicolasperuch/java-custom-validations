package dev.peruch.vaidabom.validator;

import dev.peruch.vaidabom.validator.annotation.Evaluate;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class FieldValidator implements ConstraintValidator<Evaluate, String> {

    @Override
    public boolean isValid(String field, ConstraintValidatorContext constraintValidatorContext) {
        return field != null;
    }
}