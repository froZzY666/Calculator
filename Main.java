import java.util.Scanner;
public class Main
{
    private int prov = 1;
    public void setProv(int prov) {
       this.prov = prov;
    }
    public int getProv() {
        return this.prov;
    }
    public static void main(String[] args) {
        First perem1 = new First();
        Operation perem2 = new Operation();
        Second perem3 = new Second();
        Rezult rezult = new Rezult();
        Main prov1 = new Main();

        int x = perem1.getXY();
        char h = perem2.getHU();
        int y = perem3.getYX();
        rezult.setRezult(x , h , y);


        while (true) {
            int prov = prov1.getProv();
            if (prov < 0) {
            } else if (prov == 1) {
                System.out.println("Ввидите первое число от 1 до 10");
                perem1.setXY();
            } else if (prov == 2) {
                System.out.println("Ввидите нужный знак из перечисленых - +,-,*,/");
                perem2.setHU();
            } else if (prov == 3) {
                System.out.println("Ввидите второе число от 1 до 10");
                perem3.setYX();
                prov1.setProv(-1);
                break;
            } else if (prov == 4) {
                System.out.println("Завершение программы.....");
                prov1.setProv(-1);
                break;
            }
        }
    }
}
