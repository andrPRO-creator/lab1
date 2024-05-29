package handlers;
import data.GeneratorListData;
import logger.Logger;
import java.util.Arrays;
import java.util.List;

public class StringCountHandler {

    private String str = "Результаты второго обработчика List<String> \n" ;
    private List<String> data;
    private int qWord;
    private int qSymbol;
    private int[] qWordInString;

    public int[] qWordInString(){
        qWordInString = new int[data.size()];
        for (int i = 0; i < data.size(); i++) {
            List<String> wordToStr = Arrays.asList(data.get(i).split(" "));
            qWordInString[i] = wordToStr.size();
        }
        return qWordInString;
    }

    public int qWord(){
        //int i = 0;
        for (String el: data) {
            List<String> wordToStr = Arrays.asList(el.split(" "));
            qWord += wordToStr.size();
        }
        //System.out.println("Общее количество слов в списке " + i);
        return qWord;
    }



    public int qSymbol(){
        for (String el: data){
            qSymbol += el.length();
        }
        //System.out.println("Общее количество символов в списке " + i);
        return qSymbol;
    }




    public StringCountHandler(GeneratorListData data){

        this.data = data.getData_str();
        str += this.data + "\n";
        qWordInString();
        qWord();
        qSymbol();
        Logger logger = Logger.getLog();
        logger.update(str + toString());

    }

    @Override
    public String toString() {
        return
                "Общее количество слов в списке: " + qWord + "\n" +
                "Общее количество символов в списке: " + qSymbol + "\n" +
                "Количество слов в каждой строке: " + Arrays.toString(qWordInString) + "\n"
                ;
    }
}
