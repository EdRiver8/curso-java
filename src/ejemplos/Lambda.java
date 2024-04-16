package ejemplos;

public class Lambda {
    public static void main(String[] args) {
        OperaCadenas compara = (a, b) -> (a == b) ? "Cadenas iguales" : "Cadenas diferentes";
        OperaCadenas compara2 = (a, b) -> {
            if (a.equals(b)) {
                return "Cadenas iguales";
            } else {
                return "Cadenas diferentes";
            }
        };

        OperaCadenas concatena = (c1, c2) -> c1 + c2;

        System.out.println(compara.opera("Hola", "Hola"));
        System.out.println(concatena.opera("Hola", " Mundo!!!"));

        OperaCadenas iniciaCon = (c1, c2) -> c1.startsWith(c2) ? "La cadena inicia con " + c2 : "La cadena no inicia con " + c2;
        System.out.println(iniciaCon.opera("Programando en Java", "Programando"));

        OperaCadenas terminaCon = (c1, c2) -> c1.endsWith(c2) ? "La cadena termina con " + c2 : "La cadena no termina con " + c2;
        System.out.println(terminaCon.opera("Hola Mundo", "Mundo"));

        OperaCadenas comparaIgnorandoMayMin = (c1, c2) -> c1.equalsIgnoreCase(c2) ? "Cadenas iguales ignorando mayúsculas y minúsculas" : "Cadenas diferentes ignorando mayúsculas y minúsculas";
        System.out.println(comparaIgnorandoMayMin.opera("Esta CaDENa Esta MAL", "esta cadena esta mal"));

        OperaCadenas buscaCadena = (c1, c2) -> c1.contains(c2) ? "La cadena contiene " + c2 : "La cadena no contiene " + c2;
        System.out.println(buscaCadena.opera("es", "Hoy es dia jueves"));



    }
}
