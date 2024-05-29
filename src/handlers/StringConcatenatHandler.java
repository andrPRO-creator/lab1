package handlers;
import java.util.List;
import logger.Logger;
import data.GeneratorListData;
public class StringConcatenatHandler {
    private List<String> data;
    private String str = "Результаты первого обработчика List<String> \n" ;
    private String strconcate = "";

    public String concatenation(GeneratorListData data){
        this.data = data.getData_str();
        for (int i = 0; i < this.data.size(); i++) {
            strconcate+=this.data.get(i);
        } return strconcate;
    }

//    public void printString(){
//        System.out.println(str);
//    }

    public StringConcatenatHandler(GeneratorListData data1){
        this.data = data1.getData_str();
        str += data +"\nКонкатенация строк...\n";
        Logger logger = Logger.getLog();

        concatenation(data1);
        logger.update(str + strconcate);

    }
}
