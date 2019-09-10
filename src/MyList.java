import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (this.size == this.DEFAULT_CAPACITY) this.ensureCapacity(this.size +1);
        this.elements[this.size++] = element;
    }


    public E remove(int index) {
        E temp = (E) this.elements[index];
        for (int i = index; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        if(this.elements[index] != null) this.size--;
        return temp;
    }

    public int size() {
        return this.size;
    }

    @Override
    public Object clone() {
        MyList<E> clone = new MyList<>();
        clone.elements = this.elements;
        clone.size = this.size;
        return clone;
    }

    public boolean contains(E o){
        for(int i = 0; i < size; i++){
            if(this.elements[i] == o){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o){
        int check = -1;
        for(int i = 0; i < size; i++){
            if(this.elements[i] == o){
                check = i;
                break;
            }
        }
        return check;
    }

    public boolean add(E e){
        boolean check = true;
        if(this.size == this.elements.length){
            this.ensureCapacity(this.size + 1);
        }
        this.elements[this.size++] = e;
        if(e == null) check = false;
        return check;
    }

    public void ensureCapacity(int minCapacity){
        int temp = this.elements.length;
        if(minCapacity > temp) this.elements = Arrays.copyOf(this.elements,Math.max(temp * 2, minCapacity));
    }

    public Object get(int index){
        return this.elements[index];
    }

    public void clear(){
        if(this.size > 0) {
            Arrays.fill(this.elements,0,size,null);
            size = 0;
        }
    }
}
