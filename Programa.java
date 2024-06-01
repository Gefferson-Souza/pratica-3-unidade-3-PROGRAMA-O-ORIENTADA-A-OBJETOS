public class Programa {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[3];
        figuras[0] = new Retangulo("Retangulo", 10, 5);
        figuras[1] = new Triangulo("Triangulo", 10, 5);
        figuras[2] = new Circulo("Circulo", 5);

        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.getDescricao());
            System.out.printf( "Area da figura: %.2f \n", figura.getArea() );
        }
    }
}

abstract class FiguraGeometrica {
    private String nome;

    FiguraGeometrica(String nome) {
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract String getDescricao();

    public abstract double getArea();
}

class Retangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    Retangulo(String nome, double base, double altura) {
        super(nome);
        setBase(base);
        setAltura(altura);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double getArea() {
        return getBase() * getAltura();
    }

    @Override
    public String getDescricao() {
        return getNome() + ", base: " + getBase() + ", altura: " + getAltura();
    }
}

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    Triangulo(String nome, double base, double altura) {
        super(nome);
        setBase(base);
        setAltura(altura);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double getArea() {
        return ((getBase() * getAltura()) / 2);
    }

    @Override
    public String getDescricao() {
        return getNome() + ", base: " + getBase() + ", altura: " + getAltura();
    }
}

class Circulo extends FiguraGeometrica {
    private double raio;

    Circulo(String nome, double raio) {
        super(nome);
        setRaio(raio);
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    @Override
    public String getDescricao() {
        return getNome() + ", Raio: " + getRaio();
    }
}
