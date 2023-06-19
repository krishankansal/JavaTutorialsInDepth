public class H {
    public static void main(String[] args) {
        String s = "Learning java needs devotion";
        char c[] = s.toCharArray();
        // System.out.println(c);
        // int x = 0;
        // for (int i = 0; i < c.length; i++) {
        // x++;
        // }
        // System.out.println("Total number of characters = " + x);
        // int y = 0;
        // for (int i = 0; i < c.length; i++) {
        // if (c[i] == 'e' | c[i] == 'a' | c[i] == 'i' | c[i] == 'e' | c[i] == 'u') {
        // y++;
        // }
        // }
        // System.out.println("Total number of vowels = " + y);

        int z = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                z++;
            }
        }
        System.out.println("Total number of words = " + (z + 1));
    }
}
