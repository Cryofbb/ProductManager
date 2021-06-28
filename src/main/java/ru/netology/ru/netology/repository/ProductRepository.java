package ru.netology.ru.netology.repository;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import ru.netology.domain.Product;

@RequiredArgsConstructor

public class ProductRepository {
    private Product[] items = new Product[0];

    public void save(Product item) {
        int length = items.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Product[] findAll() {
        return items;
    }
}
