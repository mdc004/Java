import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Noleggio n = new Noleggio();

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String choose = scanner.next();

            switch(choose){
                case "ADDAuto":
                    n.aggiungiVeicolo(new Auto(scanner.next(), scanner.nextInt(), scanner.nextInt()));
                    break;
                case "ADDMoto":
                    n.aggiungiVeicolo(new Moto(scanner.next(),scanner.nextInt(), scanner.nextInt()));
                    break;
                case "NAuto":
                    Auto a = n.noleggiaAuto(scanner.nextInt(), scanner.nextInt());
                    if(a != null){
                        System.out.println(a.toString());
                    }
                    break;
                case "NMoto":
                    Moto m = n.noleggiaMoto(scanner.next(), scanner.nextInt());
                    if(m != null){
                        System.out.println(m.toString());
                    }
                    break;
                case "SORT":
                    n.sort();
                    break;
                case "PRINT":
                    n.print();
                    break;
                case "F":
                    return;
            }
        }
    }
}