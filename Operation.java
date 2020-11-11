import java.util.*;
public class Operation
{
    Main prov3 = new Main();
    Scanner scanner = new Scanner(System.in);
    private char h;
    boolean tf = true;
    public void setHU() {
        while(tf) {
            char h = scanner.next().charAt(0);
            switch(h) {
                case '+':
                    this.h = h;
                    this.tf = false;
                    prov3.setProv(3);
                    break;
                case '-':
                    this.h = h;
                    this.tf = false;
                    prov3.setProv(3);
                    break;
                case '*':
                    this.h = h;
                    this.tf = false;
                    prov3.setProv(3);
                    break;
                case '/':
                    this.h = h;
                    this.tf = false;
                    prov3.setProv(3);
                    break;
                default:
                    System.out.println("Ввидите корректный знак");
            }
        }
    }
    public char getHU() {
        return h;
    }
}