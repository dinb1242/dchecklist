package com.dchecklist.boot

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig {

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http.formLogin().disable() // Form Login 해제

        // TODO: CSRF 해제 -> 추후 타임리프 개발 시 고려할 것.
        http.csrf().disable()

        // 엔드포인트 Auth 설정
        http.authorizeHttpRequests()
                .antMatchers("/**/h2-console/**").permitAll().and()

        // X-Frame-Option 해제
        http.headers()
                .frameOptions().sameOrigin().and()

        return http.build()
    }

}