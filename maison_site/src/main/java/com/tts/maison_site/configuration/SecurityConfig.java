package com.tts.maison_site.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    // @Override
    // protected void configure(HttpSecurity http) throws Exception {
    // http.authorizeRequests().antMatchers("/").permitAll();
    // http.headers().frameOptions().disable();
    // }

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private DataSource dataSource;

    @Value("${spring.queries.users-query}")
    private String usersQuery;

    @Value("${spring.queries.roles-query}")
    private String rolesQuery;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().usersByUsernameQuery(usersQuery).authoritiesByUsernameQuery(rolesQuery)
                .dataSource(dataSource).passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/cart").authenticated().antMatchers("/console/**").permitAll()
                .antMatchers("/").permitAll().antMatchers("/about").permitAll().antMatchers("/products").permitAll()
                .antMatchers("/blog").permitAll().antMatchers("/blogresult").permitAll().antMatchers("/products2")
                .permitAll().antMatchers("/galerie").permitAll().antMatchers("/cart").permitAll()
                .antMatchers("/blog.css").permitAll().antMatchers("/product.css").permitAll().antMatchers("/style.css")
                .permitAll().antMatchers("/login").permitAll().antMatchers("/signup").permitAll()
                .antMatchers("/custom.js").permitAll().antMatchers().hasAuthority("USER").anyRequest().authenticated()
                .and().csrf().disable().formLogin().loginPage("/login").failureUrl("/login?error=true")
                .defaultSuccessUrl("/").usernameParameter("username").passwordParameter("password").and().logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login").and()
                .exceptionHandling();

        http.headers().frameOptions().disable();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
    }
}