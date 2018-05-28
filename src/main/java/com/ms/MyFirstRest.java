package com.ms;

import com.ms.health.MyStatus;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.ws.Response;

/**
 * Created by GulsahCoskun on 28.05.2018.
 */
@RestController
public class MyFirstRest {

    @GetMapping("/hello/{isim}")
    public String hello(@PathVariable("isim") String name, @RequestParam("soy") String surname){
        return "Hello World " + name + " " + surname;
    }

    @GetMapping("/status")
    public MyStatus getMyStatus(){
        MyStatus status = new MyStatus();
        status.setCause(100);
        status.setDesc("fdsfsd");
        status.setExtra("extra");
        status.setDetail("detail");
        return status;
    }

    @PostMapping("/test")
    @ApiOperation(notes = "Deneme notu", response = MyStatus.class,value = "Deneme operayon değeri")
    @ApiResponses({@ApiResponse(code=201,message = "Deneme Mesajı")})
    public ResponseEntity<?> getMyStatus(@Valid @RequestBody MyStatus myStatus){
       return ResponseEntity.status(HttpStatus.CREATED).body(myStatus);
    }

}
