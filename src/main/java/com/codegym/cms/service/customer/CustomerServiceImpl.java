package com.codegym.cms.service.customer;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import com.codegym.cms.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerServiceImpl implements ICustomerService{
    @Autowired
    ICustomerRepository customerRepository;
    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }
    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }
    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
customerRepository.deleteById(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }
    @Override
    public Page<Customer> findAllByNameContaining(String name, Pageable pageable) {
        return customerRepository.findAllByNameContaining(name, pageable);
    }
}
