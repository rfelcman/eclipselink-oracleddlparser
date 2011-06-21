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
 *     Mike Norman - June 10 2011, created DDL parser package
 ******************************************************************************/
package org.eclipse.persistence.tools.dbws.metadata;

public class VarChar2Type extends VarCharType {

	static final String TYPENAME = "VARCHAR2";
	
    public VarChar2Type() {
        super(VarCharType.DEFAULT_SIZE);
        this.typeName = TYPENAME;
    }
    public VarChar2Type(long size) {
        super(size);
        this.typeName = TYPENAME;
    }
	public VarChar2Type(String typeName, long size) {
        super(size);
        this.typeName = typeName;
	}
	
	@Override
	public void accept(DatabaseTypeVisitor visitor) {
		visitor.visit(this);
	}

}