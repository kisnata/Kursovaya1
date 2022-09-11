public class Employee {
    private final String fio;
    private int otdel;
    private double pay;
    private final int id;
    private static int counter = 1;


    public Employee(String fio, int otdel, double pay) {

        this.fio = fio;
        this.otdel = otdel;
        this.pay = pay;
        this.id = counter++;
    }

    public String getFio() {
        return fio;
    }

    public int getOtdel() {
        return otdel;
    }

    public double getPay() {
        return pay;
    }

    public int getId() {
        return id;
    }

    public void setOtdel(int Otdel) {
        otdel = otdel;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "| " + getId() + "| " + getFio() + "| " + getOtdel() + "| " + getPay() + "|";
    }
}