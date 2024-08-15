package calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char repetir;
        do {
            System.out.println("Digite o nome do aluno");
            String aluno = sc.next();
            System.out.println("Digite a nota da matéria");
            System.out.println("Português");
            double portugues = sc.nextDouble();
            System.out.println("Matemática");
            double matematica = sc.nextDouble();
            System.out.println("Inglês");
            double ingles = sc.nextDouble();
            System.out.println("Geografia");
            double geografia = sc.nextDouble();
            System.out.println("História");
            double historia = sc.nextDouble();
            System.out.println("Ciências");
            double ciencias = sc.nextDouble();
            System.out.println("Artes");
            double artes = sc.nextDouble();

            
            System.out.println("Nome do aluno: " + aluno);
            System.out.println("Pontuação total de cada matéria;");
            if (portugues < 12) {
                System.out.println("Reprovado em Português com: " + portugues + " pontos");
            } else if (portugues <= 59) {
                System.out.println("Recuperação em Português com: " + portugues + " pontos.");
            } else {
                System.out.println("Aprovado em Português com: " + portugues + " pontos.");
            }

            if (matematica < 12) {
                System.out.println("Reprovado em Matemática com: " + matematica + " pontos.");
            } else if (matematica <= 59) {
                System.out.println("Recuperação em Matemática com: " + matematica + " pontos.");
            } else {
                System.out.println("Aprovado em Matemática com: " + matematica + " pontos.");
            }

            if (ingles < 12) {
                System.out.println("Reprovado em Inglês com: " + ingles + " pontos.");
            } else if (ingles <= 59) {
                System.out.println("Recuperação em Inglês com: " + ingles + " pontos.");
            } else {
                System.out.println("Aprovado em Inglês com: " + ingles + " pontos.");
            }

            if (geografia < 12) {
                System.out.println("Reprovado em Geografia com: " + geografia + " pontos.");
            } else if (geografia <= 59) {
                System.out.println("Recuperação em Geografia com: " + geografia + " pontos.");
            } else {
                System.out.println("Aprovado em Geografia com: " + geografia + " pontos.");
            }

            if (historia < 12) {
                System.out.println("Reprovado em História com: " + historia + " pontos.");
            } else if (historia <= 59) {
                System.out.println("Recuperação em História com: " + historia + " pontos.");
            } else {
                System.out.println("Aprovado em História com: " + historia + " pontos.");
            }

            if (ciencias < 12) {
                System.out.println("Reprovado em Ciências com: " + ciencias + " pontos.");
            } else if (ciencias <= 59) {
                System.out.println("Recuperação em Ciências com: " + ciencias + " pontos.");
            } else {
                System.out.println("Aprovado em Ciências com: " + ciencias + " pontos.");
            }

            if (artes < 12) {
                System.out.println("Reprovado em Artes com: " + artes + " pontos.");
            } else if (artes <= 59) {
                System.out.println("Recuperação em Artes com: " + artes + " pontos.");
            } else {
                System.out.println("Aprovado em Artes com: " + artes + " pontos.");
            }

            System.out.println();
            System.out.println("APROVADO NAS MATÉRIAS");

            if (portugues >= 60) {
                System.out.print("Português ");
            }
            if (matematica >= 60) {
                System.out.print("Matemática ");
            }
            if (ingles >= 60) {
                System.out.print("Inglês ");
            }
            if (geografia >= 60) {
                System.out.print("Geografia ");
            }
            if (historia >= 60) {
                System.out.print("História ");
            }
            if (ciencias >= 60) {
                System.out.print("Ciências ");
            }
            if (artes >= 60) {
                System.out.print("Artes ");
            }
            System.out.println();

            System.out.println("REPROVADO NAS MATÉRIAS");

            if (portugues < 12) {
                System.out.print("Português ");
            }
            if (matematica < 12) {
                System.out.print("Matemática ");
            }
            if (ingles < 12) {
                System.out.print("Inglês ");
            }
            if (geografia < 12) {
                System.out.print("Geografia ");
            }
            if (historia < 12) {
                System.out.print("História ");
            }
            if (ciencias < 12) {
                System.out.print("Ciências ");
            }
            if (artes < 12) {
                System.out.print("Artes ");
            }
            System.out.println();

            System.out.println("RECUPERAÇÃO NAS MATÉRIAS");
            
            if (portugues >= 12 && portugues <= 59) {
                System.out.print("Português ");
            }
            if (matematica >= 12 && matematica <= 59) {
                System.out.print("Matemática ");
            }
            if (ingles >= 12 && ingles <= 59) {
                System.out.print("Inglês ");
            }
            if (geografia >= 12 && geografia <= 59) {
                System.out.print("Geografia ");
            }
            if (historia >= 12 && historia <= 59) {
                System.out.print("História ");
            }
            if (ciencias >= 12 && ciencias <= 59) {
                System.out.print("Ciências ");
            }
            if (artes >= 12 && artes <= 59) {
                System.out.print("Artes ");
            }
            System.out.println();

            System.out.println("PONTOS QUE FALTAM PARA PASSAR");

            double falta = 0;
            
            
            if (portugues >= 12 && portugues < 60) {
                falta = 60 - portugues;
                if (falta == 1) {
                    System.out.println("Português, falta: " + falta + " ponto.");
                } else {
                    System.out.printf("Português, faltam: %.2f pontos.%n", falta);
                }
            }
            
            if (matematica >= 12 && matematica < 60) {
                falta = 60 - matematica;
                if (falta == 1) {
                    System.out.println("Matemática, falta: " + falta + " ponto.");
                } else {
                    System.out.printf("Matemática, faltam: %.2f pontos.%n", falta);
                }
            }
            
            if (ingles >= 12 && ingles < 60) {
                falta = 60 - ingles;
                if (falta == 1) {
                    System.out.println("Inglês, falta: " + falta + " ponto.");
                } else {
                    System.out.printf("Inglês, faltam: %.2f pontos.%n", falta);
                }
            }
            
            if (geografia >= 12 && geografia < 60) {
                falta = 60 - geografia;
                if (falta == 1) {
                    System.out.println("Geografia, falta: " + falta + " ponto.");
                } else {
                    System.out.printf("Geografia, faltam: %.2f pontos.%n", falta);
                }
            }
            
            if (historia >= 12 && historia < 60) {
                falta = 60 - historia;
                if (falta == 1) {
                    System.out.println("História, falta: " + falta + " ponto.");
                } else {
                    System.out.printf("História, faltam: %.2f pontos.%n", falta);
                }
            }
            
            if (ciencias >= 12 && ciencias < 60) {
                falta = 60 - ciencias;
                if (falta == 1) {
                    System.out.println("Ciências, falta: " + falta + " ponto.");
                } else {
                    System.out.printf("Ciências, faltam: %.2f pontos.%n", falta);
                }
            }
            
            if (artes >= 12 && artes < 60) {
                falta = 60 - artes;
                if (falta == 1) {
                    System.out.println("Artes, falta: " + falta + " ponto.");
                } else {
                    System.out.printf("Artes, faltam: %.2f pontos.%n", falta);
                }
            }

            System.out.println();
            System.out.println("Deseja repetir (s/n)");
            repetir = sc.next().charAt(0);
        } while (repetir != 'n');

        System.out.println("Terminou");

        sc.close();
    }
}

