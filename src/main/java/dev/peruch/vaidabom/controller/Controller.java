package dev.peruch.vaidabom.controller;

import dev.peruch.vaidabom.validator.annotation.Evaluate;
import dev.peruch.vaidabom.controller.input.Payment;
import dev.peruch.vaidabom.output.Output;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Field;

@RestController
public class Controller {

    @GetMapping("/")
    public String home(){
        return "Home :)";
    }

    @PostMapping("/payment")
    public Payment payment(@RequestBody @Valid Payment payment){
        return payment;
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Output handleValidationExceptions(MethodArgumentNotValidException ex) throws NoSuchMethodException, NoSuchFieldException {

        Payment payment = new Payment();
        Class targetClass = payment.getClass();
        Field f = targetClass.getDeclaredField(ex.getBindingResult().getFieldError().getField());
        Evaluate anno = f.getAnnotation(Evaluate.class);

        return new Output(anno.codigo(), anno.message());
    }
}
