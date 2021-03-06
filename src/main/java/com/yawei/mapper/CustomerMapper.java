package com.yawei.mapper;


import com.yawei.pojo.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CustomerMapper {
    void save(Customer customer);
    Customer findById(Integer id);
    List<Customer> findByCompanyid(Integer companyid);
    List<Customer> findAll();
    List<Customer> findByparam(Map<String, Object> params);
    Long count();
    Long findCountByParam(Map<String,Object> params);
    List<Customer> findByType(String typeCompany);

    void update(Customer customer1);

    void del(Integer id);

    List<Customer> findCustomerByCompanyid(Integer id);

    List<Customer> findAll(@Param("userid") Integer userid);

    Long findNewCustCount(@Param("start") String start, @Param("end") String end);
}
