package ru.netology;

import org.junit.jupiter.api.Test;

class ProductRepositoryTest {
    Product first = new Product(11231, "first", 500);
    Product second = new Product(11324, "second", 2300);
    Product third = new Product(21321, "third", 3200);

    @Test
    public void removeByIdNotFond() {
        ProductRepository repo = new ProductRepository();
        repo.save(first);
        repo.save(second);
        repo.save(third);

        repo.removeById(11111);
    }

    @Test
    public void removeById() {
        ProductRepository repo = new ProductRepository();
        repo.save(first);
        repo.save(second);
        repo.save(third);

        repo.removeById(11231);
    }
}