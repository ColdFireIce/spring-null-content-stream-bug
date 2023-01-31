package com.example.demo;

import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TestController {

    @PostMapping(path = "/test")
    public void test(HttpServletRequest request) throws IOException {
        ServletInputStream inputStream = request.getInputStream();
        // something reads the stream and closes it:
        inputStream.readAllBytes();
        inputStream.close();
    }
}
