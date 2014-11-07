//Choose Your Own adventure game
//~Deh

import java.util.*;

public class ChooseYourOwn{

	//global variables for the class
	//each represents different choices
	private String choice = "";
	private int survival_skills = 5, bravery = 5, weapon_skills = 5;
	private boolean bloodynose = false, bitten = false, supplies = false;
	Scanner scan = new Scanner(System.in);
	
	public void cut(){
		choice = choice.trim();
		//trim spaces
	}
	
	public void game(){
		//call different scene methods
		sceneOne();
		sceneTwo();
		sceneThree();
	}

	public void sceneOne(){
		System.out.println("The night is dark. The city streets ring with the roar of the zombie horde. You are one of the few humans remaining, " +
		"hiding within the city.\nDo you head OUTSIDE to search for supplies, or WAIT until morning?");
		
		choice = scan.nextLine();
		cut();
		
		if(choice.equalsIgnoreCase("OUTSIDE")){
			System.out.println("You decide to head out into the night. Oops! The door is barricaded. You learn this as you walk into the unmovable door \n" +
			"(You now have a bloody nose).");
			bloodynose = true;
		}
		else if(choice.equalsIgnoreCase("WAIT")){
			System.out.println("You decide to wait until daybreak (+1 to survival skills).");
			survival_skills += 1;
		}
		else{
			System.out.println("You stand indecsively as you hear a scream from the other room.");
		}
	}
	
	public void sceneTwo(){
		if(choice.equalsIgnoreCase("OUTSIDE")){
			System.out.println("Maybe you could SEARCH nearby for supplies the others may have overlooked?");
		}
		else if(choice.equalsIgnoreCase("WAIT")){
			System.out.println("Suddenly, you hear a cry from one of the other humans.\n" +
			"Do you HIDE, INVESTIGATE, or since you have become better at survival, do you wish to ready yourself for a SNEAK attack on a possible zombie?");
		}
		else{
			System.out.println("Do you HIDE or INVESTIGATE the noise?");
		}
		
		choice = scan.nextLine();
		cut();
		
		if(choice.equalsIgnoreCase("HIDE")){
			System.out.println("You decide to hide, like a little girl (-1 to bravery).");
			bravery -= 1;
		}
		else if(choice.equalsIgnoreCase("SEARCH")){
			System.out.println("You decide to search for overlooked supplies. You find several cans of beans, some  rifle ammo, and a first-aid kit! Lucky you.");
			supplies = true;
		}
		else if(choice.equalsIgnoreCase("INVESTIGATE")){
			System.out.println("You decide to help your fellow human (+1 to bravery).");
			bravery += 1;
		}
		else if(choice.equalsIgnoreCase("SNEAK")){
			System.out.println("You decide to ready yourself for a sneak attack (+1 to survival skills).");
			survival_skills += 1;
		}
		else{
			System.out.println("In your indecision, a passing zombie sneaks up on you and bites you.");
			bitten = true;
		}
	}
	
	public void sceneThree(){
		if(choice.equalsIgnoreCase("HIDE") && bloodynose == false){
			System.out.println("Unfortunately, this is clearly not your day. A small group of " +
			"zombies happens upon \nyou in your corner. Will you defend yourself with your trusty SHOTGUN, your KNIFE, or ASSUME the fetal position and" +
			" hope for the best?");
		}
		else if(choice.equalsIgnoreCase("HIDE") && bloodynose == true){
			System.out.println("Unfortunately, this is clearly not your day. A whole horde of zombies happens upon \n" +
			"you in your corner, attracted by the scent of your blood. Will you defend yourself with your trusty SHOTGUN, \n" +
			"your KNIFE, or ASSUME the fetal position and hope for the best?");
		}
		else if(choice.equalsIgnoreCase("INVESTIGATE")){
			System.out.println("As you head into the adjacent room, a zombie leaps at you.\nWill you defend" +
			" yourself with your trusty SHOTGUN, your KNIFE, or ASSUME the fetal position and hope for the best?");
		}
		else if(choice.equalsIgnoreCase("SNEAK")){
			System.out.println("You hold up the butt of your shotgun, ready for anything. As a zombie rounds the corner,\n" +
			" you successfully take him out. However, there is another zombie in the room. Unfortunately, that last\n" +
			" attack ruined the firing mechanism on the gun. Do you defend yourself with your trusty KNIFE or ASSUME\n" +
			" the position and hope for the best?");
		}
		else if(bitten == true){
			System.out.println("With impending death by zombie, will you defend yourself with your trusty SHOTGUN or your KNIFE?");
		}
		
		choice = scan.nextLine();
		cut();
			
		if(choice.equalsIgnoreCase("SHOTGUN") && bitten == false){
			System.out.println("You go for your trusty shotgun. You scream 'BOOM! HEADSHOT!' as you kill the lone zombie (+1 to weapon skills). Good for you!");
			
			if(survival_skills < 6) 
				System.out.println("Well.Bad for you, since the noise has attracted the notice of a whole horde of zombies. Better get running...");
		}
		else if(choice.equalsIgnoreCase("KNIFE") && bitten == false){
			System.out.println("You go for your trusty knife. As you do so, one of the other fellow humans does the same. 'Thats not a knife!' he declares.\n" +
			"'That's a...' Unluckily, the zombie uses this opportune monologe to eat his brains. You manage to run away and feel fortunate that it wasn't you\n" +
			" (-1 to weapon skills).");
			weapon_skills -= 1;
			
			if(supplies = true)
				System.out.println("You manage to escape the city and survive on the scant supplies you found until you reach another city.");
			else
				System.out.println("You manage to escape the city, but unfortunately die from starvation before you find another city.");
		}
		else if(choice.equalsIgnoreCase("ASSUME") && bitten == false){
			System.out.println("You hope for the best. Unfortunately, in this case, the best is life (or death?) as a zombie.");
			
			if(bravery > 5)
				System.out.println("But wait! Today is your day! A bear comes in and massacres the zombies! Hooray!");
		}
		else if(bitten = true){
			if(choice.equalsIgnoreCase("SHOTGUN"))
				System.out.println("You shoot the zombie with your shotgun. Unfortunately, you will turn into one as well, if a cure isn't found soon.");
			else if(choice.equalsIgnoreCase("KNIFE"))
				System.out.println("You try to stab the zombie but miss. The zombie devours your brains.");
		}
		else{
			System.out.println("In your indecision, the zombies devour your brains...");
		}
		
		System.out.println("THE END (or is it?)");
	}
}