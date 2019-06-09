package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class TestRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<String> nonargs =args.getNonOptionArgs();
		System.out.println(nonargs);
		Set<String> optionnames = args.getOptionNames();
		System.out.println(optionnames);
		List<String> optionvalues= args.getOptionValues("db");
		System.out.println(optionvalues);
		String[] all = args.getSourceArgs();
		System.out.println(Arrays.asList(all));

	}

}
