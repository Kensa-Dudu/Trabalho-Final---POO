import java.util.Stack;

public class Caretaker {
    private Stack<Memento> mementoStack = new Stack<>();

    public void saveState(Pedido pedido) {
        mementoStack.push(new Memento(pedido));
    }

    public Memento restoreState() {
        if (!mementoStack.isEmpty()) {
            return mementoStack.pop();
        }
        return null;
    }
}
