package demospring03.hellospring03.controller;

import demospring03.hellospring03.entity.Student;
import demospring03.hellospring03.payload.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")

//Tham số truyền trên trình duyệt: RequestParam
//Tham số truyền ngầm: RequestParam
//Tham số đóng vai trò là 1 đường dẫn: RequestVariable
//Tham số là đối tượng: RequestBody

public class HelloController {

    @Autowired
    private Student student;

    @GetMapping("")
    public String hello(@RequestParam String hoten, @RequestParam int tuoi){

        return ("Hello Spring boot " + hoten + " Tuoi: " + tuoi + " - IOC " + student.getName());
    }

    @PostMapping("/cyber")
    public String spring(@RequestBody LoginRequest loginRequest){
        return ("Hello Spring boot cybersoft " + loginRequest.getUsername() + " - " + loginRequest.getPassword());

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable int id){

        return new ResponseEntity<>("update " + id, HttpStatus.OK);

    }
}
