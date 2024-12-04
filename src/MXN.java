public class MXN implements Divisa{
    public static double cantidad;

    public MXN(double cantidad){
        this.cantidad = cantidad;
    }

    public double toMXN(){
        return cantidad * 1;
    }

    public double toUSD(){
        return cantidad * 20.18;
    }

    public double toEUR(){
        return cantidad * 0.046;
    }

    public double toJPY(){
        return cantidad * 7.56;
    }
    public double toGBP(){
        return cantidad * 0.038;
    }

    @Override
    public void convertir(int opcionDestino) {
        switch(opcionDestino){
            case 1:
                System.out.printf("Resultado: %.2f", toMXN());
                break;
            case 2:
                System.out.printf("Resultado: %.2f", toUSD());
                break;
            case 3:
                System.out.printf("Resultado: %.2f", toEUR());
                break;
            case 4:
                System.out.printf("Resultado: %.2f", toGBP());
                break;
            case 5:
                System.out.printf("Resultado: %.2f", toJPY());
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}