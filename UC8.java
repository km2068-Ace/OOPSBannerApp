import java.util.HashMap;

class OOPSBannerApp {

    
    static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> map = new HashMap<>();
        
        
        map.put('O', new String[]{
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        });
        
       
        map.put('P', new String[]{
            " ****  ",
            " *   * ",
            " ****  ",
            " *     ",
            " *     "
        });
        
        
        map.put('S', new String[]{
            "  **** ",
            " *     ",
            "  ***  ",
            "     * ",
            " ****  "
        });
        
        return map;
    }

    
    static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int height = 5; 
        
        for (int i = 0; i < height; i++) {
            for (char c : message.toUpperCase().toCharArray()) {
                if (charMap.containsKey(c)) {
                    System.out.print(charMap.get(c)[i] + "  ");
                }
            }
            System.out.println(); 
        }
    }

    
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS"; 
        displayBanner(message, charMap);
    }
}