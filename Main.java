public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(Integer.parseInt("30"));
        int edad = persona.getEdad();
        System.out.println(edad);

        persona.setNombre("Kevin");
        String nombre = persona.getNombre();
        System.out.println(nombre);

        persona.setTeléfono(Integer.parseInt("30434834"));
        int teléfono = persona.getTeléfono();
        System.out.println(teléfono);

    }

    static class Persona {
        private int edad;

        public void setEdad (int edad) {
            this.edad = edad;
        }
        public int getEdad () {
            return this.edad;
        }
        private String nombre;

        public void setNombre (String nombre) {
            this.nombre = nombre;
        }
        public String getNombre() {
            return this.nombre;
        }
        private int teléfono;

        public void setTeléfono (int teléfono) {
            this.teléfono = teléfono;
        }
        public int getTeléfono() {
            return this.teléfono;
        }

    }

}