/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.common.util.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class AnyTypeAdapter extends XmlAdapter<Object, Object> {
	@Override
	public Object unmarshal(Object v) {
		return v;
	}

	@Override
	public Object marshal(Object v) {
		return v;
	}
}
