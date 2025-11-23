package praticandojavaestruturasdecontrole;

//public class EstruturaDeRepeticaoFor {
//    public static void main(String[] args) {
//        for (var i = 1; i <= 100; i++) {//vai mostrar números de 1 a 100
//            System.out.println(i);
//        }
//    }
//}

//se eu quissesse imprimir apenas números pares:
//public class EstruturaDeRepeticaoFor {
//    public static void main(String[] args) {
//        for (var i = 2; i <= 100; i+=2) {//vai mostrar números de 1 a 100
//            System.out.println(i);
//        }
//    }
//}
// se eu quissesse imprimir apenas números impares:
public class EstruturaDeRepeticaoFor {
    public static void main(String[] args) {
        for (var i = 3; i <= 100; i++) {
            if (i % 2 == 0) {// % - resto da divisão de i por 2
                continue;
            }
            System.out.println(i);
        }
    }
}