package com.canteen.interceptor;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebFilter(filterName = "wordsFilter", urlPatterns = "/*")
public class SensitiveWordFilter implements Filter {

    private List<String> sensitiveWords;

    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {
        // 初始化敏感词汇列表
        sensitiveWords = new ArrayList<>();
        sensitiveWords.add("傻逼");
        sensitiveWords.add("操你妈");
        sensitiveWords.add("屌");

        System.out.println("----------------------->过滤器2被创建");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // 获取请求参数（例如：表单提交的文本）
        String inputText = httpRequest.getParameter("inputText");

//        // 进行敏感词过滤
//        if (inputText != null) {
//            for (String word : sensitiveWords) {
//                if (inputText.contains(word)) {
//                    inputText = inputText.replace(word, "*" + "*".repeat(word.length() - 2) + "*");
//                }
//            }
//        }

        // 进行敏感词过滤
        if (inputText != null) {
            for (String word : sensitiveWords) {
                if (inputText.contains(word)) {
                    StringBuilder replacement = new StringBuilder();
                    for (int i = 0; i < word.length(); i++) {
                        replacement.append("*");
                    }
                    inputText = inputText.replace(word, replacement.toString());
                }
            }
        }

        // 将过滤后的参数重新设置回请求
        request.setAttribute("filteredText", inputText);

        // 继续处理请求
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("----------------------->过滤器2被销毁");
        // 清理资源（如果有需要的话）
    }
}
