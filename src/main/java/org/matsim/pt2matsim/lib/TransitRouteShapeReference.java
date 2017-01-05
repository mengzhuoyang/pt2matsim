/* *********************************************************************** *
 * project: org.matsim.*
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2016 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */

package org.matsim.pt2matsim.lib;

import org.matsim.api.core.v01.Id;
import org.matsim.pt.transitSchedule.api.TransitLine;
import org.matsim.pt.transitSchedule.api.TransitRoute;

/**
 * Interface to store the shape id belonging to transit routes.
 *
 * @author polettif
 */
public interface TransitRouteShapeReference {

	/**
	 * @return the shape id corresponding to the given transit route
	 */
	Id<RouteShape> getShapeId(Id<TransitLine> transitLineId, Id<TransitRoute> transitRouteId);

	/**
	 * Sets the shape id for a transit route
	 */
	void setShapeId(Id<TransitLine> transitLineId, Id<TransitRoute> transitRouteId, Id<RouteShape> shapeId);

	/**
	 * Writes the shape reference to a csv file with the header
 	 * <tt>transitLineId, transitRouteId, shapeId</tt>
	 */
	void writeToFile(String filename);

	/**
	 * Reads shape references from a csv file with the header
	 * <tt>transitLineId, transitRouteId, shapeId</tt>
	 */
	void readFile(String routeShapeRefFile);

}