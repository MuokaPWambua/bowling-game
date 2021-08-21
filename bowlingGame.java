import java.util.*

public class Bowling{
    HashMap <String, Integer> players;
 
    Bowling(){
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p){
        players.put(name, p);
    }

    public void getWinner{

        ArrayList<Integer> scores = new ArrayList<Integer>(3);

        //add points to scores array

        players.forEach(name, points){
            scores.add(points);
        }

        // check the highest score and print winner

        int highestScore = Collections.max(scores);

        players.forEach(name, points){
            if(points == highestScore){
                System.out.println(name + " " + points);
                break;
            }
        }


    }
}

public class Program {
    public static void main(String[], args){
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<3; i++){
            String input =sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);

            game.addPlayer(name, points)
        }

        game.getWinner()

        }
    }
}

