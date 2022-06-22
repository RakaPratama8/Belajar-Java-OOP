package Raka.Pratama.Data;

public class Company {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee { //Inner Class
        private String name;

        public String getCompany(){
            return Company.this.getName(); //we can have private company access
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}
