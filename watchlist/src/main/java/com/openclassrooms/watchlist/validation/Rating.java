package com.openclassrooms.watchlist.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = RatingValidator.class)
public @interface Rating {
	
	String message() default "Please enter a value that is between 5.0 and 10.0";
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
