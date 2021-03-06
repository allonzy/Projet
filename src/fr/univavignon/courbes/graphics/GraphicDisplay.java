package fr.univavignon.courbes.graphics;

import java.util.List;

import javax.swing.JPanel;

import fr.univavignon.courbes.common.Board;
import fr.univavignon.courbes.common.Profile;

/**
 * Ensemble de méthodes permettant à l'Interface Utilisateur de 
 * demander au Moteur Graphique de rafraichir l'affichage du jeu.
 * <br/>
 * Chaque binôme de la composante Moteur Graphique doit définir une classe
 * implémentant cette interface, qui sera instanciée par l'Interface Utilisateur. 
 */
public interface GraphicDisplay
{	
	/**
	 * Cette méthode doit être appelée par l'Interface Utilisateur
	 * au début de chaque manche.
	 * <br/>
	 * Le Moteur Graphique doit s'initialiser et stocker l'aire de
	 * jeu passée en paramètre qui sera utilisée à chaque iteration.
	 * Le paramètre {@code pointThreshold} représente la limite de
	 * point à atteindre pour remporter la partie courante, telle
	 * qu'elle est définie au début de la partie (la valeur peut
	 * changer au fil des manches, en fonction de l'évolution des
	 * scores). La liste des joueurs impliqués dans la partie est
	 * nécessaire pour afficher leurs noms.
	 * 
	 * @param board
	 * 		Aire de jeu, préalablement initialisée.
	 * @param pointThreshold
	 * 		Limite de points initiale pour cette manche.
	 * @param players
	 * 		Liste des joueurs impliqués dans la manche.
	 * @param boardPanel
	 * 		Panel graphique utilisé comme support pour dessiner l'aire de jeu.
	 * @param scorePanel
	 * 		Panel graphique utilisé comme support pour dessiner les scores 
	 * 		de la partie en cours.
	 */
	public void init(Board board, int pointThreshold, List<Profile> players, JPanel boardPanel, JPanel scorePanel);
	
	/**
	 * Cette méthode doit être appelée par l'Interface Utilisateur
	 * à chaque itération d'une manche. Elle raffraichit la représentation
	 * graphique du jeu.
	 */
	public void update();
	
	/**
	 * L’Interface Utilisateur invoque cette fonction à la fin de la manche,
	 * pour demander l'affichage de son gagnant. Si la partie est terminée,
	 * il faut plutot afficher le classement final et les scores définitifs.
	 */
	public void end();
};
