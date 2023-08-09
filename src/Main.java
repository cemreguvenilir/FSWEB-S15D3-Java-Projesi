import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1,"Cemre", "Güvenilir"));
        employees.add(new Employee(1,"Cemre", "Güvenilir"));
        employees.add(new Employee(2,"Melih", "Şeker"));
        employees.add(new Employee(3,"Ceren", "Güvenilir"));
        System.out.println(employees);

        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removed = new ArrayList<>();

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if(employeeMap.containsKey(employee.getId())){
                removed.add(employee);
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }

        for (Employee employee: removed){
            employees.remove(employee);
        }
        System.out.println(employees);
        System.out.println(employeeMap);

    }
}