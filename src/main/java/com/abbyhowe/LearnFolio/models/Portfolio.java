package com.abbyhowe.LearnFolio.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "portfolio")
public class Portfolio {

    private static final long serialVersionUID = -8885466378515990394L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "portfolio_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @Column(name = "portfolioDateCreated")
    private Date dateCreated;
    @Column(name = "portfolioDateUpdated")
    private Date dateUpdated;

}
