/*
 * Paprika - Detection of code smells in Android application
 *     Copyright (C)  2016  Geoffrey Hecht - INRIA - UQAM - University of Lille
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as
 *     published by the Free Software Foundation, either version 3 of the
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package fr.inria.sniffer.detector.neo4j;

import org.neo4j.cypher.CypherException;

import java.io.IOException;

/**
 * Created by Geoffrey Hecht on 17/08/15.
 */
public abstract class FuzzyQuery extends Query {
    protected String fclFile;

    public FuzzyQuery(QueryEngine queryEngine, String smellName) {
        super(queryEngine, smellName);
    }

    public abstract void executeFuzzy(boolean details) throws CypherException, IOException;
}
