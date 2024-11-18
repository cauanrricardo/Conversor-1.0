public class Conversor implements ConversorInterface {

    //Metodo de conversor decimal para binario
    public void decimaltobinario(int decimal) {
        String conversor = ""; // String para guardar o numero que o cliente vai colocar;

        // Conversão de decimal para binário
        while (decimal > 0) {
            if (decimal % 2 == 0) {
                conversor = "0" + conversor; // Adiciona "0" na String
            } else {
                conversor = "1" + conversor; // Adiciona "1" na String
            }
            decimal /= 2; // Divide por 2, pra ir atualizando o numero decimal, a cada verificacao;
        }

        // Se o número decimal for 0, conversor vai receber 0;
        if (conversor.equals("0")) {
            conversor = "0";
        }

        // Exibe o resultado
        System.out.println("Binário: " + conversor);
    }

    //Metodo de conversor binario para decimal
    public void binariotodecimal(String binario) {
        int decimal = 0;
        int base = 1; // Começa com a base 1 (2^0), pois comeca da direita pra esquerda, a conversao;

        // Loop for para converter de binário para decimal
        for (int i = binario.length() - 1; i >= 0; i--) {
            if (binario.charAt(i) == '1') { //esse charAt e uma funcao que acessa cada elemento da String.
                decimal += base; // Adiciona a base ao resultado se for "1"
            }
            base *= 2; // Multiplica a base por 2 a cada iteração, ou seja(2^0, 2^1, 2 ^2);
        }

        // Exibe o resultado
        System.out.println("Decimal: " + decimal);
    }


}
