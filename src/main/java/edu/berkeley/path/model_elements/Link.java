package edu.berkeley.path.model_elements;

public class Link extends edu.berkeley.path.model_elements_base.Link {
  protected Node begin;
  protected Node end;
  
  public Node getBegin() {
    return begin;
  }

  public Node getEnd() {
    return end;
  }
  
  public void setBegin(Node node) {
    this.begin = node;
    this.beginId = node.getId().toString();
  }

  public void setEnd(Node node) {
    this.end = node;
    this.endId = node.getId().toString();
  }
  
  public void resolveReferences(Network network) {
    this.begin = network.getNodeById(Integer.parseInt(beginId.toString()));
    this.end = network.getNodeById(Integer.parseInt(endId.toString()));
  }
}
