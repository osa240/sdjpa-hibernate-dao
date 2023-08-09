package guru.springframework.jdbc.dao;

import java.util.List;
import guru.springframework.jdbc.domain.Book;

/**
 * Created by S.Orlov on 22.05.23
 */
public interface BookDao {
    Book findBookByNameNative(String title);

    Book findBookByTitleCrireria(String title);

    List<Book> findAll();

    Book findByISBN(String isbn);

    Book getById(Long id);

    Book findBookByTitle(String title);

    Book saveNewBook(Book author);

    Book updateBook(Book author);

    void deleteBookById(Long id);
}
