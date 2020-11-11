public class Rezult {

    public void setRezult(int x , char h , int y ) {

        switch (h) {
            case '+':
                System.out.print("Ваш результат:" + (x + y));
                break;
            case '-':
                System.out.print("Ваш результат:" + (x - y));
                break;
            case '*':
                System.out.print("Ваш результат:" + (x * y));
                break;
            case '/':
                System.out.print("Ваш результат:" + (x / y));
                break;
        }
    }
}

