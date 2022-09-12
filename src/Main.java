public class Main {
    static Employee[] employees = new Employee[10];

    public static double getSum() {
        double sum = 0;
        for (Employee value : employees) {
            sum = sum + value.getSalary();
        }
        return sum;
    }

    public static void getMaxSalary() {
        String expensiveEmployee = "";
        double maxPay = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxPay < employee.getSalary()) {
                maxPay = employee.getSalary();
                expensiveEmployee = employee.getFullname();
            }
        }
        System.out.println("Сотрудник с самой высокой зарплатой - " + expensiveEmployee);
    }

    public static void getMinSalary() {
        String cheapEmployee = " ";
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                cheapEmployee = employee.getFullname();
            }
        }
        System.out.println("Сотрудник с самой низкой зарплатой - " + cheapEmployee);
    }

    public static double averageSalary() {
        return Math.ceil(getSum() / employees.length);
    }

    public static void main(String[] args) {


        employees[0] = new Employee("Сидоров Иван Петрович", 3, Math.ceil(Math.random() * 100000));
        employees[1] = new Employee("Кузнецов Алексей Сергеевич", 5, Math.ceil(Math.random() * 100000));
        employees[2] = new Employee("Малинина Ольга Павловна", 1, Math.ceil(Math.random() * 100000));
        employees[3] = new Employee("Попова Мария Алексеевна", 2, Math.ceil(Math.random() * 100000));
        employees[4] = new Employee("Соколов Павел Дмитриевич", 4, Math.ceil(Math.random() * 100000));
        employees[5] = new Employee("Васильев Николай Борисович", 1, Math.ceil(Math.random() * 100000));
        employees[6] = new Employee("Михайлова Дарья Евгеньевна", 5, Math.ceil(Math.random() * 100000));
        employees[7] = new Employee("Цветков Роман Андреевич", 4, Math.ceil(Math.random() * 100000));
        employees[8] = new Employee("Жуков Андрей Иванович", 3, Math.ceil(Math.random() * 100000));
        employees[9] = new Employee("Зайцев Макар Петрович", 2, Math.ceil(Math.random() * 100000));


        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        System.out.println();
        System.out.println("Сумма затрат на зарплаты сотрудников в месяц составила - " + getSum());
        System.out.println("Средний размер оплаты труда сотрудников соствляет - " + averageSalary());
        System.out.println();

        for (Employee e : employees) {
            System.out.println(e.getFullname());
        }
        System.out.println();

        getMaxSalary();
        getMinSalary();
    }
}