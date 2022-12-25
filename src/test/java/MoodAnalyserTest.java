import com.bridgelabz.MoodAnalyser;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
public class MoodAnalyserTest {
    @Test
    public void moodAnalyser() {
        MoodAnalyser analyse = new MoodAnalyser("I am in sad mood");
        String mood = analyse.analyseMood();
        assertSame("SAD", mood);
    }
}