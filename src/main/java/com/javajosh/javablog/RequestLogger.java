package com.javajosh.javablog;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import org.springframework.stereotype.Component;

@Component
public class RequestLogger implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    HttpServletRequest httpRequest = (HttpServletRequest) request;

    String requestLog =
        String.format(
            "Method: %s, Path: %s, Client IP: %s",
            httpRequest.getMethod(), httpRequest.getRequestURI(), httpRequest.getRemoteAddr());

    System.out.println("Incoming Request: " + requestLog);

    chain.doFilter(request, response);
  }
}
