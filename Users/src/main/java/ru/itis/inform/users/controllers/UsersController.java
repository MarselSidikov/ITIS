package ru.itis.inform.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.inform.users.dao.models.User;
import ru.itis.inform.users.service.UsersService;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService service;

    @RequestMapping(value = "/users", method = RequestMethod.OPTIONS)
    public ResponseEntity onOptions(@RequestHeader(value = "ORIGIN") String origin) {
        MultiValueMap<String, String> headers = prepareHeadersWithAllow(origin);
        return new ResponseEntity(headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getUsers(@RequestHeader(value = "ORIGIN") String origin) {
        MultiValueMap<String, String> headers = prepareHeadersWithAllow(origin);
        return new ResponseEntity(service.getAllUsers(), headers, HttpStatus.OK);
    }

    private MultiValueMap<String, String> prepareHeadersWithAllow(String origin) {
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.set("Access-Control-Allow-Origin", origin);
        return headers;
    }
}
