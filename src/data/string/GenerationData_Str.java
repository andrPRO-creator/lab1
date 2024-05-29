package data.string;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerationData_Str extends StringDecorator {
    StringDecorator string = new StringDecorator();
    private List<String> data_str = new ArrayList<>();

    public List<String> getData_str() {
        return data_str;
    }

    public void setData_str(List<String> data_str) {
        this.data_str = data_str;
    }

    Random randomNum = new Random();


    //public GenerationData_Str(){};
    public GenerationData_Str(int qStr,int qWord, int minLength, int maxLength){
        for (int i = 0; i < qStr; i++) {
            for (int j = 0; j < randomNum.nextInt(1,qWord); j++) {
                string.generait(minLength,maxLength);
            }
            data_str.add(string.getStr());
            string.setStr("");
        }
        System.out.println(getData_str());
    }

    public void printListStr(){
        for (String el:data_str) {
            System.out.println(el);
        }
    }
}
