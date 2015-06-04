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
package eu.artist.reusevol.repo.server.service;

import javax.inject.Inject;
import javax.jcr.Session;

import org.jcrom.Jcrom;
import org.jcrom.dao.AbstractJcrDAO;

import eu.artist.reusevol.repo.common.model.RepoPackage;

public class PackageDAO extends AbstractJcrDAO<RepoPackage> {

	@Inject
	public PackageDAO(Session session, Jcrom jcrom) {
		super(RepoPackage.class, session, jcrom);
	}

	/**
	 * @return the session
	 */
	public Session getSession() {
		return session;
	}

	/**
	 * @return the jcrom instance
	 */
	public Jcrom getJcrom() {
		return jcrom;
	}
}
