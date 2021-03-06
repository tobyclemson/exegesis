package exegesis;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;

@Retention(RetentionPolicy.RUNTIME)
@Target(value={PARAMETER})
public @interface ParameterAnnotationWithElements {
    String name();
    int priority() default 0;
}
