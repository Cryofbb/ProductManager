package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    @Test
    public void shouldHaveMethods(){
        Book book = new Book();
    }
    @Test
    public void shouldHaveAllFromSuper(){
        Book book1 = new Book(123,"Name",214,"Auth");
        Book book2 = new Book(123,"Name",214,"Auth");
        assertEquals(book1, book2);
    }
}
