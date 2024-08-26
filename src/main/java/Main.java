import model.Pagamento;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Pagamento pg= new Pagamento();
        pg.setId(11);
        pg.setData(new Date());
        pg.setValor(500);
        System.out.println(pg);
    }







}
