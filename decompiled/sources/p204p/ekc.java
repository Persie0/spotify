package p204p;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class ekc extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final ArrayList f60424a;

    /* JADX INFO: renamed from: b */
    public final Context f60425b;

    public ekc(Context context, ArrayList arrayList) {
        this.f60424a = arrayList;
        this.f60425b = context;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f60424a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (fkc) this.f60424a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f60425b).inflate(R.layout.simple_list_item_1, viewGroup, false);
            TextView textView = (TextView) view.findViewById(R.id.text1);
            fkc fkcVar = (fkc) this.f60424a.get(i);
            textView.setText(fkcVar.f70521a);
            if (fkcVar.f70522b) {
                textView.setTextColor(-16777216);
                return view;
            }
            textView.setTextColor(-7829368);
            textView.setEnabled(false);
            textView.setOnClickListener(null);
        }
        return view;
    }
}
