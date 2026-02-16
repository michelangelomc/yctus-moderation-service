package br.com.yctus.api.moderation.comments.infraestructure.dataproviders.repository;

import br.com.yctus.api.moderation.comments.domain.entities.model.ModerationService;
import br.com.yctus.api.moderation.comments.domain.entities.model.ModerationServiceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModerationRepository extends JpaRepository<ModerationService, ModerationServiceId> {

}