    public class Funcionario {
        private String nome = "";
        private String sobrenome = "";
        private double salario = 0;

        public Funcionario(String n, String c, double s) {
            nome = n;
            sobrenome = c;
            salario = s;
        }

        public void setSalario(double h) {
            if (h >= 0 && h <= 20000) {
                salario = h;
            }
        }
    }


