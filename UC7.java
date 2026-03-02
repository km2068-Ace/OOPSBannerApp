class OOPSBannerApp {
    static class CharacterPattern {
        char letter;
        String[] lines;

        CharacterPattern(char letter, String[] lines) {
            this.letter = letter;
            this.lines = lines;
        }
    }



    public static void main(String[] args) {

        CharacterPattern charO = new CharacterPattern('O', new String[]{
            "   ***   ",
            " **   ** ",
            "**     **", 
            "**     **",
            "**     **", 
            " **   ** ",
            "   ***   ",
        });

        CharacterPattern charP = new CharacterPattern('P', new String[]{
            " *****    ",
            " **   **  ",
            " **    ** ",
            " **   **  ",
            " *****    ",
            " ** ", 
            " ** ",
        });

        CharacterPattern charS = new CharacterPattern('S', new String[]{
            "    ***** ",
            "  **      ",
            " **       ",
            "  *****   ",
            "      **  ",
            "      **   **  ",
            "       *****   ",
        });


        String[] banner = {" ", " ", " ", " ", " ", " ", " "};

        CharacterPattern[] sequence = {charO, charO, charP, charS}; 

        for (CharacterPattern cp : sequence) {
            for (int i = 0; i < 7; i++) {

                banner[i] += cp.lines[i] + " "; 
            }
        }


        for (String row : banner) {
            System.out.println(row);
        }
    }
}