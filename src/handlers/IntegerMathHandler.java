package handlers;
import java.util.List;
import data.GeneratorListData;
import logger.Logger;

public class IntegerMathHandler {

    private List<Integer> data;
    private String str = "Результаты первого обработчика List<Integer> \n" ;
    private int sum;
    private double average;
    private int maxInt;
    private int minInt;

    //Logger logger = new Logger();




    //сумма элементов списка
    public int sum(){

        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i);
        }
        return sum;
    }
    //среднее значение элементов
    public double average(){
        average=sum/data.size();
        return average;
    }

    public int getMax(){
        maxInt = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if (maxInt<data.get(i))
                maxInt= data.get(i);
        }
        return maxInt;
    }

    public int getMin(){
        minInt = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if (minInt>data.get(i))
                minInt = data.get(i);
        }
        return minInt;
    }

    public IntegerMathHandler(GeneratorListData data){
        this.data = data.getData_int();
        sum();
        average();
        getMin();
        getMax();
        Logger logger = Logger.getLog();
        logger.update(str+toString());

    }

    @Override
    public String toString() {
        return  data + "\n" +
                "Сумма элементов = " + sum +
                ", Среднее значение = " + average +
                ", Максимальный элемент = " + maxInt +
                ", Минимальный элемент = " + minInt;
    }
}
