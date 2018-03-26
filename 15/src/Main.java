
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(wordSplitter("ImTung"));
        }

    private static List<String> wordSplitter(String string) {
        int partitionSize = 2;
        List<String> parts = new ArrayList<String>();
        int length = string.length();
        for (int i=0; i<length; i+=partitionSize)
        {
            parts.add(string.substring(i, Math.min(length, i + partitionSize)));
        }
        return parts;
    }
}

