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
    public void j2Marque15()
    {
        tennis.ajouterUnPoint("j2");
        String actual = tennis.getScoreJ2();
        String expected = "15";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void j1Marque1Point()
    {
        for(int i =0; i <=1; i++) {
            tennis.ajouterUnPoint("j1");
        }
        String actual = tennis.getScoreJ1();
        String expected = "30";

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void j1GagneJeuAvecJ2SansPoints()
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
        for(int i=0; i<=3; i++)
        {
            tennis.ajouterUnPoint("j1");
            tennis.ajouterUnPoint("j2");
        }

        String actual = tennis.getScoreJ1();
        String expected = "40A";

        Assert.assertEquals(expected, actual);
    }
}
