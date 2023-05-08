package practicum.madlibs;

import java.util.HashMap;
import java.util.Map;

/**
 * A utility class used in the MadLibs problem.
 */
public class MadLibsUtil {
    /**
     * A series of story files that contain blanks of various types that will 
     * need to be filled in to complete each story.
     */
    public static final String[] STORY_FILES = {
        "data/short_example.txt",
        "data/star_wars.txt",
        "data/marvel.txt",
        "data/goats_vs_trolls.txt"
    };

    /**
     * A selection of possible nouns used to fill in noun blanks.
     */
    public static final String[] NOUNS = {
        "APPLE","ARITHMETIC","BADGE", "BALLOON","BASKET","BASKETBALL",
        "BATHTUB","BATTLE","BEAST","BEETLE","BEGGAR","BRAIN","BUBBLE","BUCKET",
        "CACTUS","CANNON","CELERY","CELLAR","CLOTH","COACH","COAST","COW",
        "CRATE","DONKEY","EARTHQUAKE","FEAST","FIFTH","FINGER","FLAMINGO",
        "FLOCK","FRAME","FURNITURE","GEESE","GHOST","GIRAFFE","GOVERNOR",
        "HONEY","HOPE","INCOME","ISLAND","JEANS","JUDGE","LAMP","LETTUCE",
        "LLAMA","MARBLE","MONTH","NOODLE","NOSE","OCEAN","PATCH","PLANE",
        "PLAYGROUND","POISON","RIDDLE","SCALE","SEASHORE","SIDEWALK",
        "SLEET","STAGE","STATION","TATER TOT","THRONE","TITLE","TOOTHBRUSH",
        "TURKEY","UMBRELLA","VACATION","VEGETABLE","VISITOR","VOYAGE","YEAR"
    };

    /**
     * A selection of possible verbs used to fill in verb blanks.
     */
    public static final String[] VERBS = {
        "ADD","ALLOW","BAKE","CALL","CHASE","DAMAGE","DROP","END","ESCAPE",
        "FASTEN","FIX","GATHER","GRAB","HANG","HUG","IMAGINE","ITCH","JOG",
        "JUMP","JUMP","KICK","KNIT","LAND","LOCK","MARCH","MIX","NAME",
        "NOTICE","OBEY","OPEN","PASS","PITCH","PROMISE","QUESTION","REACH",
        "RINSE","RUN","SCATTER","STAY","SWIM","TALK","TURN","UNTIE","USE",
        "VANISH","VISIT","WALK","WORK","YAWN","YELL"
    };

    /**
     * A selection of possible adjectives used to fill in adjective blanks.
     */
    public static final String[] ADJECTIVES = {
        "ABUNDANT","ADORABLE","AGREEABLE","ALIVE","ANGRY","BEAUTIFUL","BETTER",
        "BEWILDERED","BIG","BITTER","BLUE","BOILING","BRAVE","BREEZE",
        "DELIGHTFUL","DIRTY","DRAB","DRY","DUSTY","EAGER","EARLY","EASY",
        "ELEGANT","EMBARRASSED","EMPTY","FAINT","FAITHFUL","FAMOUS","FANCY",
        "HIGH","HOLLOW","HOT","HUGE","ICY","IMMENSE","IMPORTANT","INEXPENSIVE",
        "ITCHY","JEALOUS","JOLLY","JUICY","KIND","LARGE","NUTRITIOUS",
        "OBEDIENT","OBNOXIOUS","ODD","OLD-FASHIONED","ORANGE","PANICKY",
        "PETITE","PLAIN","POWERFUL","PRICKLY","PROUD","PUNY","PURPLE","PURRING",
        "SQUARE","STEEP","STICKY","STRONG","SUBSTANTIAL","SWEET","SWIFT","TALL",
        "TART","TASTELESS","TEENY","TEENY-TINY","TENDER","THANKFUL"
    };

    /**
     * A selection of possible names used to fill in name blanks.
     */
    public static final String[] NAMES = {
        "ARAGORN","ATTICUS FINCH","BRIDGET JONES","CLARICE STARLING",
        "DOROTHY GALE","DRACULA","DUMBLEDORE","EBENEEZER SCROOGE","ELLE WOODS",
        "FRODO BAGGINS","GANDALF","HANNIBAL LECTER","HARRY CALLAHAN ",
        "HERMIONE GRANGER","HOLDEN CAULFIELD","HOLLY GOLIGHTLY",
        "INDIANA JONES","JACK SPARROW","JAMES BOND","JAY GATSBY",
        "JOHN MCCLANE","KATARA","KATNISS EVERDEEN","LARA CROFT","LEGOLAS",
        "LISBETH SALANDER","LUKE SKYWALKER","MARLA SINGER","NEO",
        "OPTIMUS PRIME","PEETA MELLARK","PETER PARKER","PRESIDENT SNOW",
        "ROCKY BALBOA","RON WEASLEY","RUE","SCARLETT O'HARA","SEVERUS SNAPE",
        "SHERLOCK HOLMES","SHREK","THAT PERSON FROM THAT THING","TOM BRADY",
        "TONY STARK","TYLER DURDEN","VOLDEMORT","WALTER WHITE","WILLY WONKA",
        "WINNIE THE POOH","YODA","ZUKO"
    };

    /**
     * A selection of possible adverbs used to fill adverb blanks.
     */
    public static final String[] ADVERBS = {
        "ACTUALLY","ALMOST","ALWAYS","ANGRILY","ANNUALLY","ANXIOUSLY",
        "ARROGANTLY","AWKWARDLY","BADLY","BASHFULLY","BEAUTIFULLY","BLINDLY",
        "BOLDLY","BRAVELY","BRIEFLY","FAMOUSLY","FAR","FAST","FATALLY",
        "FEROCIOUSLY","FOOLISHLY","FORTUNATELY","FRANKLY","FRANTICALLY",
        "FREELY","FULLY","FURIOUSLY","GENERALLY","GENEROUSLY","GENTLY",
        "JAGGEDLY","JEALOUSLY","JOYFULLY","JUSTLY","KEENLY","KINDLY",
        "KNOWINGLY","LAZILY","LESS","LIGHTLY","LIKELY","LIMPLY","LIVELY",
        "LOOSELY","LOUDLY","PERFECTLY","PLAYFULLY","POLITELY","POORLY",
        "POSITIVELY","POWERFULLY","PROMPTLY","PROPERLY","QUICKER","QUICKLY",
        "QUIETLY","RAPIDLY","RARELY","READILY","REALLY","SMOOTHLY","SOFTLY",
        "SOLIDLY","SOMETIMES","SOON","SPEEDILY","STERNLY","STRICTLY",
        "SUCCESSFULLY","SUDDENLY","SURPRISINGLY","SUSPICIOUSLY","SWEETLY",
        "SWIFTLY","SYMPATHETICALLY"
    };


    /**
     * A map that can be used to easily retrieve the selection of possible 
     * words by type.
     */
    public static final Map<String,String[]> PLACEHOLDERS = new HashMap<>();

    // build the map of types
    static {
        PLACEHOLDERS.put("NOUN",MadLibsUtil.NOUNS);
        PLACEHOLDERS.put("VERB",MadLibsUtil.VERBS);
        PLACEHOLDERS.put("ADJECTIVE",MadLibsUtil.ADJECTIVES);
        PLACEHOLDERS.put("NAME",MadLibsUtil.NAMES);
        PLACEHOLDERS.put("ADVERB",MadLibsUtil.ADVERBS);
    }
}
