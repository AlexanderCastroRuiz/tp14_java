package ar.edu.et7.business;

public class Calculos implements CalculosInterface {

    @Override
    public float discount(float amount, float discount) {
        return amount - (amount * (discount / 100));
    }

    // Implementar otros métodos de la interfaz si es necesario
}
