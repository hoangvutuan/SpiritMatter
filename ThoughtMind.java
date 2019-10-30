import java.util.Set;
import java.util.HashSet;

public class ThoughtMind {
    public static class Thought {

    }

    public static class Mind {
        Set<String> thoughts = new HashSet<>();
        public Mind(String[] arr) {
            for (String str : arr) {
                thoughts.add(str);
            }
        }
    }

    public static void main(String[] args) {

    }
}
