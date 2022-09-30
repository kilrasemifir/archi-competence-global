package kira.archi.hexa.competence.global.hexa.equipes.ports.output;

import kira.archi.hexa.competence.global.hexa.equipes.entities.Equipe;

import java.util.List;

public interface EquipeOutputPort {

    List<Equipe> recupererEquipes();

    Equipe recupererEquipe(String id);
    /**
     * Sauvegarde une équipe
     * @param equipe    l'équipe à sauvegarder
     * @return          l'équipe sauvegardée
     */
    Equipe sauvegarderEquipe(Equipe equipe);
}
