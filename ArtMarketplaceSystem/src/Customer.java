/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Customer {
    private String name;
    private String email;
    private String password;

public Customer(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
}

public boolean logIn(String inputEmail, String inputPassword) {
    return this.email.equals(inputEmail) && this.password.equals(inputPassword);
}

public String getName() { return name; }
public void setName(String name) { this.name = name; }

public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }

public String getPassword() { return password; }
public void setPassword(String password) { this.password = password; }
}