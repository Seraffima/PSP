import java.util.Arrays;
import java.util.Scanner;

public class ExamProg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letrasUC = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String letrasLC = "abcdefghijklmnñopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "@#$%&!";
        int opcion;
        do {
            System.out.println("Elegir una opción");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Cifrar texto");
            System.out.println("3. Generar contraseña segura");
            System.out.println("4. Informe de Actividad Sospechosa");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            String dummy = sc.nextLine();
            switch (opcion) {
                case 1:
                    int tries = 3;
                    String contrasena;
                    do {
                        System.out.println("Introduce la contraseña");
                        contrasena = sc.nextLine();
                        tries--;
                        if (!contrasena.equals("D6a1M24")) {
                            System.out.println("Contraseña incorrecta. Te quedan " + tries + " intentos");
                        }
                    } while (!contrasena.equals("D6a1M24") && tries > 0);
                    break;
                case 2:
                    String textoCodificado = "";
                    System.out.println("Introduce un texto");
                    String texto = sc.nextLine().toUpperCase();
                    System.out.println("Introduce la clave");
                    int desplazamiento = sc.nextInt();
                    char caracter;
                    for (int i = 0; i < texto.length(); i++) {
                        caracter = texto.charAt(i);
                        if (letrasUC.indexOf(caracter) != -1) {
                            textoCodificado += letrasUC.charAt((letrasUC.indexOf(caracter) + desplazamiento) % letrasUC.length());
                        } else {
                            textoCodificado += caracter;
                        }
                    }
                    System.out.println("El mensaje cifrado:" + textoCodificado);
                    System.out.println();
                    break;
                case 3:
                    String password;
                    System.out.println("Introduce la longitud de la contraseña (8-20)");
                    int longitud = sc.nextInt();
                    if (longitud < 8 || longitud > 20) {
                        System.out.println("Longitud incorrecta");
                    } else {
                        password = "";
                        for (int i = 0; i < longitud; i++) {
                            int eleccion = (int) (Math.random() * 4);
                            switch (eleccion) {
                                case 0:
                                    password += letrasUC.charAt((int) (Math.random() * letrasUC.length()));
                                    break;
                                case 1:
                                    password += letrasLC.charAt((int) (Math.random() * letrasLC.length()));
                                    break;
                                case 2:
                                    password += numeros.charAt((int) (Math.random() * numeros.length()));
                                    break;
                                case 3:
                                    password += simbolos.charAt((int) (Math.random() * simbolos.length()));
                                    break;
                            }
                        }
                        System.out.println("Contraseña generada: " + password);
                    }
                    break;
                case 4:
                    System.out.println("Informe de actividad sospechosa");
                    System.out.println("");
                    String [] agentes = {"Hermione", "Harry", "Draco", "Ron", "Luna", "Sirius", "Dobby"};
                    Integer [] intentos = {2, 3, 6, 4, 3, 1, 3};
                    int totalIntentos = 0;
                    int toSuspicious = 0;
                    int toDangerous = 0;
                    for (int i = 0; i < intentos.length; i++) {
                        totalIntentos += intentos[i];
                    }
                    System.out.println("Han habido un total de " + totalIntentos + " intentos fallidos de inicio de sesión. La media de intentos fallidos es de " + (totalIntentos / intentos.length) + " intentos por agente.");
                    int mayoresQueMedia = 0;
                    for (int i = 0; i < agentes.length; i++) {
                        if (intentos[i] > (totalIntentos / intentos.length)) {
                            mayoresQueMedia++;
                            if (intentos[i] > 3 && intentos[i] < 6) {
                                toSuspicious++;
                            } else if (intentos[i] >= 6) {
                                toDangerous++;
                            }
                        }
                    } System.out.println("Hay " + mayoresQueMedia + " agentes con más intentos fallidos que la media.");
                    int toNormal = agentes.length - toSuspicious - toDangerous;
                    String [] agentesNormales = new String[toNormal];
                    String [] agentesSospechosos = new String[toSuspicious];
                    String [] agentesPeligrosos = new String[toDangerous];
                    int normalIndex = 0, suspiciousIndex = 0, dangerousIndex = 0;
                    System.out.println("Intentos Normales");
                    System.out.println("====================");
                    for (int i = 0; i < agentes.length; i++) {
                        if (intentos[i] <= 3) {
                            agentesNormales[normalIndex++] = (agentes[i] + " - " + intentos[i].toString());
                        }
                    }
                    System.out.println(Arrays.toString(agentesNormales));
                    System.out.println("Intentos Sospechosos");
                    System.out.println("====================");
                    for (int i = 0; i < agentes.length; i++) {
                        if ( 3 < intentos[i] && intentos[i] < 6) {
                            agentesSospechosos[suspiciousIndex] = (agentes[i] + " - " + intentos[i].toString());
                        }
                    }
                    System.out.println(Arrays.toString(agentesSospechosos));
                    System.out.println("Intentos Peligrosos");
                    System.out.println("====================");
                    for (int i = 0; i < agentes.length; i++) {
                        if (6 <= intentos[i]) {
                            agentesPeligrosos[dangerousIndex] = (agentes[i] + " - " + intentos[i].toString());
                        }
                    }
                    System.out.println(Arrays.toString(agentesPeligrosos));
                    break;

                case 5:
                    System.out.println("Se ha salido del sistema de manera segura");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while(opcion!=5);
    }
}
