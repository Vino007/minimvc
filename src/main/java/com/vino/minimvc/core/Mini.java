package com.vino.minimvc.core;

import com.vino.minimvc.route.RouteManager;

/**
 * 核心配置类,单例模式
 * 功能：添加路由,读取资源文件,读取配置
 * @author vino007
 *
 */
public final class Mini {
	private RouteManager routeManager;
	private static volatile Mini mini;
	//默认加载routeManager,render,configLoader
	private Mini(){
		
	}
	public static Mini getInstance(){
		if(mini==null){
			synchronized (Mini.class) {
				if(mini==null)
					mini=new Mini();
			}
		}
		return mini;
		
	}
	
}
