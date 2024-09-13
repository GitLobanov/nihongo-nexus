package com.nihongonexus;

import org.springframework.boot.SpringApplication;

public class TestNihongoNexusApplication {

    public static void main(String[] args) {
        SpringApplication.from(NihongoNexusApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
