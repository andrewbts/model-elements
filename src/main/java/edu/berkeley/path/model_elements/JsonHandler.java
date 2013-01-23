/**
 * Copyright (c) 2012 The Regents of the University of California.
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */

package edu.berkeley.path.model_elements;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericContainer;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

/**
 * Read and write model elements objects from/to .json files. 
 * @author amoylan
 */
public class JsonHandler {

	/**
	 * Serialize the specified model elements object to JSON and write to the specified file.
	 * @param <T> Model elements type derived from Avro-built type
	 * @param obj Model elements object
	 * @param filename Filename ending in ".json" to write obj to
	 * @throws IOException
	 */
	public static <T extends GenericContainer> void writeToFile(T obj, String filename) throws IOException {
		
	    Schema schema = obj.getSchema();
	    
		FileOutputStream file = new FileOutputStream(new File(filename));
	    Encoder e = new EncoderFactory().jsonEncoder(schema, file);
	     
	    DatumWriter<T> writer = new SpecificDatumWriter<T>(schema);
	    
	    writer.write(obj, e);
	    
	    e.flush();	    
	    file.close();
	}
	
	/**
	 * Read a model elements object from the specified .json file
	 * @param <T> Model elements type read, e.g. Network or Link
	 * @param schema Avro schema. Should be T.SCHEMA$
	 * @param filename .json file to read from
	 * @return Model elements object of type T
	 * @throws IOException
	 */
	public static <T extends GenericContainer> T readFromFile(Schema schema, String filename) throws IOException {
		
		// Joel's trick: Tell Avro to create model_elements classes instead of model_elements_base classes
	    Schema.Parser parser = new Schema.Parser();
	    String schemaStr = schema.toString().replaceFirst(
	        "\"namespace\":\"edu.berkeley.path.model_elements_base\"",
	        "\"namespace\":\"edu.berkeley.path.model_elements\"");
		Schema schemaForReading = parser.parse(schemaStr);

		DatumReader<T> reader = new SpecificDatumReader<T>(schemaForReading);

		FileInputStream file = new FileInputStream(new File(filename));
		Decoder decoder = new DecoderFactory().jsonDecoder(schemaForReading, file);				
		
		T obj = reader.read(null, decoder);
		
		file.close();
		
		return(obj);

	}
	
	// A few special cases to read easily from a directory:
	
	public static Network readNetworkFromDirectory(String directory) throws IOException {
		Network network = readFromFile(Network.SCHEMA$, directory + "/Network.json");
		network.resolveReferences();
		return network;
	}
	
	public static DemandMap readDemandMapFromDirectory(String directory) throws IOException {
		return readFromFile(DemandMap.SCHEMA$, directory + "/DemandMap.json");
	}
	
	public static SplitRatioMap readSplitRatioMapFromDirectory(String directory) throws IOException {
		return readFromFile(SplitRatioMap.SCHEMA$, directory + "/SplitRatioMap.json");
	}
	
	public static FDMap readFDMapFromDirectory(String directory) throws IOException {
		return readFromFile(FDMap.SCHEMA$, directory + "/FDMap.json");
	}
	
	public static FreewayContextConfig readFreewayContextConfigFromDirectory(String directory) throws IOException {
		return readFromFile(FreewayContextConfig.SCHEMA$, directory + "/FreewayContextConfig.json");
	}

}
