package guru.spring.primeiroprojeto.bootstrap;

import guru.spring.primeiroprojeto.domain.Author;
import guru.spring.primeiroprojeto.domain.Book;
import guru.spring.primeiroprojeto.repository.AuthorRepository;
import guru.spring.primeiroprojeto.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Override
    public void run(String... args)  {

        Author eric = new Author(1L,"Eric","Eden");
        Author john = new Author(2L, "John", "Joseph");

        Book book1 = new Book(1L, "First book", "123456");
        Book book2 = new Book(2L, "Secound book", "654321");

        eric.getBooks().add(book1);
        john.getBooks().add(book2);

        authorRepository.save(eric);
        authorRepository.save(john);

        bookRepository.save(book1);
        bookRepository.save(book2);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books " + bookRepository.count());
    }
}
