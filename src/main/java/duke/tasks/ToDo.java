package duke.tasks;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * This is the ToDo task class to represent events passed to Duke.
 * Encapsulates all information related to the todo.
 */
public class ToDo extends Task {
    /**
     * Creates a new ToDo object.
     * @param description String description of the ToDo represented.
     */
    public ToDo(String description) {
        super(description);
    }

    /**
     * {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    @Override
    public boolean isToBeReminded(int days) {
        return !isDone;
    }

}
