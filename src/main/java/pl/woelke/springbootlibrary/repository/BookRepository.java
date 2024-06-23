package pl.woelke.springbootlibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.woelke.springbootlibrary.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
