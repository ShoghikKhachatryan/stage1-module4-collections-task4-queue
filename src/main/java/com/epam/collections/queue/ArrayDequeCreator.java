package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>(firstQueue.size() + secondQueue.size());

        result.add(Objects.requireNonNull(firstQueue.poll()));
        result.add(Objects.requireNonNull(firstQueue.poll()));
        result.add(Objects.requireNonNull(secondQueue.poll()));
        result.add(Objects.requireNonNull(secondQueue.poll()));

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {

            firstQueue.add(result.pollLast());
            result.add(Objects.requireNonNull(firstQueue.poll()));
            result.add(Objects.requireNonNull(firstQueue.poll()));

            secondQueue.add(result.pollLast());
            result.add(Objects.requireNonNull(secondQueue.poll()));
            result.add(Objects.requireNonNull(secondQueue.poll()));
        }

        return result;
    }
}
