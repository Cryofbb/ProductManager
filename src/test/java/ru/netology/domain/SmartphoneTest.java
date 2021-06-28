package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmartphoneTest {

    @Test
    public void shouldHaveAllFromSuper(){
        Smartphone smartphone1 = new Smartphone(123,"Name",214,"Auth");
        Smartphone smartphone2 = new Smartphone(123,"Name",214,"Auth");
        assertEquals(smartphone1, smartphone2);
    }
}
