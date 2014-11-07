import java.util.Scanner;
public class part_2
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System. in );
        String answer;

        while (true)
        {
            System.out.println("There are so many zombies following you. You have many weapons in your car. Which\n one do you use? Do you use the Sniper rifle(s), machine gun(m) or the rpg(r)?");
            answer = input.nextLine();
            if (answer.contains("s") || answer.contains("m") || answer.contains("r"))
            {
                if (answer.contains("s"))
                {
                    System.out.println("You decide to pull out your trusty Sniper. You quickly pick off 5 zombies but you need\n" +
                        "to reload. So you run off into the forest.");
                }
                else if (answer.contains("m"))
                {
                    System.out.println("You take out your machine gun and mow down the zombies. So you run off into the forest.");
                }
                else if (answer.contains("r"))
                {
                    System.out.println("You pull out your rpg and blow 15 zombies to bits. You hear more in the distance\n" +
                        "so you run off into the forest.");
                }

                System.out.println("You walk into the forest and spot a cave. Do you go into the cave(c) or search for food(f)?");

                answer = input.nextLine();

                if (answer.contains("c"))
                {
                    System.out.println("You go into the cave and you set up a tiny camp.");

                    System.out.println("You are all set up in your cave and you are tired but hungry. do you sleep(s) or\n" +
                        "search for food(f)");
                    answer = input.nextLine();

                    if (answer.contains("s"))
                    {
                        System.out.println("You are feeling really drowsy. So drowsy you could... ZZZZZZZZZZ");
                        break;
                        //Put Part 3 Here
                        //
                        //
                        //
                        //
                        //
                        //
                        //
                        //
                        //
                        //
                        //
                        //
                        //
                        //
                    }
                    else if (answer.contains("f"))
                    {
                        System.out.println("You walk into the woods and you see a bush full of berries.\n" +
                            "but then you hear growls. and then you get eaten by zombies.");
                        System.out.println("\nHit (y) to try again or (n) to leave?");

                        answer = input.nextLine();
                        if (answer.contains("n"))
                        {
                            break;
                        }
                    }
                }

                else if (answer.contains("f"))
                {
                    System.out.println("You walk into the woods and you see a bush full of berries.\n" +
                        "but then you hear growls. and then you get eaten by zombies.");
                    System.out.println("\nHit (y) to try again or (n) to leave?");

                    answer = input.nextLine();
                    if (answer.contains("n"))
                    {
                        break;
                    }
                }
                else
                {
                    System.out.println("Im sorry but that is not a valid answer please try again.");
                    System.out.println("\nHit (y) to try again or (n) to leave?");

                    answer = input.nextLine();
                    if (answer.contains("n"))
                    {
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Im sorry but that is not a valid answer please try again.");
                System.out.println("\nHit (y) to try again or (n) to leave?");

                answer = input.nextLine();
                if (answer.contains("n"))
                {
                    break;
                }
            }
        }
    }
}