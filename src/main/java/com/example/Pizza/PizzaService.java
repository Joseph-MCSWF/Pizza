package com.example.Pizza;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PizzaService {
    private final Map<Long, Pizza> pizzaMap = new ConcurrentHashMap<>();

    public Pizza createPizza(Pizza pizza) {
        pizzaMap.put(pizza.getId(), pizza);
        return pizza;
    }

    public Pizza getPizza(Long id) {
        return pizzaMap.get(id);
    }
}
