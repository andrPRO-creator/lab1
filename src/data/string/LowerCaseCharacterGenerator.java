package data.string;

public class LowerCaseCharacterGenerator implements ICharacterGenerator {
    @Override
    public char generateChar() {
        // Генерация случайного символа ASCII в диапазоне от 'a' до 'z'
        return (char) ((int) 'a' + Math.random() * ((int) 'z' - (int) 'a' + 1));
    }
}
