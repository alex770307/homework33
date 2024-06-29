import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondTask {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Белая берёза");
        strings.add("Под моим окном");
        strings.add("Принакрылась снегом,");
        strings.add("Точно серебром.");
        strings.add("На пушистых ветках");
        strings.add("Снежною каймой");
        strings.add("Распустились кисти");
        strings.add("Белой бахромой.");
        strings.add("И стоит берёза");
        strings.add("В сонной тишине,");
        strings.add("И горят снежинки");
        strings.add("В золотом огне.");
        strings.add("А заря, лениво");
        strings.add("Обходя кругом,");
        strings.add("Обсыпает ветки");
        strings.add("Новым серебром.");

        List<String> filteredStrings = strings.stream()
                .filter(str -> str.length() <= 15)              // Отфилтровать строки длиннее 15 символов
                .toList();

        String longestString = filteredStrings.stream()
                .max(Comparator.comparingInt(String::length))   // Найти самую длинную строку среди оставшихся
                .get();

        System.out.println("Исходный текст:\n" + strings);
        System.out.println("Отфильтрованные строки :\n" + filteredStrings);
        System.out.println("\nСамая длинная строка среди отфильтрованных :\n" + longestString);

    }
}
