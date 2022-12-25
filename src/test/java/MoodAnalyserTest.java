import com.bridgelabz.MoodAnalyser;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
public class MoodAnalyserTest {
    @Test
    public void moodReturnSad() {
        MoodAnalyser analyse = new MoodAnalyser("I am in sad Mood");
        String moodAnalyser = analyse.analyseMood();
        assertSame("SAD", moodAnalyser);
    }
}