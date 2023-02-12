public class util {

    public static String calcular(int[] arr){
        //valida valores inválidos
        if (arr == null || arr.length < 2 ){
           return "Não é posssível calcular";
        }
        //declara variaveis auxiliares;
        int maiorNumero = arr[0];
        int menorNumero =  arr[0];

        for (int i = 1; i < arr.length; i++){
            if(maiorNumero < arr[i]){
                maiorNumero = arr[i];
            } else if(menorNumero > arr[i]){
                menorNumero = arr[i];
            }
        }

        if (menorNumero == maiorNumero){
            return "Não é posssível calcular";
        }


        return "Maior número: "+maiorNumero+" Menor número: "+menorNumero;
    }


}
