import java.util.HashSet;

public class ExL6005 {
    public static void main(String[] args) {
        
        HashSet<String> festa = new HashSet<String>();

        festa.add("Gabriel");
        festa.add("Jose");
        festa.add("Maria");
        festa.add("Caio");
        festa.add("Ana");

        if (festa.contains("Maria")){
            System.out.println("Maria vai a festa!");
        } else{
            System.out.println("Maria não vai a festa!");
        }

    }
}