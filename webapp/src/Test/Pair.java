package Test;

public class Pair<T> {
    private T first;
    private T last;
    public Pair(){first=null;last=null;}
    public Pair(T first,T last){
        this.first=first;
        this.last=last;

    }
    public T getFirst(){
        return first;
    }
    public T getLast(){

        return last;
    }

}
