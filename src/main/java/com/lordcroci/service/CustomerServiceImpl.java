package com.lordcroci.service;

import com.lordcroci.dao.CustomerDao;
import com.lordcroci.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    CustomerDao customerDao;

    @Transactional
    @Override
    public List<Customer> getCustomers()
    {
        return customerDao.getCustomers();
    }

    @Transactional
    @Override
    public void saveCustomer(Customer customer)
    {
        customerDao.saveCustomer(customer);
    }

    @Transactional
    @Override
    public Customer getCustomer(int id)
    {
        return customerDao.getCustomer(id);
    }

    @Transactional
    @Override
    public void deleteCustomer(int id)
    {
        customerDao.deleteCustomer(id);
    }
}
