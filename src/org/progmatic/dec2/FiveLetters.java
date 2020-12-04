package org.progmatic.dec2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FiveLetters {

    private final List<String> words = new ArrayList<>();
    private String word;
    private char[] wordArray;


    public void reader() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("files/words.txt"));
        while (sc.hasNext()) {
            String word = sc.next().toLowerCase();
            if (word.length() == 5) {
                words.add(word);
            }
        }
    }

    public List<String> getWords() {
        return words;
    }

    public void chooseWord() {
        int nr = (int)(Math.random() * words.size());
        word = words.get(nr);
        wordArray = word.toCharArray();
    }

    public void botVsPlayer() {
        Scanner sc = new Scanner(System.in);
        int sameLetters = 0;
        char[] playerWordArray;
        String playerWord;

        while (sameLetters != 5) {
            do {
                System.out.print("Írj be egy öt betűs szót: ");
                playerWord = sc.nextLine().toLowerCase();
                playerWordArray = playerWord.toCharArray();
            }
            while (playerWord.length() != 5);

            for (int i = 0; i < 5; i++) {
                if (wordArray[i] == playerWordArray[i]) {
                    sameLetters++;
                }
            }
            if (sameLetters == 5) {
                System.out.println("Gratulálok, Nyertél!");
                System.out.println("A nyertes szó: " + "\u001B[31m" + word.toUpperCase());
            } else {
                System.out.println("Ennyi betű egyezik meg: " + sameLetters);
                sameLetters = 0;
            }
        }
    }

    public void botVsBot() {
        List<Character> characterList = new ArrayList<>();
        for (int i = 97; i < 123; i++) {
            char letter = (char) i;
            characterList.add(letter);
        }
        characterList.add('á');
        characterList.add('é');
        characterList.add('ű');
        characterList.add('ő');
        characterList.add('ú');
        characterList.add('ö');
        characterList.add('ü');
        characterList.add('ó');
        characterList.add('í');

        Map<Character, Integer> letterSum = new HashMap<>();
        for (Character character : characterList) {
            int sum = 0;
            for (char c : wordArray) {
                if (character == c) {
                    sum++;
                }
            }
            letterSum.putIfAbsent(character, sum);
        }
        List<Character> neededLetters = new ArrayList<>();
        for (Character character : letterSum.keySet()) {
            if (letterSum.get(character) == 1) {
                neededLetters.add(character);
            } else if (letterSum.get(character) == 2) {
                neededLetters.add(character);
                neededLetters.add(character);
            } else if (letterSum.get(character) == 3) {
                neededLetters.add(character);
                neededLetters.add(character);
                neededLetters.add(character);
            } else if (letterSum.get(character) == 4) {
                neededLetters.add(character);
                neededLetters.add(character);
                neededLetters.add(character);
                neededLetters.add(character);
            }
        }
        System.out.println(words.size());
    }


    public void botVsBotIterVersion() {
        int rounds = 0;
        for (String s : words) {
            rounds++;
            if (s.equals(word)) {
                System.out.println("Gratulálok, Nyertél! " + rounds + " kör alatt");
                System.out.println("A nyertes szó: " + "\u001B[31m" + word.toUpperCase());
                break;
            } else {
                int sameLetter = 0;
                char[] sArray = s.toCharArray();
                for (int i = 0; i < 5; i++) {
                    if (wordArray[i] == sArray[i]) {
                        sameLetter++;
                    }
                }
                System.out.println("Ennyi betű egyezik meg: " + sameLetter);
            }
        }
    }
}
