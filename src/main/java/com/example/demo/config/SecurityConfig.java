package com.example.demo.config;

import com.okta.spring.boot.oauth.Okta;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // protect endpoint /api/orders
        http.authorizeRequests()
                .antMatchers("/api/orders/**")
                .authenticated()
                .and()
                .oauth2ResourceServer()
                .jwt();

        // add CORS filters
        http.cors();

        // force a non-empty response body for 401's to make the response more friendly
         Okta.configureResourceServer401ResponseBody(http);

         //disable CSRF: it uses cookies for session management with HTTP methods that manipulate the DB like post etc
        //so it block the post method when I want to post an order and it returns 403 forbidden error
        //I must disable this
        http.csrf().disable();

    }
}
