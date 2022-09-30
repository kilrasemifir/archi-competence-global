package kira.archi.hexa.competence.global.hexa.equipes.ports.input;

import kira.archi.hexa.competence.global.hexa.equipes.entities.Equipe;
import kira.archi.hexa.competence.global.hexa.equipes.entities.Personne;

import java.util.List;

public interface EquipeInputPort {
    /**
     * Récupère la liste des équipes
     * @return  la liste des équipes
     */
    public List<Equipe> recupererEquipes();

    /**
     * Récupère une équipe par son identifiant
     * @param id    l'identifiant de l'équipe
     * @return      l'équipe
     */
    public Equipe recupererEquipe(String id);

    /**
     * Sauvegarde une équipe
     * @param equipe    l'équipe à sauvegarder
     * @return          l'équipe sauvegardée
     */
    Equipe sauvegarderEquipe(Equipe equipe);

    /**
     * Ajoute une personne à une équipe
     * @param idEquipe    l'équipe à laquelle ajouter la personne
     * @param personne  la personne à ajouter
     * @return          l'équipe avec la personne ajoutée
     */
    Equipe ajouterPersonneAEquipe(String idEquipe, Personne personne);
}

