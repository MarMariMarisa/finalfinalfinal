package practicum.madlibs;

import java.io.File;

/**
 * A simple test that verifies that the provided Mad-Libs story files are
 * present in the expected location.
 */
public class FileTest {
    public static void main(String[] args) {
        for(String filename : MadLibsUtil.STORY_FILES) {
            File file = new File(filename);
            System.out.println(file.getAbsolutePath() + ": " 
                + (file.exists() ? file.length() + " bytes" : "not found"));
        }
    }
}
