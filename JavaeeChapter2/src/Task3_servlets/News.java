package Task3_servlets;

public class News {
    Long id;
    String title;
    String content;
    String author;
    String category; //sport, culture или cinema

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public News() {
        this.id = 0L;
        this.title = "no title";
        this.content = "no content";
        this.author = "no author";
        this.category = "no category";
    }

    public News(Long id, String title, String content, String author, String category) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.category = category;
    }
    //sport, culture или cinema
}
