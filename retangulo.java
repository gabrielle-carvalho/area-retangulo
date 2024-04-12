import java.util.Scanner;

public class retangulo {
        public static void main (String[] args){

            float base;
            float altura;
            //criei as variáveis e falei qual tipo de caractere ela aceitava, no caso, números decimais.

            Scanner input = new Scanner(System.in);

            System.out.println("Digite a base do retângulo:    ");
            base = input.nextFloat();
            //pedi pra quem tá acessando colocar qual é a base do retângulo e coloquei um espaço pra ele digitar

            System.out.println ("Digite a altura do retângulo:    ");
            altura = input.nextFloat();
            //pedi pra quem tá acessando colocar qual é a altura do retângulo e coloquei um espaço pra ele digitar

            System.out.println ("A área desse retângulo é: " + (base * altura) + " e o seu perímetro é: " + (base * 2 + altura * 2));
