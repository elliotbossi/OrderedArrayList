

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int i){
    super(i);
  }

  public boolean add(T e){
    int x = 0;
    while ((x < super.size()) && (e.compareTo(super.get(x)) > 0)){
      x = x + 1;
    }
    super.add(x, e);
    return true;
  }

  public void add(int i, T e){
    add(e);
  }

  public T set(int i, T e){
    super.remove(i);
    add(e);
    return e;
  }

}
