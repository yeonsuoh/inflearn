package com.security.springsecuritystudy.section2;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

public class AnonymousConfig {
//    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/anonymous").hasRole("GUEST")
                        .requestMatchers("/anonymousContext", "/authentication").permitAll()
                        .anyRequest().authenticated())
                .formLogin(Customizer.withDefaults())
                .anonymous(anonymous -> anonymous
                        .principal("guest")
                        .authorities("ROLE_GUEST")
                );


        return http.build();
    }

    // yml. properties에 적어두거나 아래처럼 bean으로 등록하여 인메모리 방식으로 설정 가능
    // yml 파일과 @Bean의 내용이 중복되면 ? @Bean의 내용이 우선 적용된다.
//    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withUsername("user")
                .password("{noop}1111")
                .roles("USER").build();
        return new InMemoryUserDetailsManager(user);
    }
}
