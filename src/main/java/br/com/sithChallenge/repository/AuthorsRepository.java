package br.com.sithChallenge.repository;


import br.com.sithChallenge.model.Authors;
import org.springframework.data.repository.CrudRepository;

public interface AuthorsRepository extends CrudRepository<Authors, Long> {
}
