import java.util.*;
public class Leaf {
    String engWord;
    String rusWord;
    public Leaf() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово на английском");
        String eng = sc.nextLine();
        System.out.println("Введите слово на русском");
        String rus = sc.nextLine();
        engWord = eng;
        rusWord = rus;
    }

    public String getEngWord() {
        return engWord;
    }
    public int LongEngWord(){
        return engWord.length();
    }
    public char getChar(int i){
        return engWord.charAt(i);
    }
    public String getRusWord() {
        return rusWord;
    }
}
