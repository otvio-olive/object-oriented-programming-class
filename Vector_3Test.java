public class Vector_3Test {
    public static void main(String [] args){
        Vector_3 v1 = new Vector_3(4, 5, 6);
        Vector_3 v2 = new Vector_3(1, 2, 3);

        v1.sum(v2).print("Soma");
        v1.sub(v2).print("Subtração");

        System.out.printf("Produto Interno(v1 . v2): %d\n", v1.prod_int(v2));
        v1.prod_vet(v2).print("Produto Vetorial(v1 × v2)");

        System.out.printf("Módulo do Vetor |v1|: %.2f\n", v1.mod());  
        System.out.printf("Módulo do Vetor |v2|: %.2f\n", v2.mod());  
    }   
}
