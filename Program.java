import java.util.*;


class Bowling{
    HashMap <String, Integer> players;
 
    Bowling(){
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p){
        players.put(name, p);
    }

    public void getWinner(){

        List<Integer> scores = new ArrayList<Integer>();

        //add points to scores array
        players.forEach((name, points)-> scores.add(points));

        int highestScore = Collections.max(scores);

        // check the highest score and print winner

        players.forEach((name, points)->{
            if(points == highestScore){
                System.out.println(name + " " + points);
            }
        });
    }
}

public class Program {
    public static void main(String[] args){
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);
System.out.println("------------Iterating by passing lambda expression---------------");  
        for (int i=0; i<3; i++){
            System.out.println("Enter Name and Points separated by space");
            String input =sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);

            game.addPlayer(name, points);
        }
System.out.println("------------Iterating by passing passed---------------");  
        game.getWinner();

   }
}


