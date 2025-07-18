/*
 * Copyright (c) 2011, 2025 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Mike Norman - June 10 2011, created DDL parser package
package org.eclipse.persistence.tools.oracleddl.util;

//javase imports
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBMSMetadataSessionTransformsFactory implements DBMSMetadataSessionTransforms {

    public static final String TRANSFORMS = "transforms.properties";

    public DBMSMetadataSessionTransformsFactory() {
    }

    public Properties getTransformProperties() {
        InputStream is = DBMSMetadataSessionTransformsFactory.class.getResourceAsStream(TRANSFORMS);
        if (is != null) {
            Properties transformsProperties = new Properties();
            try {
                transformsProperties.load(is);
                return transformsProperties;
            } catch (IOException e) {
                // ignore
            } finally {
                try {
                    is.close();
                } catch (IOException ex) {
                    //ignore
                }
            }
        }
        return null;
    }

}
