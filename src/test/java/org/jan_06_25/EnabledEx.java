package org.jan_06_25;

import org.testng.annotations.Test;

public class EnabledEx {
    @Test(enabled = false)
    public void createCustomerTC() {
        System.out.println("Create Customer");
    }

    @Test		// by default true
    public void updateCustomerTC() {
        System.out.println("Update Customer");
    }

    @Test(priority = 2, enabled = true)
    public void deleteCustomerTC() {
        System.out.println("Delete Customer");
    }
}
