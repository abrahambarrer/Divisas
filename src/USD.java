public class USD implements Divisa{
    public double cantidad;

    public USD(double cantidad){
        this.cantidad = cantidad;
    }

    public double toMXN(){
        return cantidad * 20.18;
    }

    public double toUSD(){
        return cantidad * 1;
    }

    public double toEUR(){
        return cantidad * 0.93;
    }

    public double toJPY(){
        return cantidad * 152.66;
    }
    public double toGBP(){
        return cantidad * 0.77;
    }

    @Override
    public void convertir(int opcionDestino) {
        switch(opcionDestino){
            case 1:
                System.out.printf("Resultado: %.2f", toMXN());
                break;
            case 2:
                System.out.printf("Resultado: %.2f",toUSD());
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
