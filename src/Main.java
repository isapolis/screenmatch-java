import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión Java");
        //System.out.println("Pelicula Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                Matrix la mejor película del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0.0;
        System.out.println("Película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Ranking: " + evaluacion);
        System.out.println("Está incluido en el plan básico: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la Evaluación: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Película popular del 2023");
        } else {
            System.out.println("Película Retro que vale la pena ver");
        }
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println(" La media de la evaluación" +
                " Matrix calculada por el usuario es: " + mediaEvaluacionUsuario/3);

    }
}