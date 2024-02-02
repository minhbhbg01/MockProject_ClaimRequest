package fa.edu.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Integer id;
    private String nameProject;
    private String projectCode;
    private String duration;
    private Date startDate;
    private Date endDate;
    private String pm;
    private String qa;
    private String technicalLead;
    private String ba;
    private String developer;
    private String test;
    private String technicalConsultancy;
    private String finance;
}