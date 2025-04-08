package metier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Compteepargne c1=new Compteepargne(1333,5678,0);
        Comptesimple c2=new Comptesimple(133344,562178);
        Comptepayant c3=new Comptepayant(133344,562178);
        c2.solver();
        System.out.println(c2.getsolde());
        c1.display();
        c1.calculInteret();
        c3.retirer(100);
        c3.verser(500);
        c3.display();
    }
}