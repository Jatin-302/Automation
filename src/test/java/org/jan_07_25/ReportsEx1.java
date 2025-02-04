package org.jan_07_25;

import org.testng.annotations.Test;

public class ReportsEx1 {

    @Test
    public void UpdateCustomer() {
        System.out.println("Capital Update customer TC");
    }

    @Test
    public void CreateCustomer() {
        System.out.println("Capital Create customer TC");
        int div = 10/0;
        System.out.println("division : " + div);
    }
    @Test
    public void DeleteCustomer() {
        System.out.println("Capital Delete customer TC");
    }

    @Test
    public void updateCustomer() {
        System.out.println("small update customer TC");
    }

    @Test
    public void createCustomer() {
        System.out.println("small create customer TC");
    }

    @Test
    public void deleteCustomer() {
        System.out.println("small delete customer TC");
    }

    @Test
    public void login() {
        System.out.println("Login");
    }

    @Test
    public void logout() {
        System.out.println("Logout");
    }
}
