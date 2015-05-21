/**
 * Created by hugo on 21/05/15.
 */
public class Tennis {

    private int scoreJ1 = 0;
    private int scoreJ2 = 0;

    private String gagnant = null;

    public String getScore() {

        return convertScore(scoreJ1)+ "-" +convertScore(scoreJ2);
    }

    private String convertScore(int score) {
        switch (score){
            case  0:
                return "0";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            case 4:
                return "40A";
            default:
                return null;
        }
    }

    public void ajouterUnPoint(String joueur) {
        if(joueur == "j1")
        {
            scoreJ1++;
            if(scoreJ1 == 4 && scoreJ2 < 3)
            {
                scoreJ1 = 0;
                scoreJ2 = 0;
                gagnant = "j1";
            }
            else if(scoreJ1 == 4 && scoreJ2 == 4)
            {
                scoreJ1 = scoreJ2 = 3;

            }
            else if(scoreJ1 == 5)
            {
                scoreJ1 = 0;
                scoreJ2 = 0;
                gagnant ="j1";
            }
        }
        else if(joueur == "j2")
        {
            scoreJ2++;
            if(scoreJ2 == 4 && scoreJ1 < 3)
            {
                scoreJ1 = 0;
                scoreJ2 = 0;
                gagnant = "j2";
            }
            else if(scoreJ1 == 4 && scoreJ2 == 4)
            {
                scoreJ1 = scoreJ2 = 3;

            }
            else if(scoreJ2 == 5)
            {
                scoreJ1 = 0;
                scoreJ2 = 0;
                gagnant = "j2";
            }
        }
    }

    public String getScoreJ1() {

        return convertScore(scoreJ1);
    }

    public String getScoreJ2() {
        return convertScore(scoreJ2);
    }

    public String getGagnant() {
        return gagnant;
    }
}
