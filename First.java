import java.util.*;
public class First
{
    Main prov2 = new Main();
    Scanner scanner = new Scanner(System.in);
    private int x;
    public void setXY() {
        while(true) {
            try {
                int x = scanner.nextInt();
                if(x<=10 && x>0) {
                    this.x = x;
                    prov2.setProv(2);
                    break;
                } else {
                    System.out.println("Ввидите коректное число");
                }
            } catch(Exception e) {
                System.out.println("Ошибка! Программа закрывается....");
                prov2.setProv(4);
                break;

                /*System.out.println("Нужно ввести именно число!");
                scanner.nextLine();
                setXY()*/
            };
        }

    }
    public int getXY() {
        return x;
    }
}
