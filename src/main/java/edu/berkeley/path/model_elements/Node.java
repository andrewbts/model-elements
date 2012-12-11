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

public class Node extends edu.berkeley.path.model_elements_base.Node {
	@Deprecated private HashMap<Node, HashSet<Link>> outLinksToNode;
	@Deprecated private HashMap<Node, HashSet<Link>> inLinksFromNode;
		
	protected HashMap<Node, HashSet<Link>> getOutLinksToNodeMap() {
		if (this.outLinksToNode == null)
			this.outLinksToNode = new HashMap<Node, HashSet<Link>>();

		return outLinksToNode;
	}

	protected HashMap<Node, HashSet<Link>> getInLinksFromNodeMap() {
		if (this.inLinksFromNode == null)
			this.inLinksFromNode = new HashMap<Node, HashSet<Link>>();

		return inLinksFromNode;
	}

	public HashSet<Link> getAllOutLinks() {
		HashSet<Link> links = new HashSet<Link>();

		for (Node node : getOutLinksToNodeMap().keySet()) {
			for (Link link : getOutLinksToNodeMap().get(node)) {
				links.add(link);
			}
		}

		return links;
	}

	public HashSet<Link> getAllInLinks() {
		HashSet<Link> links = new HashSet<Link>();

		for (Node node : this.getInLinksFromNodeMap().keySet())
			for (Link link : this.getInLinksFromNodeMap().get(node))
				links.add(link);

		return links;
	}

	public HashSet<Link> getOutLinksToNode(Node node) {
		return getOutLinksToNodeMap().get(node);
	}

	public HashSet<Link> getInLinksFromNode(Node node) {
		return getInLinksFromNodeMap().get(node);
	}

	public void resolveReferences(Link link) {
		HashSet<Link> links;

		if (link.begin == this) {
			
			links = this.getOutLinksToNodeMap().get(link.end);
			if (links == null) {
				links = new HashSet<Link>();
				this.getOutLinksToNodeMap().put(link.end, links);
			}
			links.add(link);
			
		} else if (link.end == this) {
			
			links = this.getInLinksFromNodeMap().get(link.begin);
			if (links == null) {
				links = new HashSet<Link>();
				this.getInLinksFromNodeMap().put(link.begin, links);
			}
			
			links.add(link);
		}
	}

	public Long getLongId() {
		return Long.parseLong(getId().toString());
	}

	public void setId(Long id) {
		setId(id.toString());
	}

	public boolean isTerminal() {
		return getTypeString().equals("Terminal");
	}

	public String getNameString() {
		return (getName() == null) ? null : getName().toString();
	}

	public String getTypeString() {
		return (getType() == null) ? null : getType().toString();
	}
}
