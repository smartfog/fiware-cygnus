/**
 * Copyright 2016 Telefonica Investigación y Desarrollo, S.A.U
 *
 * This file is part of fiware-cygnus (FI-WARE project).
 *
 * fiware-cygnus is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * fiware-cygnus is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with fiware-cygnus. If not, see
 * http://www.gnu.org/licenses/.
 *
 * For those usages not covered by the GNU Affero General Public License please contact with iot_support at tid dot es
 */
package com.telefonica.iot.cygnus.backends.cartodb;

/**
 *
 * @author frb
 */
public interface CartoDBBackend {
    
    /**
     * Gets it the given table is empty ot not.
     * @param tableName
     * @return True if the given table is empty, false otherwise
     * @throws Exception
     */
    boolean isEmpty(String tableName) throws Exception;
    
    /**
     * Creates a table with the given name.
     * @param schema
     * @param tableName
     * @param fields
     * @throws Exception
     */
    void createTable(String schema, String tableName, String fields) throws Exception;
    
    /**
     * Inserts the given rows regarding the given fields in the given table; withs are prefixed to the query.
     * @param tableName
     * @param withs
     * @param fields
     * @param rows
     * @throws java.lang.Exception
     */
    void insert(String tableName, String withs, String fields, String rows) throws Exception;
    
} // CartoDBBackend
