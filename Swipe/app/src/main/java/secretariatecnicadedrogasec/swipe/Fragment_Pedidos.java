package secretariatecnicadedrogasec.swipe;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/*
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_Pedidos.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_Pedidos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Pedidos extends Fragment {
    View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fm_pedidos, container, false);
        return rootView;
    }
}
