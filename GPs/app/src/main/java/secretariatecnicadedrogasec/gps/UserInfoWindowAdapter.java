package secretariatecnicadedrogasec.gps;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by dapat on 03/10/2016.
 */

public class UserInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {
    LayoutInflater inflater = null;

    UserInfoWindowAdapter(LayoutInflater inflater){
        this.inflater=inflater;
    }
    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {

        View infoWindows = inflater.inflate(R.layout.user_info_windows, null);
        TextView tittle = (TextView)infoWindows.findViewById(R.id.tittle);
        TextView descripcion = (TextView)infoWindows.findViewById(R.id.snippet);
        TextView segundotxt = (TextView)infoWindows.findViewById(R.id.txt2);

        tittle.setText(marker.getTitle());
        descripcion.setText(marker.getSnippet());
        segundotxt.setText("Texto segundo");
        return (infoWindows);
    }
}
