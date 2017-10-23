package deqo.emar.mysimplestack;

/**
 * Created by emartin on 24/10/17.
 */
public class Item {
    private Object object;

    public Item (Object object) {
        this.object = object;
    }
    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
