package com.example.md3mvcmodel.service;

import com.example.md3mvcmodel.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save (Customer customer);
    Customer findByID (int id);
    void update(int id, Customer customer);
    void remove (int id);
}
