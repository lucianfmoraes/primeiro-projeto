package guru.spring.primeiroprojeto.repository;

import guru.spring.primeiroprojeto.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
