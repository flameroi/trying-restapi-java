package com.example.restservice;

public @interface Inform {
    String author() default "roi";
    int idk_value();
}
