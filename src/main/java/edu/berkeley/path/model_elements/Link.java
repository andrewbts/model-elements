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
    this.setBeginId(node.getId().toString());
  }

  public void setEnd(Node node) {
    this.end = node;
    this.setEndId(node.getId().toString());
  }
  
  public void resolveReferences(Network network) {
    this.begin = network.getNodeById(getBeginLongId());
    this.end = network.getNodeById(getEndLongId());
  }
  
  public Long getLongId() {
    return Long.parseLong(getId().toString());
  }
  
  public void setId(Long id) {
    setId(id.toString());
  }
  
  public Long getBeginLongId() {
    return Long.parseLong(getBeginId().toString());
  }
  
  public void setBeginLongId(Long id) {
    setBeginId(id.toString());
  }
  
  public Long getEndLongId() {
    return Long.parseLong(getEndId().toString());
  }
  
  public void setEndLongId(Long id) {
    setEndId(id.toString());
  }
  
  public String getNameString() {
    return (getName() == null) ? null : getName().toString();
  }
  
  public String getTypeString() {
    return (getType() == null) ? null : getType().toString();
  }
  
  public boolean isOrigin() {
    return getBegin().isTerminal();
  }
  
  public boolean isSinkLink() {
    return getEnd().isTerminal();
  }

  /**
   * Set the points. Same as setPoints(), but works with a list of Point.
   */
  @SuppressWarnings("unchecked")
public void setPointList(List<Point> value) {
    setPoints((List<edu.berkeley.path.model_elements_base.Point>)(List<?>)value);
  }
  
  /**
   * Get the points. Same as getPoints(), but works with a list of Point.
   * Never returns null (creates the list if it doesn't exist).
   */
  @SuppressWarnings("unchecked")
public List<Point> getPointList() {
    if (null == getPoints()) {
      setPoints(new ArrayList<edu.berkeley.path.model_elements_base.Point>());
    }
    return (List<Point>)(List<?>)getPoints();
  }
}
