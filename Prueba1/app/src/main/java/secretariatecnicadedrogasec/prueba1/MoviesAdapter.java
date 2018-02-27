package secretariatecnicadedrogasec.prueba1;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by dapat on 26/09/2016.
 */

public class MoviesAdapter extends BaseExpandableListAdapter{
    private Fragment_Informacion ctx;
    private HashMap<String, List<String>> Movies_Category;
    private List<String> Movies_List;

    public MoviesAdapter (Fragment_Informacion ctx, HashMap<String, List<String>> Movies_Category, List<String> Movies_List){

        this.ctx = ctx;
        this.Movies_Category = Movies_Category;
        this.Movies_List = Movies_List;
    }

    @Override
    public int getGroupCount() {
        return Movies_List.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {

        return Movies_Category.get(Movies_List.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return Movies_List.get(groupPosition);
    }

    @Override
    public Object getChild(int parent, int child) {

        return Movies_Category.get(Movies_List.get(parent)).get(child);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int parent, int child) {
        return child;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int parent, boolean isExpanded, View convertView, ViewGroup parentView) {
        String group_title = (String) getGroup(parent);
        if(convertView == null){
            LayoutInflater inflator = (LayoutInflater) ctx.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView= inflator.inflate(R.layout.parent_layout, parentView, false);
        }
        TextView parent_textView = (TextView) convertView.findViewById(R.id.parent_txt);
        parent_textView.setTypeface(null, Typeface.BOLD);
        parent_textView.setText(group_title);


        return convertView;
    }

    @Override
    public View getChildView(int parent, int child, boolean lastChild, View convertView, ViewGroup parentView) {

        String child_title = (String) getChild(parent, child);
        if(convertView == null){
            LayoutInflater inflator = (LayoutInflater) ctx.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView= inflator.inflate(R.layout.child_layout, parentView, false);
        }
        TextView child_textView = (TextView) convertView.findViewById(R.id.child_txt);
        child_textView.setTypeface(null, Typeface.BOLD);
        child_textView.setText(child_title);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
