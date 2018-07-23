package com.teye.gateway.service.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
@Component
public class PreFilter extends ZuulFilter{
	private Logger log=Logger.getLogger(PreFilter.class);
	@Override
	public boolean shouldFilter() {
		log.info("should filter");
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
	    HttpServletRequest request = ctx.getRequest();
 
	    log.info("PreFilter: " + String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
	    
	 
		return null;
	}

	@Override
	public String filterType() {
		log.info("pre filter type");
		return "pre";
	}

	@Override
	public int filterOrder() {
		log.info("filter order >>>>>>");
		return 1;
	}

}
