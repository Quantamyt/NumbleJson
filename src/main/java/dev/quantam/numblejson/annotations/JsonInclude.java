package dev.quantam.numblejson.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specifies when a field should be included in serialization.
 *
 * @author quantam
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface JsonInclude {
    Include value() default Include.ALWAYS;

    enum Include {
        /**
         * Always include the field.
         */
        ALWAYS,
        /**
         * Include only if the value is non-null.
         */
        NON_NULL,
        /**
         * Include only if the value is non-empty (for collections, maps, and strings).
         */
        NON_EMPTY
    }
}