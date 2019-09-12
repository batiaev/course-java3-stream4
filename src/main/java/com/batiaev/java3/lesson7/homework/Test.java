package com.batiaev.java3.lesson7.homework;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Constraint(validatedBy = PriorityValidator.class)
public @interface Test {
    int MIN_PRIORITY = 1;
    int MAX_PRIORITY = 10;
    int priority() default 5;
}
