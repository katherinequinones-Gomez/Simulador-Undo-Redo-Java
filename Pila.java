public class Pila {

    String[] datos = new String[100];
    int cima = -1;

    // push: agregar elemento
    public void push(String texto) {
        cima++;
        datos[cima] = texto;
    }

    // pop: quitar elemento
    public String pop() {
        if (isEmpty()) {
            return "Nada para deshacer";
        }
        String temp = datos[cima];
        cima--;
        return temp;
    }

    // peek: mirar cima
    public String peek() {
        if (isEmpty()) {
            return "Pila vacía";
        }
        return datos[cima];
    }

    // isEmpty: verificar si está vacía
    public boolean isEmpty() {
        return cima == -1;
    }
}
