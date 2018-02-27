package secretariatecnicadedrogasec.gps;

import android.location.Geocoder;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.identity.intents.Address;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class principal extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    LatLng seted = new LatLng(-3.996335, -79.202382);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Geocoder geocoder;
        List<android.location.Address> addresses;
        geocoder = new Geocoder(this, Locale.getDefault());
        String calle = "";

        try{
            addresses = geocoder.getFromLocation(seted.latitude, seted.longitude, 1);
            calle = addresses.get(0).getAddressLine(0);

        }catch (IOException e){

            e.printStackTrace();

        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        mMap.addMarker(new MarkerOptions().position(seted).title("Secretaria Tecnica de Drogas del Ecuador").draggable(true).snippet("Cuidad")); //para personalizar el icono necesitamos .icon(BitmapDescriptorFactory.fromResourse(R.drawable.iconoGoogleMaps);
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(seted));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(13f));

        // para el adaptador de informacion del marcador

        mMap.setInfoWindowAdapter(new UserInfoWindowAdapter(getLayoutInflater()));
    }
}
