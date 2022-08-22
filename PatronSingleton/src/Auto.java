public class Auto {
    private static Auto auto;
    private boolean arrancando = false;

    private Auto() {};

    public static Auto getInstance() {
        if (auto == null) {
            auto = new Auto();
        }
        return auto;
    }

    public boolean isArrancando() {

        if (!arrancando) {
            arrancando = true;
            System.out.println("Arrancando");
    }else{
            System.out.println("No se puede arrancar 2 veces");
        }

        return arrancando;
    }


}
