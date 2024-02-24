public class Lesson4 {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan Ivanovich", "Engineer", "ivivan@mailbox.com", "892312312", "30000", "30");
        empArray[1] = new Employee("Sidorov Petr Vladislavovich", "HR manager", "sidorov@mail.ru", "890210101", "35000", "45");
        empArray[2] = new Employee("Petrichenko Petr Alexeevich", "Supply engineer", "ppetr@mail.ru", "890216781", "40000", "47");
        empArray[3] = new Employee("Aleksandrov Ilya Konstantinovich", "Manager", "aleksandrov.ilya@mail.ru", "890245101", "50000", "37");
        empArray[4] = new Employee("Efimov Vladimir Aleksandrovich", "Head of Sales department", "sidorov@mail.ru", "880210101", "80000", "40");
        for (Employee emp : empArray) {
            emp.printInfo();
        }


        Park park = new Park();
        park.testAttractions();
    }
}

class Employee {
    public String name;
    public String job;
    public String mail;
    public String number;
    public String salary;
    public String age;

    public Employee(String name, String job, String mail, String number, String salary, String age) {
        this.name = name;
        this.job = job;
        this.mail = mail;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Position: " + job + ", Email: " + mail +
                ", Phone: " + number + ", Salary: " + salary + ", Age: " + age);
        System.out.println();
    }
}

class Park {
    public class Attraction {
        private String name;
        private String time;
        private String price;

        public Attraction(String name, String time, String price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public String getPrice() {
            return price;
        }
    }

    public void addAttraction(String name, String time, String price) {
        Attraction newAttraction = new Attraction(name, time, price);
        System.out.println("New attraction added: " + newAttraction.getName());
        System.out.println("Operating Hours: " + newAttraction.getTime());
        System.out.println("Price: " + newAttraction.getPrice());
        System.out.println();
    }

    public void testAttractions() {
        addAttraction("Roller coaster", "12:00-14:00", "12 byn");
        addAttraction("Screaming room", "16:00-18:00", "14 byn");
    }
}