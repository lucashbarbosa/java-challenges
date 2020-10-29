package br.com.sithChallenge.repository;

import br.com.sithChallenge.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Long> {
}
