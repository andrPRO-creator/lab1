package data.string;

public class UpperCaseCharacterGenerator implements ICharacterGenerator {
    @Override
    public char generateChar() {
        // Генерация случайного символа ASCII в диапазоне от 'A' до 'Z'
        return (char) ((int) 'A' + Math.random() * ((int) 'Z' - (int) 'A' + 1));
    }
}
