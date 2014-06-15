package com.dsburroughs.fantasyfootball.runtime;

import java.io.IOException;

import com.dsburroughs.fantasyfootball.data.parsing.FantasyProsProjectionParser;

public class ProjectionParserRuntime {

	public static void main(String[] args) throws IOException {

		FantasyProsProjectionParser parser = new FantasyProsProjectionParser();

		System.out.println(parser.getWideRecieverList());
	}

}
