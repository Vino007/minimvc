package com.vino.minimvc.route;

import java.lang.reflect.Method;

import com.vino.minimvc.web.HttpMethod;
/**
 * 路由
 * @author vino007
 *
 */
public class Route {
	private String path;
	private HttpMethod method;
	private Method action;
	private Object controller;
	
}
