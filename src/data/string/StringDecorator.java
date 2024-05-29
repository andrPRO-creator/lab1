package data.string;
import data.IGenerationData;

import java.util.List;
import java.util.Random;

//decorator
public class StringDecorator implements IGenerationData {
    private String str = "";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    Random randomNum = new Random();
    @Override
    public void generait(int origin,int bound) {
        //String str = "";
        int randLength = randomNum.nextInt(origin,bound);


        RandomWordGenerator wordGenerator = new RandomWordGenerator();
        String randomWord = wordGenerator.generateRandomWord(randLength);
        //data_str.add(randomWord);
        if (this.str == "")
            this.str += randomWord;
        else this.str += " " + randomWord;
    }

}
