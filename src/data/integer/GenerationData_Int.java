package data.integer;
import data.IGenerationData;
//import data.Generator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerationData_Int implements IGenerationData  {
    private List<Integer> data_int = new ArrayList<>();

    public void setData_Int(List<Integer> data_int){
        this.data_int = data_int;
    }

    public List<Integer> getData_int() {
        return data_int;
    }

    Random randomNum = new Random();


    @Override
    public void generait(int origin,int bound) {
        data_int.add(randomNum.nextInt(origin,bound));
    }



    //public GenerationData_Int(){};
    public GenerationData_Int(int N,int origin,int bound){
        for (int i = 0; i < N; i++) {
            generait(origin,bound);

        }
        System.out.println(getData_int());
    };



    public void printListInt(){
        for (int el:data_int) {
            System.out.println(el);
        }
    }
}
