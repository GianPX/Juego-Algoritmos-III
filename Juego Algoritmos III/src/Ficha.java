public class Ficha<V> {
    //Attributes
    V value;
    //constructor
    public Ficha(V value){
        this.value=value;
    }
    //Methods

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}  

