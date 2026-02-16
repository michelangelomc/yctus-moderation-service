package br.com.yctus.api.moderation.comments.domain.entities.resquest;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ModerationRequest {

    @NotEmpty(message = "Preenchimento Obrigatório")
    private String postId;

    @NotBlank(message = "Preenchimento Obrigatório")
    @Size(min = 5, max = 100, message = "O tamanho deve ser entre 5 e 100 caracteres.")
    private String comments;
}
