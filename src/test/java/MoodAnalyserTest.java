import com.bridgelabz.MoodAnalyser;
import org.testng.Assert;
import org.testng.annotations.Test;
public class MoodAnalyserTest {
    @Test
    public void moodReturnSad() {
        MoodAnalyser analyse = new MoodAnalyser("I am in sad Mood");
        String moodAnalyser = analyse.analyseMood();
        Assert.assertEquals("SAD", moodAnalyser);
    }
    @Test
    public void moodReturnHappy(){
        MoodAnalyser analyse = new MoodAnalyser("I am in any mood");
        String moodAnalyser = analyse.analyseMood();
        System.out.println(moodAnalyser);
    }
}