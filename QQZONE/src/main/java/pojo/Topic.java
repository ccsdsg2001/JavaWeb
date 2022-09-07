package pojo;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author cc
 * @date 2022年09月05日 22:30
 */
public class Topic {
    private Integer id;
    private String title;
    private String content;
    private LocalDateTime topicDate;
    private UserBasic author;
    private List<Reply> replyList;

    public Topic() {
    }

    public Topic(Integer id, String title, String content, LocalDateTime topicDate, UserBasic author, List<Reply> replyList) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.topicDate = topicDate;
        this.author = author;
        this.replyList = replyList;
    }

    public Topic(Integer id) {

    }

    public List<Reply> getReplyList() {
        return replyList;
    }

    public void setReplyList(List<Reply> replyList) {
        this.replyList = replyList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public LocalDateTime getTopicDate() {
        return topicDate;
    }

    public void setTopicDate(LocalDateTime topicDate) {
        this.topicDate = topicDate;
    }

    public UserBasic getAuthor() {
        return author;
    }

    public void setAuthor(UserBasic author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", topicDate=" + topicDate +
                ", author=" + author +
                ", replyList=" + replyList +
                '}';
    }
}
