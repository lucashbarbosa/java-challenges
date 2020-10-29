package br.com.sithChallenge.endpoint;


import br.com.sithChallenge.model.Authors;
import br.com.sithChallenge.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorsEndpoint {
    private final AuthorsRepository authorsDAO;

    @Autowired
    public AuthorsEndpoint(AuthorsRepository authorsDAO){
        this.authorsDAO = authorsDAO;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listById(@PathVariable("id") Long id){

        Optional<Authors> author = authorsDAO.findById(id);

        return new ResponseEntity<>(author, HttpStatus.OK);

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Authors author){

        return new ResponseEntity<>(authorsDAO.save(author), HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<?> addAuthor(@RequestBody Authors author){

        return new ResponseEntity<>(authorsDAO.save(author), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAuthor(@PathVariable Long id){

        authorsDAO.deleteById(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }


}
