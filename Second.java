import java.util.*;
public class Second
{
    Main prov4 = new Main();
    Scanner scanner = new Scanner(System.in);
    private int y;
    public void setYX() {
        while (true) {
            try {
                int y = scanner.nextInt();
                if (y <= 10 && y > 0) {
                    this.y = y;
                    prov4.setProv(3);
                    break;
                } else {
                    System.out.println("Ввидите коректное число");
                }
            } catch (Exception e) {
                prov4.setProv(4);
                break;
            }
        }
    }
    public int getYX() {
        return y;
    }
}