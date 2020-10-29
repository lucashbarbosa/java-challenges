package br.com.sithChallenge.endpoint;



import br.com.sithChallenge.model.Authors;
import br.com.sithChallenge.model.Books;

import br.com.sithChallenge.repository.AuthorsRepository;
import br.com.sithChallenge.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BooksEndpoint {
    private final BooksRepository booksDAO;

    @Autowired
    public BooksEndpoint(BooksRepository booksDAO){
        this.booksDAO = booksDAO;
    }

    @GetMapping
    public ResponseEntity<?> findAll(){



        return new ResponseEntity<>(booksDAO.findAll(), HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listById(@PathVariable("id") Long id){

        Optional<Books> book = booksDAO.findById(id);

        return new ResponseEntity<>(book, HttpStatus.OK);

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(@RequestBody Books book){

        return new ResponseEntity<>(booksDAO.save(book), HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<?> addBook(@RequestBody Books book){

        return new ResponseEntity<>(booksDAO.save(book), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable Long id){

        booksDAO.deleteById(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }




}
