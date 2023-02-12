public class Main {
    public static void main(String[] args) {
       int[] arr1 = {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47};
       int[] arr2 = {1};
       int[] arr3 = {1, -1};
       int[] arr4 = null;
       int[] arr5 ={-2,-2,-2,-2};
       int[] arr6 = {20,10, 30} ;

       String msg = "";


       msg = msg.concat("Teste1: "+util.calcular(arr1));
       msg = msg.concat("\nTeste2: "+util.calcular(arr2));
       msg = msg.concat("\nTeste3: "+util.calcular(arr3));
       msg = msg.concat("\nTeste4: "+util.calcular(arr4));
       msg = msg.concat("\nTeste5: "+util.calcular(arr5));
       msg = msg.concat("\nTeste6: "+util.calcular(arr6));


       System.out.println(msg);
    }
}