package Raka.Pratama.Application;

import Raka.Pratama.Data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Nintendo");

        Company.Employee employee = company.new Employee();
        employee.setName("Joko");

        Company company1 = new Company();
        company1.setName("Playstation");

        Company.Employee employee1 = company1.new Employee();
        employee1.setName("Rika");

        System.out.println(company.getName());
        System.out.println(employee.getName());
        System.out.println(company1.getName());
        System.out.println(employee1.getName());
    }
}
