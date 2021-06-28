package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private Book book =  new Book();


    @Test
    public void shouldSaveOne(){
        repository.save(book);

        Product[] expected = new Product[]{book};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
        }
}
