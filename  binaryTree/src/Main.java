import java.util.*;
 public class Main {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Введите первую пару слов");
         Leaf words = new Leaf();
         Tree t = new Tree(words);
         while (true) {
             System.out.println("Хотите добавить слово ? (Да/Нет)");
             String answer = sc.nextLine();
             if (answer.equalsIgnoreCase("Да")) {
                 Leaf nextWords = new Leaf();
                 t.add(t, nextWords);
             } else {
                 if (answer.equalsIgnoreCase("Нет")) {
                     System.out.println("Словарь закрыт");
                     break;
                 } else {
                     System.out.println("Вы ввели не сущесвующий вариант ответа");
                 }
             }
         }
         while (true) {
             System.out.println("Хотите найти перевод английского слова? (Да/Нет)");
             String answer = sc.nextLine();
             if (answer.equalsIgnoreCase("Да")) {
                 System.out.println("Введите искомое слово");
                 String key = sc.nextLine();
                 String value = t.Search(t, key);
                 if (value.length() > 0) {
                     System.out.println(value);
                 } else {
                     System.out.println("Такого слова нет");
                 }
             } else {
                 if (answer.equalsIgnoreCase("Нет")) {
                     System.out.println("Словарь закрыт");
                     break;
                 } else {
                     System.out.println("Вы ввели не сущесвующий вариант ответа");
                 }
             }
         }
     }
 }