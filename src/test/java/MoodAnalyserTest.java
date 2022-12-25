import com.bridgelabz.MoodAnalyser;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
public class MoodAnalyserTest {
    @Test
    public void moodReturnSad() {
        MoodAnalyser analyse = new MoodAnalyser();
        String moodAnalyser = analyse.analyseMood("I am in SAD Mood");
        assertSame("SAD", moodAnalyser);
    }
    @Test
    public void moodShouldReturnHappy(){
        MoodAnalyser analyse = new MoodAnalyser();
        String moodAnalyser = analyse.analyseMood("I am in any Mood");
        assertSame("HAPPY",moodAnalyser);
    }
}