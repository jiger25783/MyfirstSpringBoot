package com.springboot.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.domain.Product;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/testing")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_XHTML_XML ,MediaType.APPLICATION_JSON})
    Product home() {
    	Product p = new  Product();
    	p.setName("Mobile");
    	p.setDesc("Iphone");
        return p;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}