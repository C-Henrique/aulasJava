package edu.basic.java;
/**<h2>Classe com uso de repetição</h2>
 * <p>
 *     <b>Nota :</b> usada para exercicio de repetição.
 * </p>
 * @author C. Henrique
 * @version 1.0
 * @since Create in 01/11/2022
 * */
public class aulaDeRepeticao {
    public static void main(String[] args) {
        int valor = 1;
        switchOperacao(valor);
        ifElse(valor);
        whileOperacao(valor);
    }
    /**
     * <h3>Class 'switchOperacao'</h3>
     * <p>
     *     <b>Nota :</b> classe usando o switch.
     * </p>
     * @param valor valor repassado para o método como int.
     * */
    public static void switchOperacao(int valor){
        switch ( valor ){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
    /**
     * <h3>Class 'ifElse'</h3>
     * <p>
     *     <b>Nota :</b> classe usando o if Else.
     * </p>
     * @param valor valor repassado para o método como int.
     * */
    public static void ifElse(int valor){
        if (valor == 2){
            System.out.println("é dois");
        }else {
            System.out.println("não é dois, é "+valor);
        }
    }
    /**
     * <h3>Class 'whileOperacao'</h3>
     * <p>
     *     <b>Nota :</b> classe usando o while.
     * </p>
     * @param valor valor repassado para o método como int.
     * */
    public static void whileOperacao(int valor){
        int count = 0;
        while (count == 4){
            System.out.println(count + " e " + valor);
            count++;
        }
        /**Atenção :
         * <p>
         *  <i>existe o 'do while' onde o mesmo executar um bloco do e depois valida o loop com o while</i>
         * </p>
         *
         * */
//        do {
//            System.out.println("while do");
//        }while (true);
    }
}
