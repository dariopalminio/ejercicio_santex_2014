package com.discriminator.engine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ITextFileConverter {

	public List<String> toList(String fileName) throws FileNotFoundException, IOException;
		
	
}
