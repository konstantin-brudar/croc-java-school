package task_k_2.domain;

import java.time.Instant;

public class Ticket {
    private String id;
    private Instant issueTime;
    private Instant estimatedWindowTime;
    private Category category;
    private Window window;
}
