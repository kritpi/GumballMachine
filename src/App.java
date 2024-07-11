public class App {
    public static void main(String[] args) throws Exception {
        GumballMachine gumballMachine = new GumballMachine(20, 10);
        gumballMachine.startGumballMachine();
        gumballMachine.insertsQuater();
        gumballMachine.ejectsQuater();        
    }
}
