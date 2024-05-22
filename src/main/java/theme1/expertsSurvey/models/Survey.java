package theme1.expertsSurvey.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "survey")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @OneToMany(mappedBy = "survey", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> questions;

    public boolean isAvailableForAssignment() {
        LocalDate now = LocalDate.now();
        return (startDate != null && now.isAfter(startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate())) &&
                (endDate == null || now.isBefore(endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()));
    }
}
