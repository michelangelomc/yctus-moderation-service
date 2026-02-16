package br.com.yctus.api.moderation.comments.application.usecases;

import br.com.yctus.api.moderation.comments.domain.entities.response.ModerationResponse;
import br.com.yctus.api.moderation.comments.domain.entities.resquest.ModerationRequest;

public interface ModerationUseCase {
        ModerationResponse verifyComments(ModerationRequest comments);
}
