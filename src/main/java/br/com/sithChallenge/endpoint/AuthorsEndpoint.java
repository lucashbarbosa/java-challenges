package br.com.sithChallenge.endpoint;


import br.com.sithChallenge.model.Authors;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/authors")
public class AuthorsEndpoint {

    @GetMapping("/{id}")
    public String listAll(@PathVariable("id") Long id){
        String message = id.equals(3) ? id.toString() : "Welcome to the Sith Order, **Darth Vader**, your id is " + id.toString();

        return message;

    }
    @PostMapping
    public String authors (@RequestBody  Authors author){
        String message;

            message = String.format(author.getName() + " was born in " + new SimpleDateFormat("yyyy-MM-dd").format(author.getBirthDate()));


        return message;
    }

}
