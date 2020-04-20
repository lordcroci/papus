package com.lordcroci.dao;

import com.lordcroci.entity.Customer;

import java.util.List;

public interface CustomerDao
{
    public List<Customer> getCustomers();
    public void saveCustomer(Customer customer);
    public Customer getCustomer(int id);
    public void deleteCustomer(int id);
}
