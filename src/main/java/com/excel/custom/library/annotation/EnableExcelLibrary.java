package com.excel.custom.library.annotation;

import com.excel.custom.library.config.ExcelLibraryConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(ExcelLibraryConfiguration.class)
public @interface EnableExcelLibrary {
}
