package com.homework20.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class Students {

    @Id
    @GeneratedValue
    @Column(name = "idStudent")
    private Integer idStudent;

    @Column(name = "name_stud")
    private String nameStudent;

    @Column(name = "idGroup")
    private Integer idGroup;

    @Column(name = "year_admis")
    private Integer yearAdmission;


}
