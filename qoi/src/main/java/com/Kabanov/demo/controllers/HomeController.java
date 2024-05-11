package com.Kasatkin.demo.controllers;

import org.springframework.http.HttpStatus;
import model.TemplateModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import javax.xml.crypto.Data;
import  java.util.Date;

@Controller@RequestMapping("/rest/home")class HomeController    {
    @ResponseBody
    @RequestMapping(value = "", method=RequestMethod.GET)
    public ResponseEntity<TemplateModel> response()
    {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());

        TemplateModel model = new TemplateModel();
        model.setMessage("json-ответ");
        model.setTime((timestamp.toString()));

        return ResponseEntity.ok(model);
    }
}
