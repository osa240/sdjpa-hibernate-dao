package guru.springframework.jdbc.dao;

import guru.springframework.jdbc.domain.Book;

/**
 * Created by S.Orlov on 22.05.23
 */
public interface BookDao {
    Book getById(Long id);

    Book findBookByTitle(String title);

    Book saveNewBook(Book author);

    Book updateBook(Book author);

    void deleteBookById(Long id);
}
