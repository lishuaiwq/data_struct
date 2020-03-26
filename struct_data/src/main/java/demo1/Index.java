package demo1;

public class Index{
    public Integer indexl = 0;
    public Index add(){
        ++indexl;
        return this;
    }
    public Integer get(){
        return indexl;
    }
}
