package com.javajosh.javablog;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class RequestLogger implements Filter {
  private static final Logger log = LoggerFactory.getLogger(RequestLogger.class);

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    HttpServletRequest httpRequest = (HttpServletRequest) request;

    log.info("Incoming Request: Method: {}, Path: {}, Client IP: {}",
        httpRequest.getMethod(), httpRequest.getRequestURI(), httpRequest.getRemoteAddr());

    chain.doFilter(request, response);
  }
}
