package br.com.yctus.api.moderation.comments.domain.entities.model;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ModerationService {

    @Id
    @AttributeOverride(name = "id", column = @Column(name = "id", columnDefinition = "VARCHAR(MAX)"))
    private ModerationServiceId id;
    private String commentDeniedReason;
}
