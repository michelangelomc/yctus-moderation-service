package br.com.yctus.api.moderation.comments.api.controller;

import br.com.yctus.api.moderation.comments.application.usecases.ModerationUseCase;
import br.com.yctus.api.moderation.comments.domain.entities.response.ModerationResponse;
import br.com.yctus.api.moderation.comments.domain.entities.resquest.ModerationRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/moderation")
@AllArgsConstructor
public class ModerationController {

    private ModerationUseCase moderationUseCase;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ModerationResponse verifyComments(@RequestBody ModerationRequest moderationRequest){
        //Thread.sleep(6000);
        return moderationUseCase.verifyComments(moderationRequest);
    }
}
