/**
 * Copyright 2014 伊永飞
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ea.core.base.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ea.core.base.CoreDefinition;

public class AppServerBeanFactory {
	private static Logger logger = LoggerFactory.getLogger(AppServerBeanFactory.class);
	private static BeanFactory beanFactory;
	static{
		logger.info("初始化Storm的上下文环境（静态方式）！");
		ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext(CoreDefinition.getPropertyValue("topology.context.file"));
		beanFactory = springContext.getBeanFactory();
	}
	
	public static BeanFactory getBeanFactory(){
		return beanFactory;
	}
}
