package edu.berkeley.path.model_elements;

import java.util.*;

public class Node extends edu.berkeley.path.model_elements_base.Node {
  protected HashMap<Node, HashSet<Link>> outLinksToNode;
  protected HashMap<Node, HashSet<Link>> inLinksFromNode;
  
  public HashSet<Link> getAllOutLinks() {
    HashSet<Link> links = new HashSet<Link>();
    
    for (Node node : this.outLinksToNode.keySet()) {
      for (Link link : this.outLinksToNode.get(node)) {
        links.add(link);
      }
    }
    
    return links;
  }
  
  public HashSet<Link> getAllInLinks() {
    HashSet<Link> links = new HashSet<Link>();
    
    for (Node node : this.inLinksFromNode.keySet()) {
      for (Link link : this.inLinksFromNode.get(node)) {
        links.add(link);
      }
    }
    
    return links;
  }
  
  public HashSet<Link> getOutLinksToNode(Node node) {
    return outLinksToNode.get(node);
  }

  public HashSet<Link> getInLinksFromNode(Node node) {
    return inLinksFromNode.get(node);
  }
  
  public void resolveReferences(Link link) {
    HashSet<Link> links;
    
    if (link.begin == this) {
      if (this.outLinksToNode == null) {
        this.outLinksToNode = new HashMap<Node, HashSet<Link>>();
      }
      
      links = this.outLinksToNode.get(link.end);
      if (links == null) {
        links = new HashSet<Link>();
        this.outLinksToNode.put(link.end, links);
      }
      links.add(link);
    }
    else if (link.end == this) {
      if (this.inLinksFromNode == null) {
        this.inLinksFromNode = new HashMap<Node, HashSet<Link>>();
      }
      
      links = this.inLinksFromNode.get(link.begin);
      if (links == null) {
        links = new HashSet<Link>();
        this.inLinksFromNode.put(link.begin, links);
      }
      links.add(link);
    }
  }
}
