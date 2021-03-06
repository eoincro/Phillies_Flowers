 package com.cit.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;

import com.cit.basepackage.entities.Customer;
import com.cit.repositories.CustomerRepo;



@Configuration

public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AccessDeniedHandler accessDeniedHandler;
	@Autowired
	CustomerRepo customerRepo;
	


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/", "/home", "/about").permitAll()
                .antMatchers("/admin/**").hasAnyRole("ADMIN")
                .antMatchers("/customer/**").hasAnyRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .and()
                .exceptionHandling().accessDeniedHandler(accessDeniedHandler);
    }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    	List<Customer> customerList = customerRepo.findAll();
    	/*for(Customer c : customerList){
            if(c.getName() != null && c.getName().contains(search))
            {
            	String username = c.getName();
            	String password = c.getPassword();
            	
                auth.inMemoryAuthentication()
                .withUser(username).password(password).roles("USER")
                .and()
                .withUser("admin").password("password").roles("ADMIN");
            }
               //something here
        }*/
    	String name = customerList.get(0).getName();
    	String password = customerList.get(0).getPassword();
    	auth.inMemoryAuthentication()
        .withUser(name).password(password).roles("USER")
        .and()
        .withUser("admin").password("password").roles("ADMIN");
    }

}
