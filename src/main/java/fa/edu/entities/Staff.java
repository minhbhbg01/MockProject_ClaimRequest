package fa.edu.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    private Integer id;
    private String name;
    private String rank;
    private Double Salary;
    private String department;
    private String password;
    private RoleEnum roleEnum = RoleEnum.ROLE_STAFF;
    @OneToMany(mappedBy = "staff")
    private List<ClaimRequest> claimRequests = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
}
