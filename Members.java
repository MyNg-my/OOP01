public class Members {
    static class Teachers {
        String name;
        int birthYear;

        public Teachers(String name, int birthYear) {
            this.name = name;
            this.birthYear = birthYear;
        }

        public String getInfo() {
            return "Name: " + name + ", Birth Year: " + birthYear;
        }


    }

    static class Students{
        String name;
        int birthYear;
        String id;

        public Students(String name, int birthYear, String id) {
            this.name = name;
            this.birthYear = birthYear;
            this.id = id;
        }

        public String getInfo() {
            return "Name: " + name + ", Birth Year: " + birthYear + ", MSSV: " + id;
        }

    }

    static class Person {
        String name;
        int birthYear;

        public Person(String name, int birthYear) {
            this.name = name;
            this.birthYear = birthYear;
        }

        public String getInfo() {
            return "Name: " + name + ", Birth Year: " + birthYear;
        }

    }



}
