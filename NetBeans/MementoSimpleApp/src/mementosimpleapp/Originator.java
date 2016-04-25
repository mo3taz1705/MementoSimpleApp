package mementosimpleapp;

/**
 *
 * @author Moutaz
 */

// Originator that supports save option
public class Originator {
    private String text;

    public Originator(String text) {
        this.text = text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    // create Memento to save in the careTaker
    public Memento createMemento(){
        return new Memento(this.text);
    }
    
    // restore to the Memento given from the CareTaker
    public void restoreFromMemento(Object mementoObj){
        Memento memento = (Memento) mementoObj;
        this.text = memento.text;
    }
    
    @Override
    public String toString(){
        return text;
    }

    // Memento inner class, to be accessed only by its Originator
    private class Memento{
        private String text;
        
        private Memento(String text){
            this.text = text;
        }
    }
}
