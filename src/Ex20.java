interface Animal {
    void fazerSom();
    void mover();
}

class Cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está correndo");
    }
}

class Gato implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato faz: Miau");
    }

    @Override
    public void mover() {
        System.out.println("O gato está andando silenciosamente");
    }
}

public class Ex20 {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.fazerSom();
        cachorro.mover();

        Animal gato = new Gato();
        gato.fazerSom();
        gato.mover();
    }
}
