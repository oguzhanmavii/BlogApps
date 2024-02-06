package oguzhan.mavi.BlogApps.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public Post(){
        this.timestamp=new Date();
    }
    public Post(String title, String content, Date timestamp) {
        this.title = title;
        this.content = content;
        this.timestamp = timestamp;
    }

    // Getter and Setter Methods
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

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
