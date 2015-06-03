import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by hugo on 21/05/15.
 */
public class testTennis {

    Tennis tennis;


    @Before
    public void initTennis()
    {
        tennis = new Tennis();
    }

    @Test
    public void afficherScoreDebut()
    {
        String actual = tennis.getScore();
        String expected = "0-0";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void j1Marque15()
    {
        tennis.ajouterUnPoint("j1");
        String actual = tennis.getScoreJ1();
        String expected = "15";

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void j1Marque30Point()
    {
        for(int i =0; i <=1; i++) {
            tennis.ajouterUnPoint("j1");
        }
        String actual = tennis.getScoreJ1();
        String expected = "30";

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void j1GagneJeuAvecJ2SansPoint()
    {
        for(int i=0; i<=3; i++)
        {
            tennis.ajouterUnPoint("j1");
        }

        String actual = tennis.getScoreJ1();
        String expected = "0";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void j1PrendAvantage()
    {
        for(int i=0; i<=2; i++)
        {
            tennis.ajouterUnPoint("j1");
            tennis.ajouterUnPoint("j2");
        }

        tennis.ajouterUnPoint("j1");

        String actual = tennis.getScoreJ1();
        String expected = "40A";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void j2RevientAEgalite()
    {
        for(int i=0; i<= 3; i++)
        {
            tennis.ajouterUnPoint("j1");
            tennis.ajouterUnPoint("j2");
        }

        String actual = tennis.getScore();
        String expected = "40-40";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void j1GagneApresEgalite()
    {
        for(int i=0; i<= 3; i++)
        {
            tennis.ajouterUnPoint("j1");
            tennis.ajouterUnPoint("j2");
        }

        tennis.ajouterUnPoint("j1");
        tennis.ajouterUnPoint("j1");

        String actual = tennis.getScore();
        String expected = "0-0";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void afficheGagnant()
    {
        for(int i = 0; i <= 4; i++)
        {
            tennis.ajouterUnPoint("j1");
        }

        String actual = tennis.getGagnant();
        String expected = "j1";
        Assert.assertEquals(expected, actual);
    }



}
