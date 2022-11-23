package com.klausschoeffmann.Strings;

public class CharArrays {
    public static void main(String[] args) {
        char[] text = {'E','i','n','f','ü','h','r','u','n','g',' ', 'i','n',' ','d','i','e',' ','s','t','r','u','k','t','u','r','i','e','r','t','e',' ','u','n','d',' ','o','b','j','e','k','t','b','a','s','i','e','r','t','e',' ','P','r','o','g','r','a','m','m','i','e','r','u','n','g'};
        //region search example

        /*
        char[][] needles = {
                {'H','a','l','l','o'},
                {' ', 'i','n'},
                {'d','i','e'},
                {'P','r','o','g'},
                {'u','n','g'},
        };

        System.out.print("Our haystack: ");
        printCharArray(text);


        //look for every needle (i.e., part array)
        for (char[] n : needles) {
            lookFor(text, n);
        }

        //what happens if we search for an empty needle?
        lookFor(text, new char[0]);

        //endregion
        */


        //region abbreviation example
        printCharArray(text);
        abbreviate(text, 4);
        System.out.println("Ergebnis:");
        printCharArray(text);
        System.exit(0);
        //endregion


    }

    static void printCharArray(char[] text) {
        for (char c : text) {
            System.out.print(c);
        }
        System.out.println(" (" + text.length + " chars)");
    }

    static void lookFor(char[] haystack, char[] needle) {
        System.out.print("Looking for: ");
        printCharArray(needle);
        int idx = findChars2(haystack, needle);
        System.out.println("Found index: " + idx + "\n");
    }

    static int findChars2(char[] haystack, char[] needle) {
        if (needle.length > 0) {
            int maxlength = haystack.length - needle.length;
            for (int i = 0; i <= maxlength; i++) {
                if (haystack[i] == needle[0]) {
                    int c = 1;
                    while (c < needle.length && haystack[i+c] == needle[c]) {
                        c++;
                    }
                    if (c == needle.length) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    static int findChars(char[] haystack, char[] needle) {
        int index = -1;

        if (needle.length > 0) {
            for (int i=0; i < haystack.length; i++) {
                int numMatches = 0;
                for (int k=0; k < needle.length; k++) {
                    if (i+k < haystack.length && haystack[i+k] == needle[k]) {
                        numMatches++;
                    }
                }
                if (numMatches == needle.length) {
                    index = i;
                    break;
                }
            }
        }

        return index;
    }

    static void abbreviate(char[] text, int maxWordLength) {
        int wordStart = 0; //last begin of a word (assume first char).

        for (int i=wordStart; i < text.length; i++) {
            if (text[i] == ' ')
                wordStart = i+1;
            else if (i-wordStart == maxWordLength) {
                text[i++] = '.';
                while (i < text.length && text[i] != ' ') {
                    for (int k=i; k < text.length-1; k++)
                        text[k] = text[k+1];
                    text[text.length-1] = ' ';
                }
                wordStart = i+1;
            }

        }
    }

}
