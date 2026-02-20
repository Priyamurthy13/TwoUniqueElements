package is.Loops;

public class ForEach {
    public static void main(String[] args) {
        char[][] names = {{'d','e','e', 'p','t', 'i'},
                {'p','r', 'a','n', 'a', 'v'},
                {'s', 'u', 'r','y','a','s'}};
        for(int r=0; r<names.length;r++){
            for(int c=0; c<6;c++){
                System.out.print(names[r] [c]);
            }
            System.out.println();
        }
    }
}

