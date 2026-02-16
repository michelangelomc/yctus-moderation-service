package br.com.yctus.api.moderation.comments.domain.entities.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ModerationResponse {
    private boolean isApproved;
    private String reasonDescription;
}
