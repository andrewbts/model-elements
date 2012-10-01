package edu.berkeley.path.model_elements;

import java.util.*;

public class Network extends edu.berkeley.path.model_elements_base.Network {
  protected HashMap<Integer, Link> linkById = null;
  protected HashMap<Integer, Node> nodeById = null;
  
  public Network() {
    
  }
  
  public void resolveReferences() {
    linkById = new HashMap<Integer, Link>();
    nodeById = new HashMap<Integer, Node>();
    
    // pass 1: populate the HashMaps
    for (Node node : (List<Node>)(List<?>)getNodes()) {
      nodeById.put(Integer.parseInt(node.getId().toString()), node);
    }
    
    for (Link link : (List<Link>)(List<?>)getLinks()) {
      linkById.put(Integer.parseInt(link.getId().toString()), link);
    }
    
    // pass 2: set references
    for (Link link : (List<Link>)(List<?>)getLinks()) {
      link.resolveReferences(this);
      link.getBegin().resolveReferences(link);
      link.getEnd().resolveReferences(link);
    }
  }

  public Link getLinkById(Integer id) {
    if (linkById == null) {
      resolveReferences();
    }
    
    return linkById.get(id);
  }

  public Node getNodeById(Integer id) {
    if (nodeById == null) {
      resolveReferences();
    }
    
    return nodeById.get(id);
  }

  public Link getLinkById(String id) {
    return getLinkById(Integer.parseInt(id));
  }

  public Node getNodeById(String id) {
    return getNodeById(Integer.parseInt(id));
  }

  // TODO methods to add, remove, set links call resolveReferences
}
