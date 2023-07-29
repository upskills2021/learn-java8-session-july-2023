package org.example.java8.defaultexamples;

import java.util.List;
import java.util.Optional;

public interface Executor {
    static Optional<Task> getTask(Activity activity) {
        switch (activity) {
            case SUM:
                return Optional.of(new SumImpl());

            case MULTIPLY:
                return Optional.of(new MultiplierImpl());
            default:
                return Optional.empty();
        }
    }
     static void perform(Activity activity, List<Integer> numbers) {
        Optional<Task> optionalTask = getTask(activity);
        if(optionalTask.isEmpty()) {
            System.out.println("Task not defined...");
        }
        optionalTask.ifPresent(task -> System.out.printf("Activity ::{%s} Result of Task :: {%s}\n", activity.name() ,task.performTask(numbers)));
    }
}
