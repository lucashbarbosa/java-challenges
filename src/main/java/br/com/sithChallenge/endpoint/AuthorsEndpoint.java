package br.com.sithChallenge.endpoint;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorsEndpoint {

    @GetMapping("/{id}")
    public String listAll(@PathVariable("id") Long id){
        String message = id.equals(3) ? id.toString() : "Welcome to the Sith Order, **Darth Vader**, your id is " + id.toString();
        
        return message;

    }
}
