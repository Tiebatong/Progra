class Skytale {
    static void main(String[] args) {
        if(args[0].equals("D") != true && args[0].equals("E") != true || args[1].length() != 28 || args.length != 2) {
            System.out.println("ERROR");
        }


        if (args[0].equals("E")) {
            System.out.println(verschlüsseln(toCharArray(args[1])));
        } else {
            System.out.println(entschlüsseln(args[1]));
        }



    }

    static char[][] toCharArray(String input) {

        char[][] array = new char[4][7];
        
        int counter = 0;

        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 7; j++) {
                array[i][j] = input.charAt(counter);
                counter++;
            }
        }
        return array;
    }

    static String verschlüsseln(char[][] array) {
        String verschlüsselt = "";

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                verschlüsselt += array[j][i];
            }
        }
        return verschlüsselt;
    }

    static String entschlüsseln(String input) {
        String entschlüsselt = "";

        int index = 0;
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            
            for(int j = 0; j < 7; j++) {
                index = j * 4 + counter;
                entschlüsselt += input.charAt(index);
            }
            counter++;
        }
        

        return entschlüsselt;
    }
}
