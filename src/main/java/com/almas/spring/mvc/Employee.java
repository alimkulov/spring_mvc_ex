package com.almas.spring.mvc;

import com.almas.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min=2,message = "name must be at least 2 letters!!")
    private String name;
    @NotEmpty(message="surname is obligatory field")
    @NotBlank(message="surname is obligatory field")
    private String surname;
    @Min(value=500, message = "must be more that 499")
    @Max(value=1000, message = "must be less than 1001")
    private int salary;
    private String department;
    private Map<String,String> deps;
    private String carBrand;
    private Map<String,String> carBrands;

    private String[] langs;

    private Map<String,String> langList;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}",message = "please use patter XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value="abc.com",message = "email must ends with abc.com")
    private String email;

    public Employee() {
        deps=new HashMap<>();
        deps.put("IT","Information Technology");
        deps.put("HR","Human Resources");
        deps.put("Sales","Sales");

        carBrands=new HashMap<>();
        carBrands.put("Chery","CHERY");
        carBrands.put("Gac","GAC");
        carBrands.put("Geely","GEELY");

        langList=new HashMap<>();
        langList.put("EN","English");
        langList.put("DE","Deutch");
        langList.put("FR","French");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public Map<String, String> getDeps() {
        return deps;
    }

    public void setDeps(Map<String, String> deps) {
        this.deps = deps;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLangs() {
        return langs;
    }

    public void setLangs(String[] langs) {
        this.langs = langs;
    }

    public Map<String, String> getLangList() {
        return langList;
    }

    public void setLangList(Map<String, String> langList) {
        this.langList = langList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
