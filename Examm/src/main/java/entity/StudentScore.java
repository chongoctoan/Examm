package entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class StudentScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentScoreId;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Subject subject;

    private double score1;
    private double score2;
}

