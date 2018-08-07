package com.duyminh.core.persistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name ="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name="name")
    private  String name;

    @Column(name="password")
    private String password;

    @Column(name="fullname")
    private  String fullname;

    @Column(name="createdate")
    private Timestamp createDate;

    @ManyToOne
    @JoinColumn(name ="roleid")
    private Role role;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Comment> commentList;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }
}
