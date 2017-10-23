package deqo.emar.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by emartin on 24/10/17.
 */
public class MySimpleStack implements SimpleStack {

    private List<Item> listItems = new ArrayList();

    public boolean isEmpty() {
        return listItems.isEmpty();
    }

    public int getSize() {
        return listItems.size();
    }

    public void push(Item item) {
        listItems.add(item);
    }

    public Item peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return listItems.get(getSize() - 1);
        }
    }

    public Item pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return listItems.remove(getSize() - 1);
        }
    }
}
