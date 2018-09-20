class Reversed {
public static void main(String[] args) {
        String[] input = {"The sky is blue", "A B C DE F G", "Supercalifragilisticexpealidocious", "Baa baa black sheep"};
        for (String entry : input) {
            int order = 0;
            for (int count = entry.length() - 1; count >= 0; count--) {
                char character = entry.charAt(count);
                if (Character.isWhitespace(character)) {
                    for (int build = count + 1; build <= count + order; build++) {
                        System.out.print(entry.charAt(build));
                    }
                    System.out.print(" ");
                    order = 0;
                } else {
                    order++;
                }
                if (count == 0) {
                    order--;
                    for (int build = count; build <= order; build++) {
                        System.out.print(entry.charAt(build));
                    }
                }
            }
            System.out.print("\n");
        }
    }
}