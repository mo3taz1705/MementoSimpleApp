package mementosimpleapp;

/**
 *
 * @author Moutaz
 */
public class CareTaker {
    private Object object;
    
    // client requests to save a specific originator
    public void save(Originator originator){
        object = originator.createMemento();
    }
    
    // client requests to undo a specific originator
    public void undo(Originator originator){
        originator.restoreFromMemento(this.object);
    }
}
