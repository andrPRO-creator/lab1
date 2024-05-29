package data.string;

public class RandomWordGenerator {
    //facade
    LowerCaseCharacterGenerator lowerCaseGenerator = new LowerCaseCharacterGenerator();
    UpperCaseCharacterGenerator upperCaseGenerator = new UpperCaseCharacterGenerator();

    public String generateRandomWord(int length) {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < length; i++) {
            // Случайным образом выбираем генератор букв верхнего или нижнего регистра
            ICharacterGenerator generator = Math.random() <  0.5 ? upperCaseGenerator : lowerCaseGenerator;
            word.append(generator.generateChar());
        }
        return word.toString();
    }
}
