package demospring03.hellospring03.config;

import demospring03.hellospring03.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOCConfig {

    @Bean
    public Student createStudentIOC(){

        Student student = new Student();
        student.setName("HoaGiang");
        student.setAge(21);

        return student;
    }
}
