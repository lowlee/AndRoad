// Created by plusminus on 22:01:11 - 29.09.2008
package org.androad.osm.views.overlay;

import org.andnav.osm.util.GeoPoint;
import org.andnav.osm.views.OpenStreetMapView;
import org.andnav.osm.views.OpenStreetMapView.OpenStreetMapViewProjection;
import org.andnav.osm.views.overlay.OpenStreetMapViewOverlay;

import org.androad.R;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

/**
 * 
 * @author Nicolas Gramlich
 *
 */
public class OSMMapViewSimpleLocationOverlay extends OpenStreetMapViewOverlay {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final Paint mPaint = new Paint();

	private final Bitmap PERSON_ICON;
	/** Coordinates the feet of the person are located. */
	private final android.graphics.Point PERSON_HOTSPOT = new android.graphics.Point(24,39);

	private GeoPoint mLocation;

	// ===========================================================
	// Constructors
	// ===========================================================

	public OSMMapViewSimpleLocationOverlay(final Context ctx){
        super(ctx);
		this.PERSON_ICON = BitmapFactory.decodeResource(ctx.getResources(), R.drawable.person);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public void setLocation(final GeoPoint mp){
		this.mLocation = mp;
	}

	// ===========================================================
	// Methods from SuperClass/Interfaces
	// ===========================================================

	public void release() {
		this.PERSON_ICON.recycle();
	}

	@Override
	protected void onDrawFinished(final Canvas c, final OpenStreetMapView osmv) {
		return;
	}

	@Override
	public void onDraw(final Canvas c, final OpenStreetMapView osmv) {
		if(this.mLocation != null){
			final OpenStreetMapViewProjection pj = osmv.getProjection();
			final Point screenCoords = new Point();
			pj.toMapPixels(this.mLocation, screenCoords);

			c.drawBitmap(this.PERSON_ICON, screenCoords.x - this.PERSON_HOTSPOT.x, screenCoords.y - this.PERSON_HOTSPOT.y, this.mPaint);
		}
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
