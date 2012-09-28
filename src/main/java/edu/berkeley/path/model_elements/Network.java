package edu.berkeley.path.model_elements;

import java.util.HashMap;

public class Network extends edu.berkeley.path.model_elements_base.Network {
  protected HashMap<Integer, Link> linkById = null;
  protected HashMap<Integer, Node> nodeById = null;
  
  public Network() {
    
  }
  
  public void resolveReferences() {
    linkById = new HashMap<Integer, Link>();
    nodeById = new HashMap<Integer, Node>();
    
    for (edu.berkeley.path.model_elements_base.Node node : getNodes()) {
      nodeById.put(Integer.parseInt(node.getId().toString()), (Node)node);
    }
    
    for (edu.berkeley.path.model_elements_base.Link link : getLinks()) {
      linkById.put(Integer.parseInt(link.getId().toString()), (Link)link);
    }
    
    //set up link refs to point to the link etc.
    
    // 
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
