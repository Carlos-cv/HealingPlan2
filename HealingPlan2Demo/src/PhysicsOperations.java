import functions.PhysicsFunctions;

public class PhysicsOperations implements PhysicsFunctions {
    @Override
    public int distanciaAc(int[] distancia){
        int distInicial = distancia[0], velocidadIn = distancia[1], tiempo = distancia[2], aceleracion = distancia[3];
        int distance = distInicial + velocidadIn * tiempo + (aceleracion * (tiempo * tiempo)) / 2;
        return distance;
    }

    @Override
    public int velocidadAc(int[] velocidad) {
        int velocidadIn = velocidad[0], tiempo = velocidad[1], aceleracion = velocidad[2];
        int velocity = velocidadIn +  aceleracion * tiempo;
        return velocity;
    }

    @Override
    public int frecuencia(int[] longitudO) {
        int c = 299792458;
        int longitudOnda = longitudO[0];
        int frequency = c / longitudOnda;
        return frequency;
    }
}
