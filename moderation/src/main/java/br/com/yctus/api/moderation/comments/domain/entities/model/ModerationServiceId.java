package br.com.yctus.api.moderation.comments.domain.entities.model;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.UUID;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ModerationServiceId {
    private UUID id;

    public ModerationServiceId(UUID id) {
        Objects.requireNonNull(id);
        this.id = id;
    }

    public ModerationServiceId(String id) {
        Objects.requireNonNull(id);
        this.id = UUID.fromString(id);
    }

    public ModerationServiceId(Long id) {
        Objects.requireNonNull(id);
        this.id = new UUID(id, id);
    }
}
