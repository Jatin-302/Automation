package org.jan_03_25;

import org.testng.annotations.Test;

public class SequenceEx1 {
    @Test(priority = 5)
    public void UpdateCustomer() {
        System.out.println("Capital Update customer TC");
    }
    @Test(priority = 5)
    public void CreateCustomer() {
        System.out.println("Capital Create customer TC");
    }
    @Test           //default priority = 0
    public void DeleteCustomer() {
        System.out.println("Capital Delete customer TC");
    }
    @Test(priority = 0)
    public void updateCustomer() {
        System.out.println("small update customer TC");
    }
    @Test(priority = -10)
    public void createCustomer() {
        System.out.println("small create customer TC");
    }
    @Test(priority = 75)
    public void deleteCustomer() {
        System.out.println("small delete customer TC");
    }
}
