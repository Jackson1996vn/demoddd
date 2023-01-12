package com.example.demoddd.infrastracture.repository.user;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {

    private Long id;
    private String name;
    private Integer age;
    private Boolean gender;

    public UserEntity() {

    }

    public UserEntity(Long id, String name, Integer age, Boolean gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(name = "gender")
    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}
