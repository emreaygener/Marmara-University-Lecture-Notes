interface Radar{
    double getKphSpeed();
    void showPaymentInfo();
}
interface MileRadar{
    double getMphSpeed();
    void showPaymentInfo();
}

class CarWithSpeedInKm implements Radar{

    private String licensePlate;
    private double speed;

    public static double MAX_KPH_SPEED = 120;

    public CarWithSpeedInKm(String licensePlate, double speed) {
        this.licensePlate = licensePlate;
        this.speed = speed;
    }

    @Override
    public double getKphSpeed() {
        return speed;
    }

    @Override
    public void showPaymentInfo() {
        if(speed>MAX_KPH_SPEED){

            PaymentCalculator paymentCalculator = new PaymentCalculator();
            double payment = paymentCalculator.calculatePaymentForSpeed(this);

            System.out.println(licensePlate+" plakalı aracın hız aşımı yaptığı tespit edilmiştir.");
            System.out.println("Hız aşımı sebebi ile ödenmesi gereken ceza "+payment+" TL'dir.");

        }
        else{
            System.out.println(licensePlate+" plakalı araca ait herhangi bir hız aşımı cezası bulunmamaktadır.");
        }
    }
}

class CarWithSpeedInMph implements MileRadar{

    private String licensePlate;
    private double speed;


    public CarWithSpeedInMph(String licensePlate, double speed) {
        this.licensePlate = licensePlate;
        this.speed = speed;
    }

    @Override
    public double getMphSpeed() {
        return speed;
    }

    @Override
    public void showPaymentInfo() {

        MphToKphAdapter adapter = new MphToKphAdapter(this);

        if(adapter.getKphSpeed()>CarWithSpeedInKm.MAX_KPH_SPEED){

            PaymentCalculator paymentCalculator = new PaymentCalculator();
            double payment = paymentCalculator.calculatePaymentForSpeed(adapter);

            System.out.println(licensePlate+" plakalı aracın hız aşımı yaptığı tespit edilmiştir.");
            System.out.println("Hız aşımı sebebi ile ödenmesi gereken ceza "+payment+" TL'dir.");

        }
        else{
            System.out.println(licensePlate+" plakalı araca ait herhangi bir hız aşımı cezası bulunmamaktadır.");
        }
    }
}

class MphToKphAdapter implements Radar{

    private CarWithSpeedInMph carWithSpeedInMph;
    private static double KPH_MPH_RATE = 0.6213;

    public MphToKphAdapter(CarWithSpeedInMph carWithSpeedInMph) {
        this.carWithSpeedInMph = carWithSpeedInMph;
    }

    @Override
    public double getKphSpeed() {
        return (carWithSpeedInMph.getMphSpeed()/KPH_MPH_RATE);
    }

    @Override
    public void showPaymentInfo() {

    }
}

class PaymentCalculator{

    private static double KPH_PAYMENT_RATE = 26.85;

    public double calculatePaymentForSpeed(Radar radar){
        double difference =  radar.getKphSpeed() - CarWithSpeedInKm.MAX_KPH_SPEED;
        return difference * KPH_PAYMENT_RATE;

    }
}

public class AdapterMain {
    public static void main(String[] args){

        CarWithSpeedInKm carWithSpeedInKm = new CarWithSpeedInKm("TR 12 34",150);
        CarWithSpeedInMph carWithSpeedInMph = new CarWithSpeedInMph("US 56 78",93.195);

        carWithSpeedInKm.showPaymentInfo();
        System.out.println("--");
        carWithSpeedInMph.showPaymentInfo();
    }
}