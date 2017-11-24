package yuni.tgs_marker_triyuningsih_15421033;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView map = (MapView) findViewById(R.id.map);

        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);
        GeoPoint startPoint = new GeoPoint(-4.949326, 105.190230);
        IMapController mapController = map.getController();
        mapController.setZoom(15);
        mapController.setCenter(startPoint);

        Marker startMarker = new Marker(map);
        startMarker.setPosition(startPoint);
        startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker);
        map.invalidate();
        startMarker.setIcon(getResources().
                getDrawable(R.drawable.rumahku));
        startMarker.setTitle("rumahku");

        GeoPoint startPoint1 = new GeoPoint(-5.3819852, 105.2600886);
        IMapController mapController1 = map.getController();
        mapController.setCenter(startPoint1);

        Marker startMarker1 = new Marker(map);
        startMarker1.setPosition(startPoint1);
        startMarker1.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker1);
        map.invalidate();
        startMarker1.setIcon(getResources().
                getDrawable(R.drawable.mkb));
        startMarker1.setTitle("Mall Bumi Kedaton");

        GeoPoint startPoint2 = new GeoPoint(-5.3797433, 105.2512951);
        IMapController mapController2 = map.getController();
        mapController.setCenter(startPoint2);

        Marker startMarker2 = new Marker(map);
        startMarker2.setPosition(startPoint2);
        startMarker2.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker2);
        map.invalidate();
        startMarker2.setIcon(getResources().
                getDrawable(R.drawable.ubls1));
        startMarker2.setTitle("Sarjana universitas Bandar Lampung");

        GeoPoint startPoint3 = new GeoPoint(-5.3757702, 105.2462424);
        IMapController mapController3 = map.getController();
        mapController.setCenter(startPoint3);

        Marker startMarker3 = new Marker(map);
        startMarker3.setPosition(startPoint3);
        startMarker3.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker3);
        map.invalidate();
        startMarker3.setIcon(getResources().
                getDrawable(R.drawable.ubls2));
        startMarker3.setTitle("Pascasarjana UBL");

        GeoPoint startPoint4 = new GeoPoint(-5.372220, 105.240891);
        IMapController mapController4 = map.getController();
        mapController.setCenter(startPoint4);

        Marker startMarker4 = new Marker(map);
        startMarker4.setPosition(startPoint4);
        startMarker4.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker4);
        map.invalidate();
        startMarker4.setIcon(getResources().
                getDrawable(R.drawable.musium));
        startMarker4.setTitle("Musium Lampung");
        
    }
}
