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
		} else if (link.end == this) {
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
		return (name == null) ? null : name.toString();
	}

	public String getTypeString() {
		return (type == null) ? null : type.toString();
	}
}
