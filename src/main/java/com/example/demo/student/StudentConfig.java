package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student me = new Student(
                "Salomé Silva",
                "me@zmail.pt",
                LocalDate.of(1978, Month.DECEMBER, 7)
            );
            Student ze = new Student(
                "José Silva",
                "ze@zmail.pt",
                LocalDate.of(1988, Month.NOVEMBER, 6)
            );
            Student be = new Student(
                "Becas Silva",
                "be@zmail.pt",
                LocalDate.of(1998, Month.OCTOBER, 5)
            );

            repository.saveAll(List.of(me, ze, be));
        };
    }
}
