package com.lzr.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lzr.result.JsonResult;
import com.lzr.result.ResultCode;
import com.lzr.result.ResultTool;
import com.lzr.utils.ResultErrorUtil;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author lzr
 * @Date 2023/2/21 15:40
 * @Description: TODO
 */

@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        if (e instanceof BadCredentialsException){
            JsonResult result = ResultTool.error(ResultCode.USER_CREDENTIALS_ERROR);
            ResultErrorUtil.renderString(response,new ObjectMapper().writeValueAsString(result));
        }else if (e instanceof InsufficientAuthenticationException){
            JsonResult result = ResultTool.error(ResultCode.USER_NOT_LOGIN);
            ResultErrorUtil.renderString(response,new ObjectMapper().writeValueAsString(result));
        }else {
            JsonResult result = ResultTool.error(ResultCode.Server_Internal_Error);
            ResultErrorUtil.renderString(response,new ObjectMapper().writeValueAsString(result));
        }
    }
}
