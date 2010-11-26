// Created by plusminus on 6:25:54 PM - Mar 27, 2009
package org.androad.sys.ors.adt.ts;

import java.util.Collection;
import java.util.List;

import org.andnav.osm.util.BoundingBoxE6;
import org.andnav.osm.util.GeoPoint;
import org.andnav.osm.views.overlay.OpenStreetMapViewOverlayItem;

/**
 * 
 * @author Nicolas Gramlich
 *
 * @param <T>
 */
public interface ISpatialDataOrganizer<T extends OpenStreetMapViewOverlayItem> {
	public abstract List<T> getItems();

	public abstract void add(final T pItem);

	public abstract void addAll(final Collection<T> pItems);

	public abstract void buildIndex();

	public abstract GetMode getGetMode();

	public abstract List<T> getClosest(final GeoPoint pGeoPoint, final int pCount);
	public abstract List<T> getWithinBoundingBox(final BoundingBoxE6 pBoundingBoxE6, final int pCount);

	public void clearIndex();

	public abstract boolean isIndexBuilt();

	public static enum GetMode{
		CLOSEST, BOUNDINGBOX;
	}
}