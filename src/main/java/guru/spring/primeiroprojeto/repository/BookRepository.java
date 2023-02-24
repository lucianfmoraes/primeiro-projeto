package guru.spring.primeiroprojeto.repository;

import guru.spring.primeiroprojeto.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
