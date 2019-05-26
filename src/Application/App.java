package Application;

import ComComposite.Celula;
import ComComposite.Linha;
import ComComposite.Tabela;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static String options[] = {"NO", "YES"};

    private static String ask(String question, String[] options) {
        Scanner in = new Scanner(System.in);
        System.out.println(question);
        while (true) {
            int iterator = 0;
            System.out.println("Please select: ");

            /**
             * for loop beginner #Roots 🤘
             * for (int col = 0; col < options.length; col++)
             * {
             *      System.out.printf("[%d] = %s\n", col, options[col]);
             * }
             */

            //for loop optimized #Evolution
            for (String f : options) {
                System.out.println("[" + iterator + "] = " + f);
                iterator++;
            }

            String answer = in.nextLine();

            if (isInteger(answer)) {
                int value = Integer.parseInt(answer);
                if (value < options.length)
                    return options[value];
            } else {
                answer = answer.toUpperCase();
                if (Arrays.asList(options).contains(answer))
                    return answer;
            }
        }

    }

    private static boolean isInteger(String answer) {
        try {
            int value = Integer.parseInt(answer);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    private static Tabela populaParametros(Tabela paramTabela, int i) {
        int iterator = i;

        Celula cel;
        Linha linha = new Linha();
        Tabela tabela = paramTabela;

        switch (iterator) {
            case 0:
                cel = new Celula("Composite rocks \uD83E\uDD18");
                break;
            case 1:
                cel = new Celula("You liked it! \uD83E\uDD18 \uD83E\uDD18");
                break;
            case 2:
                cel = new Celula("Rock on it \uD83E\uDD18 \uD83E\uDD18 \uD83E\uDD18");
                break;
            default:
                cel = new Celula("You maxed out! \uD83E\uDD18 \uD83E\uDD18 \uD83E\uDD18 \uD83E\uDD18 \uD83E\uDD18 \uD83E\uDD18");
                break;
        }


        try {
            linha.adicionar(cel);
            tabela.adicionar(linha);
        } catch (IllegalArgumentException f) {
            System.err.println(f.getMessage());
        }

        return tabela;
    }

    private static void imprime(Tabela paramT) {
        paramT.imprimir();
    }

    private static void close() {
        System.out.println("======================END=======================");
    }

    private static void greetings() {
        System.out.println("=====================START======================");
        System.out.println("This is another exercise about Design Patterns");
        System.out.println("This time we are exercising the Composite structural pattern");
    }

    public static void main(String[] args) {
        int iterator = 0;
        App.greetings();
        String answer = ask("Would you like to see a demonstration?", options);

        while (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("1")) {
            App.imprime(App.populaParametros(new Tabela(), iterator));
            answer = ask("Would you like to see another demonstration?", options);
            iterator++;
        }

        App.close();
    }
}
