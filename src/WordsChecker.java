import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set <String> words = new HashSet<>();  //сохраним слова в поле чтобы потом не переразбивать, создаем множество,т.к. оно предполагает поиск элементов

    public WordsChecker(String text) {
        this.text = text;
        String [] partsWord = text.split("\\P{IsAlphabetic}+");  //сразу разбивка на слова+заполняем множество
        for (String word : partsWord) {  //переберем все слова
           words.add(word);              //каждое слово вставляем в коллекцию Сет
        }
    }

    public boolean hasWord(String wordQuery) {
        return words.contains(wordQuery);            //ответ тем же самым содержит множество слово или нет
    }                                                //т.е. метод ответит тем же самым что и ответит коллекция
}
