/*******************************************************************************
 * Copyright (c) 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Mike Norman - June 10 2010, created DDL parser package
 ******************************************************************************/
package org.eclipse.persistence.tools.dbws.metadata;

abstract class DatabaseTypeBase {

	protected String typeName;
	
	public DatabaseTypeBase(String typeName) {
		this.typeName = typeName;
	}
	
	public String getTypeName() {
		return typeName;
	}

	public boolean isComplex() {
		return true;
	}

	public boolean isResolved() {
		return true;
	}

	@Override
	public String toString() {
		return typeName;
	}
}