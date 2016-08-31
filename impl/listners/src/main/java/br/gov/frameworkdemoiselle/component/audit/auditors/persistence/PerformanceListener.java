package br.gov.frameworkdemoiselle.component.audit.auditors.persistence;

import br.gov.frameworkdemoiselle.component.billing.domain.Trail;
import br.gov.frameworkdemoiselle.component.billing.implementation.AbstractAuditor;
import br.gov.frameworkdemoiselle.component.billing.implementation.util.Util;
import br.gov.frameworkdemoiselle.util.Beans;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author 70744416353
 */
@WebFilter(filterName = "Performance",
        urlPatterns = {"/*"}, initParams = {
            @WebInitParam(name = "service", value = "awake")})
public class PerformanceListener extends AbstractAuditor implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("" + filterConfig.getFilterName());
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Long time = System.currentTimeMillis();

        HttpServletRequest req = (HttpServletRequest) request;
        String caminho = req.getPathInfo();
//
//        for (final Enumeration<String> names = req.getHeaderNames(); names.hasMoreElements();) {
//            String name = names.nextElement();
//            System.out.println(name + " : " + req.getHeader(name));
//        }
//
        chain.doFilter(request, response);
//        System.out.println(" ================================= ");
//
//        HttpServletResponse res = (HttpServletResponse) response;
//        for (Iterator iterator = res.getHeaderNames().iterator(); iterator.hasNext();) {
//            String next = (String) iterator.next();
//            System.out.println(next + " : " + res.getHeader(next));
//        }

//        Trail trailBean = createTrailBean(object);
//        trailBean.setWhat("Consulted");
//
//        consume(trailBean);
        System.out.println(caminho + " : " + (System.currentTimeMillis() - time) + " ms ");
    }

    @Override
    public void destroy() {

    }

    private static final Logger LOG = Logger.getLogger(PerformanceListener.class.getName());

}
