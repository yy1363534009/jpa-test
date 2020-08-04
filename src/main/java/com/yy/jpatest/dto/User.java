package com.yy.jpatest.dto;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @Auther: yuyue
 * @create 2020/8/3 12:25
 */
@Entity
@Table(name = "t_user")
public class User {

    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid")
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name = "expiration_date")
    private Date expirationDate;

    @Column(name = "update_date")
    private Date updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
