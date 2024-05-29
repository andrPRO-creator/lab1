package data;
import java.util.List;
import data.integer.GenerationData_Int;
import data.string.GenerationData_Str;

//composite
public class GeneratorListData {
    private List<Integer> data_int;
    private List<String> data_str;

    public void CompositeInt(int q, int min, int max) {
        GenerationData_Int data_int = new GenerationData_Int(q,min,max);
        this.data_int = data_int.getData_int();
    }

    public void CompositeString(int qStr,int qW, int min, int max) {
        GenerationData_Str data_str = new GenerationData_Str(qStr,qW,min,max);
        this.data_str = data_str.getData_str() ;
    }

    public List<Integer> getData_int() {
        return data_int;
    }

    public List<String> getData_str() {
        return data_str;
    }

    public GeneratorListData(int type, int q, int min, int max, int qStr){
        if (type==1){
            CompositeInt(q,min,max);
        }   else if (type==2)
            CompositeString(qStr,q,min,max);
    }
}


