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

import java.util.*;

public class Network extends edu.berkeley.path.model_elements_base.Network {
  protected HashMap<Long, Link> linkById = null;
  protected HashMap<Long, Node> nodeById = null;
  protected HashMap<Long, Origin> originById = null;
  
  public Network() {
    
  }
  
  public void resolveReferences() {
    linkById = new HashMap<Long, Link>();
    nodeById = new HashMap<Long, Node>();
    originById = new HashMap<Long, Origin>();
    
    // pass 1: populate the HashMaps
    for (Node node : getNodeList()) {
      nodeById.put(node.getLongId(), node);
    }
    
    for (Link link : getLinkList()) {
      linkById.put(link.getLongId(), link);
    }
    
    for (Origin origin : getOriginList()) {
      originById.put(origin.getLongId(), origin);
    }
    
    // pass 2: set references
    for (Link link : getLinkList()) {
      link.resolveReferences(this);
      link.getBegin().resolveReferences(link);
      link.getEnd().resolveReferences(link);
    }

    for (Origin origin : getOriginList()) {
      origin.resolveReferences(this);
      // this doesn't make sense, so don't do it:
      // origin.getEnd().resolveReferences(origin);
    }
  }

  public Link getLinkById(Long id) {
    if (linkById == null) {
      resolveReferences();
    }
    
    return linkById.get(id);
  }

  public Node getNodeById(Long id) {
    if (nodeById == null) {
      resolveReferences();
    }
    
    return nodeById.get(id);
  }

  public Origin getOriginById(Long id) {
    if (originById == null) {
      resolveReferences();
    }
    
    return originById.get(id);
  }

  public Link getLinkById(String id) {
    return getLinkById(Long.parseLong(id));
  }

  public Node getNodeById(String id) {
    return getNodeById(Long.parseLong(id));
  }

  public Origin getOriginById(String id) {
    return getOriginById(Long.parseLong(id));
  }

  public Long getLongId() {
    return Long.parseLong(getId().toString());
  }
  
  public void setId(Long id) {
    setId(id.toString());
  }

  // TODO methods to add, remove, set links call resolveReferences
  // TODO find a better way to expose List<Node> access.
  
  /**
   * Set the nodes. Same as setNodes(), but works with a list of Node.
   */
  public void setNodeList(List<Node> value) {
    setNodes((List<edu.berkeley.path.model_elements_base.Node>)(List<?>)value);
  }
  
  /**
   * Set the links. Same as setLinks(), but works with a list of Link.
   */
  public void setLinkList(List<Link> value) {
    setLinks((List<edu.berkeley.path.model_elements_base.Link>)(List<?>)value);
  }
  
  /**
   * Set the origins. Same as setOrigins(), but works with a list of Origin.
   */
  public void setOriginList(List<Origin> value) {
    setOrigins((List<edu.berkeley.path.model_elements_base.Origin>)(List<?>)value);
  }
  
  /**
   * Get the nodes. Same as getNodes(), but works with a list of Node.
   * Never returns null (creates the list if it doesn't exist).
   */
  public List<Node> getNodeList() {
    if (null == getNodes()) {
      setNodes(new ArrayList<edu.berkeley.path.model_elements_base.Node>());
    }
    return (List<Node>)(List<?>)getNodes();
  }
  
  /**
   * Get the links. Same as getLinks(), but works with a list of Link.
   * Never returns null (creates the list if it doesn't exist).
   */
  public List<Link> getLinkList() {
    if (null == getLinks()) {
      setLinks(new ArrayList<edu.berkeley.path.model_elements_base.Link>());
    }
    return (List<Link>)(List<?>)getLinks();
  }
  
  /**
   * Get the origins. Same as getOrigins(), but works with a list of Origin.
   * Never returns null (creates the list if it doesn't exist).
   */
  public List<Origin> getOriginList() {
    if (null == getOrigins()) {
      setOrigins(new ArrayList<edu.berkeley.path.model_elements_base.Origin>());
    }
    return (List<Origin>)(List<?>)getOrigins();
  }
}
