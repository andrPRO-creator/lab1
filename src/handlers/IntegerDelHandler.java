package handlers;
import data.GeneratorListData;
import java.util.List;
import logger.Logger;

public class IntegerDelHandler {

    private List<Integer> data;
    private String str = "Результаты второго обработчика List<Integer> \n" ;

    public List<Integer> delOdd(){
        //System.out.println("Удаление нечетных чисел...");
        for (int i = 0; i < data.size(); i++) {
            if ((data.get(i))%2 != 0){
                data.remove(i);
                i--;
            }
        } return data;
    }

    public List<Integer> delEven(){
        //System.out.println("Удаление четных чисел...");
        for (int i = 0; i < data.size(); i++) {
            if ((data.get(i))%2 == 0){
                data.remove(i);
                i--;
            }
        } return data;
    }

    public void print(List<Integer> data){
        for (int i:data) {
            System.out.println(i);
        }
    }

    public IntegerDelHandler(GeneratorListData data_int, int even_odd){
        this.data = data_int.getData_int();
        Logger logger = Logger.getLog();
        str += data + "\n";
        if (even_odd == 2){
            delOdd();
            str += "Удаление нечетных элементов... \n";
        }
        else if (even_odd == 1){
            delEven();
            str += "Удаление четных элементов...\n";
        }   else str += "Ошибка! Указан неверный тип";

        logger.update(str+data+"\n");
        //print(data);
    }

}
