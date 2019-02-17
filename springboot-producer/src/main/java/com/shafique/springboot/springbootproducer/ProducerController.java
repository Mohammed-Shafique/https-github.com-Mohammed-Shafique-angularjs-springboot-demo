package com.shafique.springboot.springbootproducer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {


        @GetMapping("/produce")
        public String produceMessage(){
            System.out.println("*****INSIDE CONTROLLER*******");
            return  "I am Service Provider";
        }
}
