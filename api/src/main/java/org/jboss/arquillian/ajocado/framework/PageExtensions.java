package org.jboss.arquillian.ajocado.framework;

import java.util.List;

public interface PageExtensions {
	void loadFromResources(List<String> resourceNames);

	boolean isInstalled();

	public void install();
}