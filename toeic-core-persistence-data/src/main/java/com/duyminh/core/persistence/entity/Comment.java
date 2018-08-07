package com.duyminh.core.persistence.entity;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name ="comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @Column(name="content")
    private  String content;

    @Column(name="createdate")
    private Timestamp createDate;

    @ManyToOne
    @JoinColumn(name ="userid")
    private User user;

    @ManyToOne
    @JoinColumn(name ="listenguidelineid")
    private ListenGuideline listenGuideline;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ListenGuideline getListenGuideline() {
        return listenGuideline;
    }

    public void setListenGuideline(ListenGuideline listenGuideline) {
        this.listenGuideline = listenGuideline;
    }
}
