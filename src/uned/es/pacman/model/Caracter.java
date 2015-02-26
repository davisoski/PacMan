package uned.es.pacman.model;



/*
 * 
 * 
 Contains properties such as: player position, player current velocity
 (in X / Y axes), etc.
 Contains methods that execute domain logic on a player, such as run,
 walk, jump, etc.
 Contains a method called update that is executed in a main game
 loop and is responsible for updating a player model in time.
 */

public interface Caracter {

	
	 void moveUp();
	 void moveDown();
	 void moveLeft();
	 void moveRight();

}
