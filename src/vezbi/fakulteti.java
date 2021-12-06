package vezbi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fakulteti {


    public static void main(String[] args) {
        List<String> elementi = new ArrayList<>();
        elementi.add("student");
        elementi.add("indeks");
        elementi.add("nasoka");

        Collections.sort(elementi);

        System.out.println("Elementite se:"+elementi);
    }
}
