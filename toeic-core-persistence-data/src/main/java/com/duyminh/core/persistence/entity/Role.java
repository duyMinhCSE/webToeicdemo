package com.duyminh.core.persistence.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="role")
public class Role {

    @Id
    @Column(name = "roleid")
    private Integer roleId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private List<User> userLisr;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUserLisr() {
        return userLisr;
    }

    public void setUserLisr(List<User> userLisr) {
        this.userLisr = userLisr;
    }
}
