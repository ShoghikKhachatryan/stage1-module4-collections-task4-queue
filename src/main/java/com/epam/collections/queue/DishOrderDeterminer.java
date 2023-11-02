package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayDeque<Integer> dishes = new ArrayDeque<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }

        List<Integer> result = new ArrayList<>();

        int i = 1;
        while (!dishes.isEmpty()) {
            if (i % everyDishNumberToEat == 0) {
                result.add(dishes.poll());
            } else {
                dishes.add(dishes.poll());
            }
            i++;
        }

        return result;
    }
}
