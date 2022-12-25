import com.bridgelabz.MoodAnalyser;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
public class MoodAnalyserTest {
    /*
    Refactor Method->MoodAnalyser will have 2 Constructors –
                     Default - MoodAnalyser() and with
                     Parameters – MoodAnalyser(message)
     */
    @Test
    public void moodReturnSad() {
        MoodAnalyser analyse = new MoodAnalyser("I am in SAD Mood");
        String moodAnalyser = analyse.analyseMood();
        assertSame("SAD", moodAnalyser);
    }
    @Test
    public void moodShouldReturnHappy(){
        MoodAnalyser analyse = new MoodAnalyser("I am in Any Mood");
        String moodAnalyser = analyse.analyseMood();
        assertSame("HAPPY",moodAnalyser);
    }
}