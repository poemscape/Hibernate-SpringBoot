package com.bookstore.repository;

import java.util.List;
import com.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.bookstore.projection.AuthorNameBookTitle;

@Repository
@Transactional(readOnly = true)
public interface BookRepository extends JpaRepository<Book, Long> {

    // Fetch books and authors including authors that have no registered book (JPQL)    
    @Query(value = "SELECT b.title AS title, a.name AS name "
            + "FROM Book b LEFT JOIN b.author a")
    List<AuthorNameBookTitle> findBooksAndAuthorsJpql();

    // Fetch books and authors including authors that have no registered book (SQL)    
    @Query(value = "SELECT b.title AS title, a.name AS name "
            + "FROM book b LEFT JOIN author a ON a.id = b.author_id",
            nativeQuery = true)
    List<AuthorNameBookTitle> findBooksAndAuthorsSql();        
}
