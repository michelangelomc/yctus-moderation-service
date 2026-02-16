package br.com.yctus.api.moderation.comments.infraestructure.dataproviders;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Getter
@NoArgsConstructor
public class WordsBanned {

    public List<String> getBanneds() {
        return Arrays.asList("porcaria", "maldito", "amaldiçoado", "desgraçado",
                "cretino", "idiota", "imbecil", "babaca");
    }
}
