import java.util.Arrays;

public class Array {
    public static void main(String[] args){

        String gfg[] = new String[3];
        gfg[0] = "Geeks";
        gfg[1] = "for";
        gfg[2] = "Geeks";

        for (String element : gfg) {
            System.out.print(element + " ");
        }
    }
}

