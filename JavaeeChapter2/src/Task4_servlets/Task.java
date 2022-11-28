package Task4_servlets;

public class Task {
    private Long id;
    private String name;
    private String description;
    private String deadlineDate;
    private String performance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public Task() {
        this.id = 0l;
        this.name = "no name";
        this.description = "no description";
        this.deadlineDate = "no deadlineDate";
    }
    public Task(Long id, String name, String description, String deadlineDate, String performance) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadlineDate = deadlineDate;
        this.performance = performance;
    }
}
