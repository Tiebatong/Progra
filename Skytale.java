public class Skytale {
    public static void main(String[] args) {
        
        // Input Validierung
        boolean Error = false;
        if (args.length != 2) {
            System.out.println("ERROR");
            return;
        }
        if (args[0].equals("E") || args[0].equals("D")) {
            // kann leer gelassen werden, Fall wird von else überprüft
        } else {
            Error = true;
        }
        if (args[1].length() != 28) {
            Error = true;
        }

        // Fehler Ausgabe
        if (Error) {
            System.out.println("ERROR");
        }
        
        if (args[0].equals("E")) {
            System.out.println(Verschlüsselung(args[1]));
        } else {
            System.out.println(Entschlüsselung(args[1]));
        }
        
    }

    static String Verschlüsselung(String input) {

        int n = 4;
        int m = 7;
        String Text_verschlüsselt = "";

        for (int j = 0; j < m; j++) {     
            for (int i = 0; i < n; i++) { 
                int Index = i * 7 + j;
                //System.out.println(Index);
                //System.out.println(input.charAt(Index));
                Text_verschlüsselt += input.charAt(Index);
            }
        }

        return Text_verschlüsselt;
    }

    static String Entschlüsselung(String input) {

        int n = 4;
        int m = 7;
        String Text_entschlüsselt = "";

        for (int j = 0; j < m; j++) {     
            for (int i = 0; i < n; i++) { 
                int Index = i * 4;
                System.out.println(Index);
                
            }
        }

        return Text_entschlüsselt;
 
    }
    
}
