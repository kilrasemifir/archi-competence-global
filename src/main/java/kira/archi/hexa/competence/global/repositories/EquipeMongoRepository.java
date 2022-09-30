package kira.archi.hexa.competence.global.repositories;

import kira.archi.hexa.competence.global.repositories.mongo.EquipeDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EquipeMongoRepository extends MongoRepository<EquipeDocument, String> {
}
