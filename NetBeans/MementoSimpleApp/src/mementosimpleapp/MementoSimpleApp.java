package mementosimpleapp;

/**
 *
 * @author Moutaz
 */
public class MementoSimpleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator("1");
        
        originator.setText("2");
        careTaker.save(originator);
        
        originator.setText("3");
        System.out.println(originator);
        
        careTaker.undo(originator);
        System.out.println(originator);
    }
    
}
