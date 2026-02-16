package br.com.yctus.api.moderation.comments.application.usecases.impl;

import br.com.yctus.api.moderation.comments.application.usecases.ModerationUseCase;
import br.com.yctus.api.moderation.comments.domain.entities.model.ModerationService;
import br.com.yctus.api.moderation.comments.domain.entities.model.ModerationServiceId;
import br.com.yctus.api.moderation.comments.domain.entities.response.ModerationResponse;
import br.com.yctus.api.moderation.comments.domain.entities.resquest.ModerationRequest;
import br.com.yctus.api.moderation.comments.infraestructure.dataproviders.WordsBanned;
import br.com.yctus.api.moderation.comments.infraestructure.dataproviders.repository.ModerationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class ModerationUseCaseImpl implements ModerationUseCase {

    private static String msgError = "Comentário contém palavras impróprias %s";
    private final ModerationRepository moderationRepository;

    @Override
    public ModerationResponse verifyComments(ModerationRequest comments) {
        WordsBanned banned = new WordsBanned();
        List<String> banneds = new ArrayList<>();

        banned.getBanneds().forEach(b -> {
            if (comments.getComments().contains(b)) {
                banneds.add(b);
            }
        });

        if (!banneds.isEmpty()) {
            ModerationService moderationService = ModerationService.builder()
                    .commentDeniedReason(comments.getComments())
                    .id(new ModerationServiceId(comments.getPostId()))
                    .build();

            moderationRepository.saveAndFlush(moderationService);

            return ModerationResponse.builder()
                    .isApproved(false)
                    .reasonDescription(String.format(msgError, banneds))
                    .build();
        }

        return ModerationResponse.builder()
                .isApproved(true)
                .reasonDescription(" - ")
                .build();
    }
}