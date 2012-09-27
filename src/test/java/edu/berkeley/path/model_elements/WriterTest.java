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
 * 3. Neither the name of the University nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
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

import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;

import edu.berkeley.path.model_elements.*;

import java.io.File;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

import org.apache.commons.io.FileUtils;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecord;
import org.apache.avro.generic.GenericData;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.io.Encoder;

public class WriterTest {
  Network nw;
  Schema schema;
  
  @Before
  public void setup() {
    nw = new Network();
    schema = nw.getSchema();

    nw.setId("42");
    nw.setName("test network");

     nw.setNodes(
      new ArrayList<edu.berkeley.path.model_elements_base.Node>(2)
    );
    nw.setLinks(
      new ArrayList<edu.berkeley.path.model_elements_base.Link>(1)
    );
    
    Node nd;
    Link ln;

    nd = new Node();
    nd.setId("1");
    nd.setName("one");
    nd.setType("hwy");
    nw.nodes.add(nd);

    nd = new Node();
    nd.setId("2");
    nd.setName("two");
    nd.setType("hwy");
    nw.nodes.add(nd);

    ln = new Link();
    ln.setId("3");
    ln.setName("two");
    ln.setType("hwy");
    ln.setLaneCount(4.0);
    ln.setLength(1000.0);
    
    ln.begin = new NodeRef();
    ln.begin.setNodeId("1");
    ln.end = new NodeRef();
    ln.end.setNodeId("2");
    
    nw.links.add(ln);
  }

  @Test
  public void testWriteNetworkToBinaryFile() throws IOException {
    new File("tmp").mkdirs();
    File file = new File("tmp/data.avro");
    
    DatumWriter<Network> writer =
      new SpecificDatumWriter<Network>(schema);
    
    DataFileWriter<Network> dataFileWriter =
      new DataFileWriter<Network>(writer);
    
    dataFileWriter.create(schema, file);
    dataFileWriter.append(nw);
    dataFileWriter.close();
    
    // TODO assert something
  }

  @Test
  public void testWriteNetworkToByteBuffer() throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    EncoderFactory ef = new EncoderFactory();
    Encoder e = ef.binaryEncoder(out, null);
     
    DatumWriter<Network> writer =
      new SpecificDatumWriter<Network>(schema);
    
    writer.write(nw, e);
    e.flush();
    ByteBuffer serialized = ByteBuffer.allocate(out.toByteArray().length);
    serialized.put(out.toByteArray());
    
    // TODO assert something
  }

  @Test
  public void testWriteNetworkToJson() throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    EncoderFactory ef = new EncoderFactory();
    Encoder e = ef.jsonEncoder(schema, out);
     
    DatumWriter<Network> writer =
      new SpecificDatumWriter<Network>(schema);
    
    writer.write(nw, e);
    e.flush();
    
    String actual = out.toString();
    
//     System.out.println("serialized:\n");
//     System.out.println(actual);
//     System.out.println("---\n");
    
    String expected = FileUtils.readFileToString(
      new File("src/test/resources/fixtures/NetworkToJson.json"));

    if (expected.endsWith("\n")) {
        expected = expected.substring(0, expected.length() - 1);
    }

    if (expected.endsWith("\r")) {
        expected = expected.substring(0, expected.length() - 1);
    }

//     System.out.println("fixture:\n");
//     System.out.println(expected);
//     System.out.println("---\n");
    
    assertEquals(expected, actual);
  }
}
