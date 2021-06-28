package ru.netology.manager;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.ru.netology.repository.ProductRepository;

@Data
@RequiredArgsConstructor

public class ProductManager {
    private ProductRepository repo = new ProductRepository();

    public void save(Product product) {
        repo.save(product);
    }

    public void removeById(int id) {
        repo.removeByID(id);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product item : repo.findAll()) {
            if (matches(item, text)) {
                Product[] tmp = new Product[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);// используйте System.arraycopy, чтобы скопировать всё из result в tmp
                tmp[tmp.length - 1] = item;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Product product, String search) {
        if (product instanceof Book) { // если в параметре product лежит объект класса Book
            Book book = (Book) product; // положем его в переменную типа Book чтобы пользоваться методами класса Book
            if (((Book) product).getAuthorName().contains(search)) { // проверим есть ли поисковое слово в данных об авторе
                return true;
            }
            if (product.getName().contains(search)) {
                return true;
            }
            return false;
        }
        if (product instanceof Smartphone) { // если в параметре product лежит объект класса Book
            Smartphone smartphone = (Smartphone) product; // положем его в переменную типа Book чтобы пользоваться методами класса Book
            if (((Smartphone) product).getManufacturer().contains(search)) { // проверим есть ли поисковое слово в данных об авторе
                return true;
            }
            if (product.getName().contains(search)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
