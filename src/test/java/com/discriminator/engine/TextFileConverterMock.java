package com.discriminator.engine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextFileConverterMock implements ITextFileConverter{

	private String[] stringArray;
	
	public TextFileConverterMock(String[] stringArray){
		this.stringArray = stringArray;
	}
	
	@Override
	public List<String> toList(String fileName) throws FileNotFoundException,
			IOException {
		List<String> words = new ArrayList<String>(Arrays.asList(stringArray));
		return words;
	}

}
