package com.dreamertn9527;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dreamertn9527Application {

	private final LoadingCache<String, String> cache = CacheBuilder.newBuilder()
			.maximumSize(1000)
			.refreshAfterWrite()
			.build(new CacheLoader<String, String>() {
				@Override
				public String load(String s) throws Exception {
					return null;
				}
			});

	public static void main(String[] args) {
		SpringApplication.run(Dreamertn9527Application.class, args);
	}
}
