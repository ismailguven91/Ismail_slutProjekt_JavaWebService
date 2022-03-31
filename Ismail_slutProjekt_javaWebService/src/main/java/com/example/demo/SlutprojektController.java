package com.example.demo;


import javax.servlet.http.HttpServletResponse;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlutprojektController  implements ErrorController{

	DocumentationService ds = new DocumentationService();

    @RequestMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String root() {
        return ds.totalDescription();
    }

    //  --------------------->Error Handling<---------------------
    @RequestMapping(value = "/error", produces = MediaType.TEXT_HTML_VALUE)
    public String error(HttpServletResponse response) {
        if (response.getStatus() == HttpStatus.NOT_FOUND.value()) {
            return "error-404";
        } else if (response.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
            return "error-500";
        } else {
            return "something went wrong! Try again";
        }
    }
    //  --------------------->Error Handling<---------------------
}
    
    
    
    
 
