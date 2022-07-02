package com.example.reedit.app.clone.config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//This is the main annotation which enables the Web Security module in our Project.
@EnableWebSecurity
//WebSecurityConfigurerAdapter is the base class for our SecurityConfig class,
// it provides us the default security configurations, which we can override
// in our SecurityConfig and customize them.
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//Method configure allows us to configure security in our project : we use HTTPS
    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/auth/**")
                .permitAll()
                .anyRequest()
                .authenticated();
    }

    //before storing the user in the database, we encode the password .
    //we use in this project the Bcrypt Algorithm
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
