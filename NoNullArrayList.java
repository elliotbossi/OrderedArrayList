import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int i){
    super(i);
  }

  public void add(int i, T e){
    if (e == null){
      throw new IllegalArgumentException();
    }
    super.add(i, e);
  }

  public boolean add(T e){
    if (e == null){
      throw new IllegalArgumentException();
    }
    return (super.add(e));
  }

}
