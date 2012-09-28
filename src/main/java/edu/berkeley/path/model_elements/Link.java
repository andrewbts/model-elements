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
  
  public void resolveReferences(Network network) {
    this.begin = network.getNodeById(begin_id);
    this.end = network.getNodeById(end_id);
  }
}
