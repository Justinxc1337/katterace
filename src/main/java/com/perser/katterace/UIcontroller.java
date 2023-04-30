package com.perser.katterace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@SpringBootApplication
@RestController
@Controller
public class UIcontroller {

    @GetMapping("/index")
    @ResponseBody
    public String index() throws IOException {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:/template/index.html");
        InputStream inputStream = resource.getInputStream();
        byte[] bytes = StreamUtils.copyToByteArray(inputStream);
        String htmlContent = new String(bytes, StandardCharsets.UTF_8);
        return htmlContent;

    }

    @GetMapping("/voresbaggrund")
    public String voresbaggrund() {
        return "who cares";
    }

}