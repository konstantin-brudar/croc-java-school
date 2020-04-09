package task_k_2;

import java.util.List;

import task_k_2.domain.Category;
import task_k_2.domain.CategoryQueue;
import task_k_2.domain.Ticket;
import task_k_2.domain.Window;

public class Controller {
    private List<CategoryQueue> queues;

    /**
     * 1. Select from queues by category
     * 2. Create new queue if not found
     * 3. Create ticket
     * 4. Add to queue
     */
    public Ticket nextTicket(Category category) {
        return null;
    }

    /**
     * Return all ticket from all queues
     */
    public List<Ticket> getActiveTickets() {
        return null;
    }

    /**
     * 1. Remove completed ticket
     * 2. Select queues for window
     * 3. Select ticket
     * 4. Set ticket.window
     */
    public Ticket callNext(Window window) {
        return null;
    }
}
