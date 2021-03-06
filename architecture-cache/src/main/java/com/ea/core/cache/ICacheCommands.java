package com.ea.core.cache;

import java.util.Set;

public interface ICacheCommands {

	public void set(String key, String value, int seconds) throws Exception;
	
	public Boolean expire(String key, int seconds) throws Exception;
	
	public Set<String> keys(final String pattern) throws Exception;
	
	public String get(String key) throws Exception;
	
	public Boolean exists(String key) throws Exception;
	
	public Boolean delete(String key) throws Exception;
	
	public Long decrBy(String key, long integer) throws Exception;

	public Long incrBy(String key, long integer) throws Exception;

	public Boolean append(String key, String value) throws Exception;
    
    public void shutdown() throws Exception;
    
    public Object getCommands();
}
