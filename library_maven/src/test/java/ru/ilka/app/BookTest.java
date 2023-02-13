package ru.ilka.app;
import org.junit.Assert;
import org.testng.annotations.Test;
import ru.ilka.app.Model.Book;

import java.util.Collections;
import java.util.Map;

import static ru.ilka.app.DataBase.BookBase.getLibraryBooks;
import static ru.ilka.app.DataBase.BookBase.getUserBooks;

public class BookTest {

    public static final Book BOOK = new Book();
    public static final Book BOOK_WITH_NAME = new Book("Java Top");
    public static final Book BOOK_WITH_AlL_PARAMETERS = new Book("Java Top",
            "Александр Чемпеонович", 2023);

    @Test
    public void newBookWithoutParametr(){
        Assert.assertEquals(new Book(), BOOK);
    }

    @Test
    public void newBookWithName(){
        Assert.assertEquals(new Book("Java Top"), BOOK_WITH_NAME);
    }
    @Test
    public void newBookWithAllParameters(){
        Assert.assertEquals(new Book("Java Top",
                "Александр Чемпеонович", 2023), BOOK_WITH_AlL_PARAMETERS);
    }


}
