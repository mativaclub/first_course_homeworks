package First_Course;

public class Course1 {

    public static boolean addEmployee(Employee[] employees, Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public static void printAllEmployees(Employee[] employees) {
        System.out.println("List of All employees");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static float calculateTotalSalary(Employee[] employees) {
        float sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + sum);
        return sum;
    }

    private static Employee minimumSalaryEmployee(Employee[] employees) {
        float min = employees[0].getSalary();
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                index = i;
            }
        }
        System.out.println("Сумма минимальной зарплаты в месяц составляет " + min +
                " и это сотрудник " + employees[index]);
        return employees[index];
    }

    private static Employee maximumSalary(Employee[] employees) {
        float max = employees[0].getSalary();
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                index = i;
            }
        }
        System.out.println("Сумма максимальной зарплаты в месяц составляет " + max +
                " и это сотрудник " + employees[index]);
        return employees[index];
    }

    private static float printAverageSalaries(Employee[] employees) {
        float sum = 0;
        int employeesQty = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employeesQty = i + 1;
            }
        }
        float average = sum / employeesQty;
        System.out.println("Средняя сумма затрат на зарплаты в месяц составляет " + average);
        return sum;
    }

    private static void printEmployeeName(Employee[] employeeNames) {
        System.out.println("Ф. И. О. всех сотрудников ");
        for (Employee employeeName : employeeNames) {
            if (employeeName != null) {
                System.out.println("Ф. И. О. сотрудникa " + employeeName.getFirstName() + " " +
                        employeeName.getLastName() + " " + employeeName.getMiddleName());
            } else if (employeeName == null) {
                System.out.println("EMPTY");
            }
        }
    }

    public static void printEmployees(Employee[] employees) {
        System.out.println("List of All employees");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            } else if (employees[i] == null) {
                System.out.println("EMPTY");
            }
        }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        addEmployee(employees, new Employee("Ivan", "Ivanov", "Ivanovich", 100000, 1));
        addEmployee(employees, new Employee("Pavel", "Pavlov", "Pavlovich", 20000, 2));
        addEmployee(employees, new Employee("Oleg", "Ivanov", "Olegovich", 30000, 3));
        addEmployee(employees, new Employee("Ruslan", "Ruslanov", "Ruslanovich", 40000, 4));
        addEmployee(employees, new Employee("Denis", "Denisov", "Denisovich", 50000, 5));
        addEmployee(employees, new Employee("Karina", "Markovna", "Olegovna", 60000, 1));
        addEmployee(employees, new Employee("Kristina", "Mikhalkova", "Ivanovna", 70000, 2));
        addEmployee(employees, new Employee("Anna", "Petrova", "Pavlovna", 80000, 3));
        addEmployee(employees, new Employee("Marina", "Ivanova", "Ruslanovna", 90000, 4));
        addEmployee(employees, new Employee("Diana", "Pavlova", "Denisovna", 250000, 5));

       //1. Получить список всех сотрудников со всеми имеющимися по ним данными (toString)
        printAllEmployees(employees);
        System.out.println();

        //2. Посчитать сумму затрат на зарплаты в месяц.
        calculateTotalSalary(employees);
        System.out.println();

        //3. Найти сотрудника с минимальной зарплатой.
        minimumSalaryEmployee(employees);
        System.out.println();

        //4. Найти сотрудника с максимальной зарплатой.
        maximumSalary(employees);
        System.out.println();

        //5. Подсчитать среднее значение зарплат.
        printAverageSalaries(employees);
        System.out.println();

        //6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
        printEmployeeName(employees);



    }
}
