package theme1.expertsSurvey.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "assigned_survey")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssignedSurvey {
    @EmbeddedId
    private AssignedSurveyId id;

    @ManyToOne
    @MapsId("surveyId")
    private Survey survey;

    @ManyToOne
    @MapsId("userId")
    private User user;
}

