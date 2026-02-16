package br.com.yctus.api.moderation.comments.domain.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModerationResponse {

    @JsonProperty("isApproved")
    private boolean isApproved;

    @JsonProperty("reasonDescription")
    private String reasonDescription;
}
