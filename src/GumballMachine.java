//6510405300 Kritpiruch Chaiwong
public class GumballMachine {
    private int gumball;
    private int quaters;
    private int amountQuaterInserted;
    

    private boolean haveQuater = false;
    private boolean insertedQuater = false;
    
    //constructor
    public GumballMachine(int gumball, int quaters){
        this.gumball = gumball;
        this.quaters = quaters;
    }
    
    //method
    public void startGumballMachine(){
        System.out.println("Mighty Gumball, Inc.");
        System.out.println("Java-enabled Standing Gumball Model #2004");
        System.out.println("Inventory: " + gumball + " gumballs"); 
        System.out.println("Machine is waiting for quaters");
        if (gumball <= 0) {
            System.out.println("Machine is sold out");
        }
    }
    public void insertsQuater(){
        if (gumball <= 0) {
            System.out.println("You can't insert a quater, the machine is sold out");
        }
        haveQuater = true;
        quaters--;
    }
    public void ejectsQuater(){
        System.out.println("Quater returned");
        haveQuater = false;
        quaters++;
    }
    public void turnsCrank(){
        if (quaters <= 0) {
            haveQuater = false;
            System.out.println("You turned but there's no quater");
            System.exit(0);
        } else if (amountQuaterInserted > 1){
            quaters = quaters + (amountQuaterInserted - 1);
            System.out.println("You can't insert another quater");
        } else if (gumball <= 0){
            System.out.println("You turned, but there are no gumballs");
        }
        else {
            System.out.println("You turned...");
            haveQuater = true;
            dispenceGumball();
        }
    }

    public void dispenceGumball(){
        gumball--;
        System.out.println("A gumball comes rolling out the slot ");
        if (gumball <= 0) {
            System.out.println("Oops, out of gumballs!");
        }
    }
    
    //getter setter
    public int getGumball() {
        return gumball;
    }
    public void setGumball(int gumball) {
        this.gumball = gumball;
    }
    public int getQuaters() {
        return quaters;
    }
    public void setQuaters(int quaters) {
        this.quaters = quaters;
    }
}
