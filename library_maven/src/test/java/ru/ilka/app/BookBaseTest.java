package ru.ilka.app;


import org.junit.Assert;
import org.testng.annotations.Test;
import ru.ilka.app.Model.Book;

import java.util.Collections;
import java.util.Map;

import static ru.ilka.app.DataBase.BookBase.getLibraryBooks;
import static ru.ilka.app.DataBase.BookBase.getUserBooks;

public class BookBaseTest {

    public static final Book BOOK = new Book("Java Top",
            "Александр Чемпионович",
            2023);
    @Test
    public void testGetUserBooksMapEmpty() {
        Map<Book, Integer> userBooks = getUserBooks();
        Assert.assertEquals(Collections.emptyMap(), userBooks);
    }

    @Test
    public void testGetLibraryBooksMapNotEmpty() {
        Map<Book, Integer> libraryBooks = getLibraryBooks();
        Assert.assertEquals(Collections.emptyMap(), libraryBooks);
    }

    @Test
    public void testAddBookToUserMap() {
        Map<Book, Integer> userBooks = getUserBooks();
        userBooks.put(BOOK, 1);
        Assert.assertEquals(Map.of(BOOK, 1), userBooks);
    }

    @Test
    public void testAddManyBookToUserMap() {
        Map<Book, Integer> userBooks = getUserBooks();
        userBooks.put(BOOK, 1);
        userBooks.put(BOOK, 2);
        userBooks.put(BOOK, 3);
        userBooks.put(BOOK, 4);
        userBooks.put(BOOK, 5);
        Assert.assertEquals(Map.of(BOOK, 5), userBooks);
    }

    @Test
    public void testRemoveBookFromUserMap(){
        Map<Book, Integer> userBooks = getUserBooks();
        userBooks.put(BOOK, 1);
        userBooks.remove(BOOK,1);
        Assert.assertEquals(Collections.emptyMap(), userBooks);
    }

    @Test
    public void testRemoveManyBooksFromUserMap(){
        Map<Book, Integer> userBooks = getUserBooks();
        userBooks.put(BOOK, 1);
        userBooks.put(BOOK, 2);
        userBooks.put(BOOK, 3);
        userBooks.put(BOOK, 4);
        userBooks.put(BOOK, 5);
        userBooks.remove(BOOK,1);
        userBooks.remove(BOOK,2);
        userBooks.remove(BOOK,3);
        userBooks.remove(BOOK,4);
        userBooks.remove(BOOK,5);
        Assert.assertEquals(Collections.emptyMap(), userBooks);
    }



}
